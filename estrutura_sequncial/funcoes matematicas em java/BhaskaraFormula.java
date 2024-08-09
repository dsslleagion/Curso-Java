import java.util.Scanner;

public class BhaskaraFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the values of a, b and c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("The equation has no real roots.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("The roots of the equation are: x1 = " + x1 + ", x2 = " + x2);
        }
        
        scanner.close();
    }
}
