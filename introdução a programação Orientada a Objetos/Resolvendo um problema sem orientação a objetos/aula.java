/*
 * Fazer um programa para ler as medidas dos lados de dois triangulos x e y (suponha medidaas
 * validas). Em seguida, mostra o valor das areas dos dois triangulos e dizer dos dois triangulos 
 * possui a maior area.
 * 
 * Aformula para calcular a área de um triangulo a partir das medidas de seus lados a,b e c é a 
 * seguinte (Formula de Heron):
 * 
 * exemplo de saida
 * 
 * Enter the measures of triangule X: 
 * 3.00
 * 4.00 
 * 5.00
 * Enter the measures of triangle Y:
 * 7.50
 * 4.50
 * 4.02
 * Triangle X area: 6.000
 * Triangle Y area: 7.5638
 * LArger area:Y
 */

import java.util.Locale;
import java.util.Scanner;

public class aula {
 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        double xA,xB,xC,yA,yB,yC;

        System.out.println("Enter the measure of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measure of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC)/2.0;
        double areaX = Math.sqrt(p*(p - xA)*(p - xB)* (p - xC));

        p = (yA + yB + yC)/2.0;
        double areaY = Math.sqrt(p*(p - yA)*(p - yB)* (p - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("LArger area: X");
        }
        else{
            System.out.println("LArger area: Y");
        }

        sc.close();
    }

    
 }