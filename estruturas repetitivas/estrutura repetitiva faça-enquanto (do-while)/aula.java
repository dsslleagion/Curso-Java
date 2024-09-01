//estrutura menos utilizada
//o bloco de comandos executa pelo menos uma vez, pois a condição é 
// verificada no final.

//Sintaxe/ regra

//do {
// Comando1
// Comando2
//} while(condição);
//
// ele executa uma vez mesmo se a condição for falsa

import java.util.Locale;
import java.util.Scanner;

public class aula{
    // public static void main(String[] args) {
    
    //     //metodo inedequado porem funcional
    //     while (resp != 'n') {
    //         System.out.print("Digite a Temperatura em Celsius: ");
    //      C = sc.nextDouble();
    //      F = 9.0 * C/5.0 + 32.0;
    //     System.out.printf("Equivalente em Fahrenheit: %.1f%n",F);
    //     System.out.print("Deseja repetir (s/n)?");
    //      resp = sc.next().charAt(0);
    //     }

    //     sc.close();
    // }

    // public static void main(String[] args) {
    //     Locale.setDefault(Locale.US);
    //     Scanner sc = new Scanner (System.in);
        
    //     char resp = 's';
       
    //     while (resp != 'n') {
    //     System.out.print("Digite a Temperatura em Celsius: ");
    //     double C = sc.nextDouble();
    //     double F = 9.0 * C/5.0 + 32.0;
    //     System.out.printf("Equivalente em Fahrenheit: %.1f%n",F);
    //     System.out.print("Deseja repetir (s/n)?");
    //     resp = sc.next().charAt(0);

    //     }

    //     sc.close();
    // }

     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
       
       char resp;
        do{
        System.out.print("Digite a Temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C/5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n",F);
        System.out.print("Deseja repetir (s/n)?");
        resp = sc.next().charAt(0);

        }while(resp != 'n');

        sc.close();
    }
}