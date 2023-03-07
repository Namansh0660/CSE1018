import java.util.Scanner;
public class Ex7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int n=sc.nextInt();
System.out.println("Write a program using right shift operators");
System.out.println(n>>2);    // 10/2^2 = 10/4 = 2
System.out.println(n>>2);    // 20/2^2 = 20/4 = 2
System.out.println(n>>3);    // 20/2^3 = 20/8 = 2
}
}
