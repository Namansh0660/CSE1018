import java.util.Scanner;
public class overloading1
{
static void test()
{
System.out.println("Zero arguments");
}
static void test(int a)
{
System.out.println("one arguments");
}
static void test(int a,int b)
{
System.out.println("Two arguments");
}
public static void main(String args[])
{
test();
test(3,4);
test(10);
}
}
