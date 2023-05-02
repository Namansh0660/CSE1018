import java.util.Scanner;
class StringLearning1
{
    public static void main(String args[])
    {
        String s = new String("abc");
        System.out.println(s);
        String s2="abc";
        System.out.println(s2);
        System.out.println(s2.hashCode());
        s2="pqr";
        System.out.println(s2);
    }
}
