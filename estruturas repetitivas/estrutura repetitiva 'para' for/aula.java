// é uma estrutura de controle que repete um bloco de comandos para um certo intervalo
//de valores.
//quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.


//ex:
//fazer um programa que lê um valor inteiro N e depois N numeros inteiros.
//ao final,mostra a soma dos N numeros lidos.

//formula 
//
//for (inicio; condição; incremento){
// comando 1
// comando 2
//}
//
// inicio = executa somente na primeira vez 
// condição = V : executa e volta 
// incremento = executa toda vez de voltar 
//

import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int N = sc.nextInt();

        for(int i = 0; i < N; i = i++){
            int X = sc.nextInt();
            soma = soma + X;
        }

        System.out.println(soma);
        sc.close();
  
//Importante

//perceba que a estrutura 'Para' é otima para se fazer uma repetição baseada em uma contagem:

//Contagem progressiva
for(int i=0; i<5; i++){
    System.out.println("Valor de i:" + i);
}
//Contagem regrassiva
for(int i=4; i<0; i--){
    System.out.println("Valor de i:" + i);
}
}
}