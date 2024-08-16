import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Tabela de preços dos itens
        final double PRECO_ITEM_1 = 4.00;
        final double PRECO_ITEM_2 = 4.50;
        final double PRECO_ITEM_3 = 5.00;
        final double PRECO_ITEM_4 = 2.00;
        final double PRECO_ITEM_5 = 1.50;

        // Ler o código do item e a quantidade
        System.out.print("Digite o código do item: ");
        int codigoItem = scanner.nextInt();
        System.out.print("Digite a quantidade do item: ");
        int quantidade = scanner.nextInt();

        // Inicializar o valor total
        double valorTotal = 0.0;

        // Determinar o preço com base no código do item
        switch (codigoItem) {
            case 1:
                valorTotal = PRECO_ITEM_1 * quantidade;
                break;
            case 2:
                valorTotal = PRECO_ITEM_2 * quantidade;
                break;
            case 3:
                valorTotal = PRECO_ITEM_3 * quantidade;
                break;
            case 4:
                valorTotal = PRECO_ITEM_4 * quantidade;
                break;
            case 5:
                valorTotal = PRECO_ITEM_5 * quantidade;
                break;
            default:
                System.out.println("Código de item inválido.");
                scanner.close();
                return;
        }

        // Mostrar o valor total da conta a pagar
        System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
