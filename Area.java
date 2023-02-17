import java.util.Scanner;
class Area 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice\n1\t-\tArea of Square\n2\t-\tArea of Rectangle\n3\t-\tArea of Circle");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter Side of the sqaure");
            int s =sc.nextInt();
            System.out.println("Area of Sqaure : "+(s*s));
            break;

            case 2:
            System.out.println("Enter Length of the Rectangle");
            int l =sc.nextInt();
            System.out.println("Enter Breadth of the Rectangle");
            int b=sc.nextInt();
            System.out.println("Area of Rectangle : "+(l*b));
            break;

            case 3:
            System.out.println("Enter Radius of the circle");
            double r = sc.nextDouble();
            System.out.println("Area of Circle : "+(3.14*r*r));
            break;

            default: System.out.println("Wrong Choice");
        }
    }
}
