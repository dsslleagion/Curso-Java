import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ler o salário com duas casas decimais
        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();

        // Inicializar o imposto total
        double imposto = 0.0;

        // Calcular o imposto com base na faixa de salário
        if (salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else {
            imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
        }

        // Mostrar o valor do imposto com duas casas decimais
        System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);

        scanner.close();
    }
}
