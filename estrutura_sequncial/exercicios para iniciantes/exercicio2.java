import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.US);
        // Scanner sc = new Scanner(System.in);

        // double x,y,z,calcX, calcY,calcZ;
        
        // x = sc.nextDouble();
        // y  = sc.nextDouble();
        // z  = sc.nextDouble();

        // calcX = x * Math.PI * 2;
        // calcY = y * Math.PI * 2;
        // calcZ = z * Math.PI * 2;

        // System.out.printf("A= %.4f%n",calcX);
        // System.out.printf("A= %.4f%n",calcY);
        // System.out.printf("A= %.4f%n",calcZ);

        //correção
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();


    }
    
}
