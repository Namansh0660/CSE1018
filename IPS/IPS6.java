import java.util.Scanner;
abstract class Employee
{
    private String name;
    private int age;
    private double salary;
    public Employee(String name,int age,double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        displayRole();
    }
    public abstract void displayRole();
}
class Faculty extends Employee
{
    private String department;
    public Faculty(String name , int age , double salary)
    {
        super(name,age,salary);
    }
    public void displayRole()
    {
        System.out.println("Role: Faculty");
    }
}
class Staff extends Employee
{
    private String role;
    public Staff(String name , int age , double salary)
    {
        super(name,age,salary);
    }
    public void displayRole()
    {
        System.out.println("Role: Staff");
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n1=sc.next();
        int a1 = sc.nextInt();
        int s1 = sc.nextInt();
        String n2= sc.next();
        int a2 = sc.nextInt();
        int s2 = sc.nextInt();
        Faculty faculty = new Faculty(n1,a1,(double)s1);
        Staff staff = new Staff(n2,a2,(double)s2);
        faculty.displayInfo();
        staff.displayInfo();
    }
}
