
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> nums = new ArrayList<>();
        String numString = "" + n;
        int soma = 0;
        int produto = 1;
        int diferenca;
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
        for (int i = 0; i < nums.size(); i++) { //calcular soma e produto dos algarismos
            produto = produto * nums.get(i);
            soma += nums.get(i);
        }
        diferenca = produto - soma;
        System.out.println(diferenca);
    }
}
