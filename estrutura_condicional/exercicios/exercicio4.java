import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Ler a hora inicial e a hora final
        System.out.print("Digite a hora inicial (em horas): ");
        int horaInicial = scanner.nextInt();
        System.out.print("Digite a hora final (em horas): ");
        int horaFinal = scanner.nextInt();

        // Calcular a duração do jogo
        int duracao;
        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        // Verificar se a duração está dentro do intervalo permitido
        if (duracao < 1 || duracao > 24) {
            System.out.println("A duração do jogo deve ser entre 1 e 24 horas.");
        } else {
            System.out.println("A duração do jogo é de " + duracao + " horas.");
        }

        scanner.close();
    }
}
