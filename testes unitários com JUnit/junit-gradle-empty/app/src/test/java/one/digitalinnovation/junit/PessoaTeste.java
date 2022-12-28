package one.digitalinnovation.junit;

import java.time.LocalDate;
import java.time.Month;
import main.java.one.digitalinnovation.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    
    @Test
    void validarCalculoDeIdade(){
        Pessoa p = new Pessoa("leticia", LocalDate.of(2002, Month.DECEMBER, 26));
        Assertions.assertEquals(20, p.getIdade()); //resultado esperado da idade da pessoa passada por parâmetro
    }
}
