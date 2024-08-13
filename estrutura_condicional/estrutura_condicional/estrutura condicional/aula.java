// formulas de condições
// estrutura condicional 

// simples
//
// if(<condição){
//  <comando 1>
//  <comando 2>
// }
// Regras SIMPLES: V executa o bloco de comandos se for verdadeiros, F:pula o bloco de comandos 
//
// Composta:
//
//if (<condição>){
//   <comando 1>
//   <comando 2>
//}
//else{
// <comando 3>
// <comando 4>
//}
//Regras: V executa somente o bloco do if ; F: exectuta somente o bloco do else

import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
       
        // simples
        // int x = 5;
        
        // System.out.println("Bom Dia");
        // if(x <= 0){
        //     System.out.println("Bom Tarde");
        // }     
        // System.out.println("Bom Noite");

        // // Composta 
        // int hora;
        // Scanner sc = new Scanner(System.in);
       
        // System.out.println("Quantas horas?");
        // hora = sc.nextInt();
        
        // if(hora <= 12){
        //     System.out.println("Bom Dia");
        // }
        // else{
        //     System.out.println("Boa Tarde");
        // }
        // sc.close(); 

        // Composta com encadeamento porque possui mais de 2 opções de condições do algoritmo
        int hora;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Quantas horas?");
        hora = sc.nextInt();
        
        if(hora <= 12){
            System.out.println("Bom Dia");
        }
        else{
            if(hora <= 18 ){
                System.out.println("Boa tarde");
            }else{
                System.out.println("Boa noite");
            }
            
        }
        sc.close(); 

        
        
    }
}
