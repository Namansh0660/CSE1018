import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        long factorial = fact(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        sc.close();
    }
    public static long fact(int num)
    {
        if (num >= 1)
            return num * fact(num - 1);
        return 1;
    }
}
