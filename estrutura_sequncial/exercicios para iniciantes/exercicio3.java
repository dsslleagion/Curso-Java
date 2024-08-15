import java.util.Scanner;

public class exercicio3{
public static void main(String[] args) {
    int a,b,c,d;

    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    int dif = (a * b) - (c *d);

    System.out.println(dif);
}
}