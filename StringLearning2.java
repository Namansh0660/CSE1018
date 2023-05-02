import java.util.Scanner;
class StringLearning2
{
    public static void main(String args[])
    {
        String s1="TamilNadu";
        String s2="TamilNadu";
        String s3="TamilNadu";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        s1="Kerala";
        System.out.println(s1.hashCode());
    }
}
