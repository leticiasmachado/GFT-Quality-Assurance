
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
 
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();
        
        if(dados>=8){
            dados = dados * 2;
        }
        vidaDoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
        if(vidaDoJogador<=0){
            System.out.println("Jogador nao sobreviveu");
        }else{ //jogador sobreviveu
            vidaDoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);
            if(vidaDoInimigo <= 0){
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            }else{
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
            }
        }
        

    }
}
