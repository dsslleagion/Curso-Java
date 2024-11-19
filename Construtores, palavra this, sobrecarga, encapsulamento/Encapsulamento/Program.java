import java.util.Locale;
import java.util.Scanner;
public class Program {

public static void main(String[] args) {

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

Product p = new Product(null, 0, 0);

//Product product = new Product();

// -- proposta de melhoria

// cada atributo quando instanciado com

// Product p = new Product()

// ele inicia os atributos com os respectivos valores de cada atributo e tipo vazio

// null , 0.0 , 0

// o questionamento é , faz sentido reigistrar valores vazios em um produto?

// com intuito de evitar a existencia de produtos sem nome e sem preço, é possivel fazer com que seja "Obrigatoria" a iniciação desses valores?

System.out.println("Enter product data: ");
System.out.print("Name: ");
//product.name = sc.nextLine();
String name = sc.nextLine();

System.out.print("Price: ");
//product.price = sc.nextDouble();
double price = sc.nextDouble();



Product product = new Product(name, price);


//exemplo de acesso privado

product.setName("Computer");

System.out.println();
System.out.println("Product data: " + product);
System.out.println();
System.out.print("Enter the number of products to be added in stock: ");
int quantity = sc.nextInt();

product.addProducts(quantity);
System.out.println();
System.out.println("Updated data: " + product);
System.out.println();
System.out.print("Enter the number of products to be removed from stock: ");

quantity = sc.nextInt();
product.removeProducts(quantity);

System.out.println();
System.out.println("Updated data: " + product);
sc.close();
}
}