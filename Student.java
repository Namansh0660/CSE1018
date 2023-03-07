import java.util.Scanner;
public class Student
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Student Name ");
    String n=sc.nextLine();
    double m[]=new double[10];
    double avg=0;
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter Marks "+(i+1)+" : ");
        m[i]=sc.nextDouble();
    }
    System.out.println("Name : "+n);
    for(int i=0;i<5;i++)
    {
        System.out.println("Marks : "+m[i]);
        avg+=m[i];
    }
    avg=avg/5;
    System.out.println("Average : "+avg);
    if(avg>90 && avg<=100)
    {
        System.out.println("Grade : S");
    }
    else if(avg>=80 && avg<=90)
    {
        System.out.println("Grade : A");
    }
    else if(avg>=70 && avg<80)
    {
        System.out.println("Grade : B");
    }
    else if(avg<=60)
    {
        System.out.println("Grade : C");
    }
    }
}

