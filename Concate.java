import java.util.*;
class Concate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s1 = sc.next();
        System.out.print("Enter String 2 : ");
        String s2 = sc.next();
        String s3 = s1+s2;
        String s4 = s1.concat(s2);
        System.out.println("Concated String : "+s3);
        System.out.println("Conated String (using function) : "+s4);
    }
}
