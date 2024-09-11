/*
 * Representam um processamento que possui um significado 
 * - Math.sqrt(double)
 * System.out.println(String)
 * 
 * Principais vantagens: modularização, delegação e reaproveitamento
 * 
 * Dados de Entrada e Saida
 * Funções podem receber dados de entrada(parâmetros ou argumentos)
 * Funções podem ou não retornar uma saída
 * 
 * Em orientação a objetos, funções em classes recebem o nome de "métodos"
 */

import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        // double y = 25.0;
        // double x = Math.sqrt(25.0);

        // System.out.println(x);

        
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
       
        int higher = max(n1,n2,n3);

        showResult(higher);

        sc.close();
    }
    //exemplo de criação de função é usando"public" e "static "que fique disponivel
    
    // função de exemplo5
    

    public static int max(int x , int y, int z){
        int aux;
        if(x > y && x > z){
            aux=x;
        }
        else if(y>z){
            aux=y;
        }
        else{
            aux=z;
        }
        return aux;
    }

    public static void showResult(int  value ){
System.out.println("higher = "+value);
    }
}