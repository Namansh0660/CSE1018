
import java.util.Scanner;
public class Stud
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner (System.in);
    String s[]=new String[10];
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter Student Name "+(i+1)+" ");
        s[i]=sc.next();
    }
    double m[]=new double[10];
    double avg=0;
    for(int i=0;i<5;i++)
    {
            System.out.println("Enter Marks "+(i+1)+" : ");
            m[i]=sc.nextDouble();
            if(m[i]>0 && m[i]<=100)
            {
                continue;
            }
            else
            {
                System.out.println("Enter Again");
                System.out.println("Enter Marks "+(i+1)+" : ");
                m[i]=sc.nextDouble();
            }
    }
    for(int i=0;i<5;i++)
    {
        System.out.println("Student Name "+s[i]);
    }
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
















