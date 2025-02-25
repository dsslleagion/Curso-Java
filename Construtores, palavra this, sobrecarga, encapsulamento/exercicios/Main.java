import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String account = sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        BankAccount bankAccount;
        
        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(account, holder, initialDeposit);
        } else {
            bankAccount = new BankAccount(account, holder, 0);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(bankAccount);

        // Depósito
        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.addValueDeposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        // Saque
        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.payValueDeposit(withdraw);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        sc.close();
    }
}
