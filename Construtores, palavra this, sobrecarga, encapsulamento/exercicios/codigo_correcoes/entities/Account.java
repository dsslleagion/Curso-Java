package codigo_correcoes.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder){ // construtor que recebe 2 argumentos porque a entreda sera feita assim
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit){ //construtor que recebe 3 argumentos para outra parte do cadastro
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    // public void setNumber(int number) {
    //     this.number = number;
    // } como o numero da conta não pode ser alterado deve se apagar o set do atributo number

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // public void setBalance(double balance) {
    //     this.balance = balance;
    // } o saldo da conta s´´o pode ser alterado por meio de deposito ou saque

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account"
        + number
        + ", Holder: " 
        + holder
        + ", Balance: $"
        +  String.format("%.2f", balance);
    }
    
}
