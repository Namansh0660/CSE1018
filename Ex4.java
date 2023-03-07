import java.util.Scanner;
public class Ex4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        double sum=n1+n2;
        double diff=n1-n2;
        double mul=n1*n2;
        double div=n1/n2;
        double mod=n1%n2;
        System.out.println("Sum of two Numbers is : "+sum);
        System.out.println("Difference of two Numbers is : "+diff);
        System.out.println("Multiplication of two Numbers is : "+mul);
        System.out.println("Divison of two Numbers is : "+div);
        System.out.println("Modulus of two Numbers is : "+mod);
    }
}
