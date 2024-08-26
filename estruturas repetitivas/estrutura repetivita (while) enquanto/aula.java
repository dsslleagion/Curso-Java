import java.util.Scanner;

/**
 é uma estrutura de controle que repete um
bloco de comandos enquanto uma condição é verdadeira

quando usar: quando não se sabe previamente a quantidade 
de repetições que será realizada.* aula


formula/sintaxe

regra:
V:executa e volta
F: pula fora

while(condição){
 comando 1 
 comando 2
}

ex:
Fazer um programa que lê numeros inteiros até que um zero seja lido.
ao final mostra a soma dos numeros lidos.
*/
public class aula {

    public static void main(String[] args) {
        //primeira parte para verificar
        // Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // while(x!=0){
        //     x = sc.nextInt();
        // }

        // System.out.println("parabens, você digitou um numero diferente de 0, vou dormir");
        // sc.close();

        //segunda parte

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;
        while(x!=0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
    
}