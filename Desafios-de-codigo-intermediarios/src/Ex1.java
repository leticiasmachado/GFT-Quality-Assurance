
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //pedra -> 1 flecha
        //papel -> 2 escudo
        //tesoura -> 3 espada
        int j1 = leitor.nextInt();
        int j2 = leitor.nextInt();

        if (j1 == j2) {
            System.out.println("Empatou");
        } else {
            if (j1 == 1) {
                if (j2 == 2) {
                    System.out.println("Perdeu");
                }
                if (j2 == 3) {
                    System.out.println("Ganhou");
                }
            } else if (j1 == 2) {
                if (j2 == 1) {
                    System.out.println("Ganhou");
                }
                if (j2 == 3) {
                    System.out.println("Perdeu");
                }
            } else { //j1 == 3
                if (j2 == 1) {
                    System.out.println("Perdeu");
                }
                if (j2 == 2) {
                    System.out.println("Ganhou");
                }
            }
        }
    }
}
