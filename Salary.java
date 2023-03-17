import java.util.Scanner;
public class Salary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of employees");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Given Array");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println("First Highest Salary is : "+ar[n-1]);
        System.out.println("Second Highest Salary is : "+ar[n-2]);
    }
}
