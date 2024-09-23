import java.util.Locale;
import java.util.Scanner;
import entities.Retangle;

class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangle x = new Retangle();
        System.out.print("Enter rectangle width and height:");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();


        double areaX = x.Area();
        double perimeterX = x.Perimeter();
        double diagonaX = x.Diagonal();

        System.out.printf("AREA= %.4f%n", areaX);
        System.out.printf("PERIMETER= %.4f%n", perimeterX);
        System.out.printf("DIAGONAL= %.4f%n", diagonaX);
        
        sc.close();
    }
}