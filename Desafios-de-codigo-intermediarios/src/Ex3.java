
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex3 {

    public static void main(String[] args) {
        List<Integer> totalFatias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int amigos = scanner.nextInt();
            int fatias = scanner.nextInt();
            totalFatias.add(amigos * fatias);
        }
        int soma = 0;
        for (int i = 0; i < totalFatias.size(); i++) {
            soma += totalFatias.get(i);
        }
        int pizzas = soma / 4;
        if (soma % 4 != 0) {
            pizzas++;
        }
        System.out.println(pizzas);
    }
}
