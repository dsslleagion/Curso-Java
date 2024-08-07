import java.util.Locale;

public class aula {
    public static void main(String[] args) {

        // escrever comando na tela sem quebra de linha ao final é
        System.out.print("Hello");

        // escrever comando na tela sem quebra de linha é ao final
        System.out.println("Hello");

        // exibir um valor de variavel
        String y = "suamae";
        System.out.println(y);

        // como exibirvalor de variavel para ponto flutuante
        double x = 10.2342342342;
        // printf formata alguma saida, e a formatação abaixo é quantas casas decimais
        // sera exibido
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        // por padrão a formatação está sendo puxada pelo padrão do pais configirado no
        // PC
        // para arrumar isso para o padrão desejado
        // Locale.setDefault(Locale.US);
        // agora no padrão americano deixando o programa localizado com o pais aonde se
        // encontra
        System.out.printf("%.4f%n", x);

        // concatenação
        System.out.println("Ajuda ai " + x + " ou não");

        // concatenar varios elementos em um mesmo comando de escrita
        // System.out.printf("RESULTADO = %2.f metros%n", x);

        // para concatenar varios elementos em um mesmo comando de escrita
        String nome = "Maria";
        int idade = 23;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        // exercicio de fixação

        String Product1 = "Computer";
        String Product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%n Products:%n %s, which price is $  %.2f %n %s, which price is  $ %.2f %n", Product1,  price1,Product2, price2);
        System.out.printf("Record: %s years old, code %d and gender: %s %n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f %n ", measure );
        System.out.printf("(Theree decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);
    }

}
