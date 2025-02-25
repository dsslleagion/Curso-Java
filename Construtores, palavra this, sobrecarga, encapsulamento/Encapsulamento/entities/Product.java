package entities;

public class Product {

private String name;
private double price;
private int quantity;


//construtor padrão
public Product(){

}
// adiciona o construtor em uma classe
// quando deseja obrigar que os valores da classe
// não sejam vazios

//o construtor só executa no momento 
//da instanciaçã odo objeto
public Product(String name, double price, int quantity){
    //"this" referencia do proprio objeto
    //primeiro variavel "name" referencia ao atributo da classe,
    // e o segundo name é referencia ao parametro da função construtora
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}

//adicionando sobrecarga
public Product(String name, double price){

    this.name = name;
    this.price = price;
    // this.quantity = 0;
}

public String getName() {
    return name;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public void setName(String Name){
        this.name = name;
}

public double totalValueInStock() {
return price * quantity;
}
public void addProducts(int quantity) {
this.quantity += quantity;
}
public void removeProducts(int quantity) {
this.quantity -= quantity;
}
public String toString() {
return name
+ ", $ "
+ String.format("%.2f", price)
+ ", "
+ quantity
+ " units, Total: $ "
+ String.format("%.2f", totalValueInStock());
}
}