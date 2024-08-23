//escopo de uma variavel : é a região do programa onde a variavel é valida
// ou seja ela pode ser referenciada.

// Uma variavel não pode ser usada se não iniciada

//falaremos de escopo de metodos capitulo 5
public class aula{
    public static void main(String[] args) {
        // double x = 20.0;
        // double price = 400.00;

        double price = 400.00;

        // double discount = 0;

        double discount;
        
        if(price < 200){
            discount = price * 0.1;
        }else{
            discount = 0;
        }
        
        System.out.println(discount);
    }
}