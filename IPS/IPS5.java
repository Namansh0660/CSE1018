import java.util.Scanner;
class Salary 
{
    private double salary;
    private double  hra;
    private double  sa;
    private double  pf;
    private double  netPayableSalary;
    
    public Salary(double salary) 
    {
        this.salary = salary;
        this.hra = 0.5 * salary;
        this.sa = 0.75 * salary;
        this.pf = 0.12 * salary;
        this.netPayableSalary = calculateNetPayableSalary();
    }
    
    public double calculateNetPayableSalary() 
    {
        return salary + hra + sa - pf;
    }

    public void display() 
    {
        System.out.println("Basic salary = " + (int)salary);
        System.out.println("HRA = " + (int)hra);
        System.out.println("Special allowance = " + (int)sa);
        System.out.println("PF = " + (int)pf);
        System.out.println("Net Payable salary = " + (int)netPayableSalary);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        Salary ob = new Salary(salary);
        ob.display();
    }
}
