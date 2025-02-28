/*
 * ex2 
 * 
 * Fazer um programa para ler um numero inteiro N e os dados (nome e preço)  de N Produtos. 
 * Armazene os N produtos em vetor. Em seguida, mostrar o preço médio dos produtos.
 * 
 * input  | Output: 
 * 3      | AVERAGE PRICE = 700.00
 * TV     |
 * 900.00 |
 * Fryer  |
 * 400.00 |
 * Stove  |
 * 800.00 |
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