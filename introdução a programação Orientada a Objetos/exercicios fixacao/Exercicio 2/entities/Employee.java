

public class Employee {

    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void increaseSalary (double percentage){
        this.GrossSalary += (this.GrossSalary * (percentage/100)) - Tax;
 
    }

    public void showInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Gross Salary :"+ String.format("%.5f", GrossSalary));
        System.out.println("Tax : "+ Tax);
    }
}