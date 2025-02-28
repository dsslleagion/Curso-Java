/*
 * Revisão de vetor
 * declaração e instaciação
 * Manipulação de vetor de Elementos tipo valor(tipo primitivo)
 * Manipulação de vetor de Elementos tipo referência(classe)
 * Acesso aos elementos
 * Propriedade Length
 * 
 * 
 * Vetores 
 * 
 * Em Programação, "vetor" é o nome dado a arranjos unidimencionais
 * 
 * Arranjo (array) é uma estrutura de dados:
 * - homogênia (dados do mesmo tipo)
 * - Ordenada(elementos acessados por meio de posições)
 * - Alocada de uma vez só, em um bloco contíguo de memoria 
 * 
 * Vantagens
 *  - Acesso imediato aos elementos pela sua posição
 * Desvantagens:
 *  - Tamanho fixo
 *  - Dificuldade para realizar inserções e deleções 
 * 
 * 
 * Pratica
 * 
 * Ex1
 * Fazer um programa para ler um numero inteiro N e a altura de N pessoas.
 * Armazene as N alturas em um vetor. Em seguida, mostrar altura média dessas
 * pessoas.
 * 
 * input | Output  
 * 3     | AVERAGE HEIGHT = 1.69
 * 1.72  |
 * 1.56  |
 * 1.80  |
 */

import java.util.Locale;
import java.util.Scanner;

public class aula{

    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double [] vect = new double[n];

        for(int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n" , avg);
        sc.close();
    } 
}