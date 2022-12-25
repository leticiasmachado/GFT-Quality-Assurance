
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> nums = new ArrayList<>();
        int soma;
        do {
            soma = 0;
            String numString = "" + n;
            int tamanho = numString.length();

            int zeros = 1;
            if (tamanho > 1) { //calcular quantos 0
                for (int i = 1; i < tamanho; i++) {
                    zeros = zeros * 10;
                }
            }

            for (int i = 0; i < tamanho; i++) { //adicionar os algarismos na lista
                int adc = n / zeros;
                n = n - adc * zeros;
                nums.add(adc);
                zeros = zeros / 10;
            }

            for (int i = 0; i < nums.size(); i++) {
                soma = soma + nums.get(i) * nums.get(i);
            }

            if (soma > 9) {
                n = soma;
                nums.clear();
            }
        } while (soma > 9);

        if (soma == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
