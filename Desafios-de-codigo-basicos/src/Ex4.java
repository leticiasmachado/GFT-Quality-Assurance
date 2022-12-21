
import java.util.Scanner;


public class Ex4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();
        int sub = M - S;
        int desconto;
        desconto = sub * 100 / M;

        System.out.println("O desconto foi de " + desconto + "%");
        //TODO:  Retorne o percentual de desconto que foi aplicado no produto
    }
}
