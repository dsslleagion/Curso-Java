// utilizando o breakpoint é possivel localizar possiveis problemas
// em codigos grandes

//executar ao inves de dar um run executar um debug
//selecionar na linha desejada para ad o brakpoint
// a cada passo executar o "step over" 
// e havera telas mostrando cada passo  e variavel


import java.util.Locale;
import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
 
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n",area);
        System.out.printf("PRECO = %.2f%n", preco);
        
        sc.close();
    }
}
