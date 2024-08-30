import java.util.Scanner;

public class PrimosNoIntervalo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número inteiro: ");
        int limite = scanner.nextInt();

        // Chama a função que verifica e exibe os números primos no intervalo
        int totalPrimos = contarPrimosNoIntervalo(limite);

        // Exibe o total de números primos encontrados
        System.out.println("Total de números primos encontrados: " + totalPrimos);
    }

    // Função para verificar e contar números primos no intervalo de 2 até o número fornecido
    public static int contarPrimosNoIntervalo(int limite) {
        int contadorPrimos = 0;

        for (int numero = 2; numero <= limite; numero++) {
            if (isPrimo(numero)) {
                contadorPrimos++;
                System.out.println(numero + " é primo.");
            }
        }

        return contadorPrimos;
    }

    // Método simples para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
