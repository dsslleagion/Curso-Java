import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;


public class executar {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dolar price?");
        double dolar = sc.nextDouble();

        System.out.print("How Many dollars will be bought?");
        double reais = sc.nextDouble();

        double convertido = CurrencyConverter.converterReaisParaDolar(dolar,reais);
        // Aplica o IOF ao valor convertido
        double valorComIof = CurrencyConverter.aplicarIof(convertido);

        System.out.printf("Amount to be paid in reais: %.2f%n", valorComIof);
    }
    
}
