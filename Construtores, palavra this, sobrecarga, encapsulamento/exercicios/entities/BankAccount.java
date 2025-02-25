package entities;

public class BankAccount {

    private String account;  
    private String holder;
    private double balance;  // Alterado para double

    public BankAccount(String account, String holder, double balance){
        this.account = account;
        this.holder = holder;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void addValueDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito de R$ " + String.format("%.2f", amount) + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void payValueDeposit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Saque de R$ " + String.format("%.2f", amount) + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + account + 
               "\nTitular: " + holder + 
               "\nSaldo: R$ " + String.format("%.2f", balance);
    }
}
