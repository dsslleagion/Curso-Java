import java.util.Locale;
import java.util.Scanner;

public class exercicios6 {
 public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double a,b,c,tringulo,circulo,trapezio,baoquadrado,areadoretangulo;
    double PI = 3.14159;

    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    tringulo = 0.5 * a * c;
    circulo =  PI * Math.pow(c, 2);
    trapezio =  0.5 * (a+b)*c;
    baoquadrado = Math.pow(b, 2);
    areadoretangulo = a*b;

    System.out.printf("TRIANGULO: %.3f%n", tringulo);
    System.out.printf("CIRCULO:  %.3f%n", circulo );
    System.out.printf("TRAPEZIO:  %.3f%n", trapezio);
    System.out.printf("QUADRADO: %.3f%n",baoquadrado);
    System.out.printf("RETANGULO:%.3f%n", areadoretangulo);
 }  

}
