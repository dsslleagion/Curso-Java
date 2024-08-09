//Scanner
// Para fazer entrada de dados, nós vamos criar um objeto do 
//tipo "Scanner" da seguinte forma:

//Scanner sc = new Scanner(System.in);

import java.util.Locale;
import java.util.Scanner;

public class aula{
    public static void main(String[] args) {

        //entrada de texto 
        // Scanner sc = new Scanner(System.in);

        // String x;
        // x = sc.next();
        // System.out.println("você digitou: "+ x);

        // sc.close();

        //entrada de numeros inteiros
        // Scanner sc = new Scanner(System.in);

        // int x;
        // x = sc.nextInt();
        // System.out.println("você digitou: "+ x);

        // sc.close();

        //Entrada de dados com numeros doble
        // Locale.setDefault(Locale.US);
        // Scanner sc = new Scanner(System.in);

        // double x;
        // x = sc.nextDouble();
        
        // System.out.printf("você digitou: %.2f%n", x);

        // sc.close();


        //Entrada de dados caractere
        // Locale.setDefault(Locale.US);
        // Scanner sc = new Scanner(System.in);

        // char x;
        // x = sc.next().charAt(0);
        

        // System.out.println("Digitou: "+ x);

        // sc.close();

        //Entrada de varios dados na mesma linha
        // Scanner sc = new Scanner(System.in);

 
        // String x;
        // int y;
        // double z;
        // x = sc.next();
        // y = sc.nextInt();
        // z = sc.nextDouble();

        

        // System.out.println("Dados digitados:");
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        // sc.close();

        //entrada de dados e leitura até a quebra de linha
    
        // Scanner sc = new Scanner(System.in);

 
        // String x,y,z;
        
        // x = sc.nextLine();
        // y = sc.nextLine();
        // z = sc.nextLine();

        

        // System.out.println("Dados digitados:");
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        // sc.close();

        //quebra de linha pendente 
        
        Scanner sc = new Scanner(System.in);

 
        // int w;
        // String x,y,z;
        // w = sc.nextInt();
        // x = sc.nextLine();//ficou como string vazia e se tornou quebra de linha
        // y = sc.nextLine();
        // z = sc.nextLine();

        

        // System.out.println("Dados digitados:");
        // System.out.println(w);
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        // sc.close();

        //correção 

        int w;
        String x,y,z;
        w = sc.nextInt();
        sc.nextLine();
        x = sc.nextLine();//ficou como string vazia e se tornou quebra de linha
        y = sc.nextLine();
        z = sc.nextLine();

        

        System.out.println("Dados digitados:");
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();


    }
}
