//restrições para nomes de variaveis
//- Não pode começar com digito: use uma letra ou_
//-não pode ter acentos ou til
//- não pode ter espaço em branco
//-usar nomes com significado

//Convenções

//- Camel Case: lastName
//- pacotes
//- atributos
//- metodos
//-variaveis e parametros

//Pascal Case: ProductService
//- classes

public class Account{
    private String holder;
    private Double balance;

    public Account(String Holder,Double balance){
        this.holder = holder;
        this.balance = balance;
    }

    
    public String getHolder() {
        return holder;
    }


    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }


    public static void main(String[] args) {
        
    }
}