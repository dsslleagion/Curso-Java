import java.util.Locale;
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numFunc,horas;
        double salario,calc;

        Scanner sc = new Scanner(System.in);

        numFunc = sc.nextInt();
        horas = sc.nextInt();
        salario = sc.nextDouble();

        calc = horas * salario;

        System.out.printf("NUMBER ="+numFunc);
        System.err.printf(" SALARY = %.2f%n",calc);


    }
}
