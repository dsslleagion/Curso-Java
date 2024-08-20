//Operadores de atribuição cumulativa 
// import java.util.Locale;
// import java.util.Scanner;
// public class aula{
//     public static void main(String[] args) {
//         Locale.setDefault(Locale.US);
//         Scanner sc = new Scanner(System.in);

//         int minutos = sc.nextInt();

//         double conta = 50.0;
//         if(minutos> 100){
//             conta = conta + (minutos - 100)* 2.0;
//         }
//         System.out.printf("Valor da conta = R$ %.2f%n", conta);
//         sc.close();
//     }
// }
// acumulação de valores com operações matematica 
// atribuições| logica
// a += b;    | a = a + b;
// a -= b;    | a = a - b;
// a *= b;    | a = a * b;
// a /= b;    | a = a / b;
// a %= b;    | a = a % b;

// aplicação do contexto do codigo 

import java.util.Locale;
import java.util.Scanner;
public class aula{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos> 100){
            conta += (minutos - 100)* 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();
    }
}

