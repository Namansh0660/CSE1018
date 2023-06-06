import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String palindrome_string = sc.nextLine();
        StringBuffer buffering = new StringBuffer(palindrome_string);
        buffering.reverse();
        String reversed_string = buffering.toString();
        if(palindrome_string.equalsIgnoreCase(reversed_string))
        {
            System.out.println(palindrome_string+" is a Palindrome String.");
        }
        else
        {
            System.out.println(palindrome_string+" is not a Palindrome String.");
        }
    }
}
