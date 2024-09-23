import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        Employee employee = new Employee();

        System.out.print("Employee :");
        employee.name = sc.nextLine();

        System.out.print("GrossSalary :");
        employee.GrossSalary = sc.nextDouble();
        
        System.out.print("Tax :");
        employee.Tax = sc.nextDouble();

        employee.showInfo();

        System.out.print("Which percentage to increase Salary?");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("\nUpdated data:");
        employee.showInfo(); 
        sc.close();
    }
}