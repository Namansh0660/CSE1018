import java.util.*;
public class Increment
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Post Increment : "+(n++));
System.out.println("Post Decrement : "+(n--));
System.out.println("Pre Increment : "+(++n));
System.out.println("Pre Decrement : "+(--n));
}
}
