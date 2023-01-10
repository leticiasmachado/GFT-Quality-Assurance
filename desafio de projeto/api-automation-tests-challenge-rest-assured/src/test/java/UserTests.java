
import Entities.User;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.config.LogConfig.logConfig;
import io.restassured.http.ContentType;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //a ordem dos testes será definida pela tag @Order
public class UserTests {

    private static User user;

    public static Faker faker;
    public static RequestSpecification request;

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        faker = new Faker(); //utilizado para criar usuários aleatoriamente

        user = new User(faker.name().username(), //pegando username 
                faker.name().firstName(), //pesando 1º nome
                faker.name().lastName(), //pegando último nome
                faker.internet().safeEmailAddress(), //pegando email válido
                faker.internet().password(8, 10), //pegando senha de 8 a 10 caracteres
                faker.phoneNumber().toString()); //pegando telefone
    }

    @BeforeEach
    public void setRequest() {
        request = given()
                .config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .header("api-key", "special-key")
                .contentType(ContentType.JSON);
        //log só irá aparecer se tiver erros
    }

    @Test
    @Order(1) //é necessário definir adequadamente a ordem dos testes para n ocorrer erros
    public void CreateNewUser_ValidUser_ReturnOk() {
        request.body(user)
                .when()
                .post("/user") //é possível criar um arquivo de rotas separados
                .then().assertThat()
                .statusCode(200).and()
                .body("code", equalTo(200))
                .body("type", equalTo("unknown"))
                .body("message", isA(String.class))
                .body("size()", equalTo(3));
    }

    @Test
    public void GetLogin_ValidUser_ReturnOk(){
        request.param("username", user.getUsername())
                .param("password", user.getPassword())
                .when()
                .get("/user/login")
                .then().assertThat()
                .statusCode(200).and()
                //.time(lessThan(2000))
                .body(matchesJsonSchemaInClasspath("loginResponseSchema.json"));
                
    }
    
    @Test
    @Order(2)
    public void GetUserByUsername_ValidUser_ReturnOk() {
        request.when()
                .get("/user/" + user.getUsername())
                .then()
                .assertThat()
                .statusCode(200)
                .and().body("firstName", equalTo(user.getFirstName()));
    }

    @Test
    @Order(3)
    public void DeleteUser_ValidUser_ReturnOk() {
        request.when()
                .delete("/user/" + user.getUsername())
                .then().assertThat()
                .statusCode(200)
                .log();
    }

    @Test
    @Order(4)
    public void CreateNewUser_InvalidUser_ReturnBadRequest() {
        Response response = request.body("test")
                .when()
                .post("/user")
                .then()
                .extract().response();
        Assertions.assertNotNull(response);
        Assertions.assertEquals(400, response.statusCode()); //status code é inválido
        Assertions.assertEquals(true, response.getBody().asPrettyString().contains("unknown"));
        Assertions.assertEquals(3, response.body().jsonPath().getMap("$").size()); //verifica tamanho 
    }
}