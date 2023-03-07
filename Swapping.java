import java.util.*;
public class Swapping
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swapValues(a,b);
    }
    static void swapValues(int m,int n)
    {
        int temp=m;
        m=n;
        n=temp;
        System.out.println("Value of student 1 is : "+m+"\nValue of student 2 is : "+n);
    }
}
