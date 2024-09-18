package entities;
//acrescentando um metodo para calcular a area 
//apenas atributos
public class Triangle {

    public double a;
    public double b;
    public double c;

    //criando um metodo
    public double area() {
    double p = (a + b + c)/2.0;
       return Math.sqrt(p*(p - a)*(p - b)* (p - c));
      
    }
    
}
