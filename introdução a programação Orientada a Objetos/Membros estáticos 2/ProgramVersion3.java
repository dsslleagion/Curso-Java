/*
 * Fazer um programa para ver os dados de um produto 
 * em estoque(nome,preco e quantidade de no estoque). em seguida:
 * 
 * - Mostrar os dados do produto (nome, preco, quantidade no estoque,valor
 * total no estoque)
 * - Realizar uma entrada no estoque e mostrar novamente os dados do produto
 * - Realizar Uma saide no estoque e mostrar novamente os dados do produto
 * Uma Classe .
 * 
*/

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;


public class ProgramVersion3 {

    //metodos estaticos n podem executar sem estar em modo estatico
    //ex o main é estatico se caso eu crio um metodo fora da main 
    //devo cria lo como estatico para poder ser executado fora da main
    //atribuindo final em atributo de classe representa ser uma variavel constante 
    //padrao de nome contante tudo em letra maiuscula
    

    public static void main(String[] args) {
        //versão 1
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}