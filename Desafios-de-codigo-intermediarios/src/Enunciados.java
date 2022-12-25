public class Enunciados {
    //** EXERCÍCIO 1 **//
    /*
    Você e seus amigos estão em uma aula de criação de jogos. Para inspirar os alunos e 
    treinar, o professor pediu para que vocês fizessem um jogo que já existe com alguma 
    modificação. A escolha de vocês foi "Pedra, Papel e Tesoura" e a modificação foi mudar 
    Pedra para Flecha, Papel para Escudo e Tesoura para Espada.
    Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:
    1 - Flecha
    2 - Escudo
    3 - Espada

    Entrada
    A entrada vão ser dois números representando cada um dos parâmetros. Sendo a primeira 
    entrada o jogador e a segunda o inimigo.

    Saída
    A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas. 
    A saída deve ser sem as aspas.
    
    Entrada: 1 | Saída: empatou
             1  
    Entrada: 1 | Saída: perdeu
             2 
    Entrada: 3 | Saída: ganhou
             2 
    */
    //** EXERCÍCIO 2**//
    /*
    Um número feliz é um número definido pelo seguinte processo:
    • Começando com qualquer número inteiro positivo, substitua o número pela soma dos 
    quadrados de seus dígitos.
    • Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito
    em um ciclo que não inclua 1.
    • Aqueles números para os quais esse processo termina em 1 são felizes.
    • Retorna true se n for um número feliz e false se não for.
    Escreva um algoritmo para determinar se o número n é feliz.

    Entrada
    A entrada será feita por um número inteiro, correpondente ao valor de entrada para 
    verificar se  o número é feliz ou não.

    Saída
    Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.
    Entrada: 19 | Saída: true
    
    Entrada: 2 | Saída: false
    */
    
    //** EXERCÍCIO 3**//
    /*
    Cada pizza é composta por 4 fatias. Há N amigos e cada amigo precisa de exatamente X 
    fatias. Você deverá criar um código capaz de calcular o número mínimo de pizzas que eles 
    devem pedir para satisfazer seu apetite.

    Entrada 
    A primeira linha de entrada conterá um único inteiro T, indicando o número de casos de 
    teste. Cada caso de teste consiste em dois inteiros. N para o número de amigos e X para a
    quantidade de fatia que cada amigo deseja.

    Saída
    Para cada caso de teste, produza o número mínimo de pizzas necessário, conforme o exemplo
    a baixo:
    Entrada: 1 | Saída: 2
             1
             5
    Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 
    fatias. Assim, pelo menos 2 pizzas devem ser encomendadas para ter o número necessário de 
    fatias.
    */
    
    //** EXERCÍCIO 4**//
    /*
    O desafio consiste em um número inteiro n, onde será necessário calcular a diferença 
    entre o produto e a soma dos seus digitos.

    Entrada 
    • Para encontrar o produto do valor, os dígitos deverão ser multiplicados.
    • A soma, basta realizar uma adição entre os dígitos.
    • A diferença, é necessário substrair o resultado final dos dois valores.

    Saída
    A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.
    Exemplo:
    Entrada: 243 |  Saída: 15
    Produto de dígitos = 2 * 3 * 4 = 24
    Soma dos dígitos = 2 + 3 + 4 = 9
    Resultado = 24 - 9 = 15
    */
    
    //** EXERCÍCIO 5**//
    /*
    Você e seus amigos estão jogando uma partida de RPG (Role-Playing Game) utilizando um 
    dado de 10 lados. Em um determinado momento, em uma masmorra escura, o seu personagem foi
    emboscado por um terrível goblin. Como em todo bom RPG, temos alguns parâmetros que 
    definem os status dos personagens:
        Vida: Pontos que devem ser maiores que 0, se não o personagem morre.
        Ataque: Pontos que definem quanto de dano ele inflingirá nos outros personagens.
        Defesa: Pontos que definem quanto dano será mitigado quando ele levar um ataque.
    O dado é um modificador desses parâmetros. Quando você joga o dado o valor dele deve ser 
    somado ao seu ataque ou a sua defesa. Quando o valor do dado for maior que 8 e menor que 
    10, o jogador tira um crítico e essa soma deve ser DOBRADA.
    O dano causado ao jogador é calculado dessa forma:
        vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))
    O dano causado ao inimigo é calculado dessa forma:
        vidaDoInimigo - (ataqueDoJogador + dados)
    Caso o jogador sobreviva a emboscada, ele contra-ataca.
    Para deixar a jogatina mais rápida, fazendo o computador realizar as contas matemáticas, 
    você decidiu criar esse programa para verificar se seu personagem vai sobreviver e 
    contra-atacar ou morrer.

    Entrada
    A entrada serão seis parâmetros nessa ordem:
    - Dados;
    - Vida do Jogador;
    - Ataque do Jogador;
    - Defesa do Jogador
    - Vida do Inimigo;
    - Ataque do Inimigo;

    Saída
    A saída deve ser verificado se o jogador sobreviveu ao ataque ou não. Caso ele tenha 
    sobrevivido, verificar se o contra-ataque dele foi eficaz e matou o inimigo ou não. Em 
    seguida, para cada caso, imprima na tela as respectivas ocorrências.
    Entrada: 2  | Saída: Jogador nao sobreviveu
             6
             6
             4
             5
             14
    
    Entrada: 8  | Saída: Jogador sobreviveu e derrotou o inimigo
             6
             6
             4
             5
             14
    
    Entrada: 6  | Saída:  Jogador sobreviveu e nao derrotou o inimigo
             12
             6
             8
             14
             7
    */
    
}
