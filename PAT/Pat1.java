import java.util.Scanner;
public class Main
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int n[]=new int[x];
     for(int i=1;i<=6;i++)
     {
       int num=x%10;
       n[i]=num;
       x/=10;
     }
     for(int i=6;i>=1;i--)
     {
       System.out.print(n[i]+" ");
     }
   }
}
