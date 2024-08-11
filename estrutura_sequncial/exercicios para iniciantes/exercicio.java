import java.util.Locale;
import java.util.Scanner;

public class exercicio{
    public static void main(String[] args) {
        
        // double largura,comprimento,metroQuadrado,area,preco;
        
        // Scanner sc = new Scanner(System.in);

        // largura = sc.nextDouble();
        // comprimento = sc.nextDouble();
        // metroQuadrado = sc.nextDouble();

        // area = largura * comprimento;

        
        // preco = area * metroQuadrado;
       

        //declarando variaveis de modo diferente

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;


        System.out.printf("AREA = %.2f%n",area);
        System.out.printf("PREÇO = %.2f%n",preco);
    }
}