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
import entities.Product;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        
        System.out.println("Enter product data: ");
        System.out.print("Name:  ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product Data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed in stock: ");
        int quantity2 = sc.nextInt();
        product.RemoveProducts(quantity2);

        
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}