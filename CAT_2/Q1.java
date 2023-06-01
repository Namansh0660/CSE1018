import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        if(isValid(s))
        {
            System.out.println("The Password is Strong.");
        }
        else if(l<8)
        //else if(l<8 || s.contains(">")|| s.contains("<"))
        {
            System.out.println("The Password is invalid.");
        }
        else
        {
            System.out.println("The Password is Weak.");
        }
    }
    public static boolean isValid(String s)
    {
        int length=s.length();
        if(length < 8)
        {
            return false;
        }
        boolean hasDig=false,hasUp=false,haslw=false,hasSpec=false;
        for(char character : s.toCharArray())
        {
            if(Character.isUpperCase(character))
            {
                hasUp=true;
            }
            else if(Character.isLowerCase(character))
            {
                haslw=true;
            }
            else if(Character.isDigit(character))
            {
                hasDig=true;
            }
            else if(!Character.isLetter(character) && !Character.isDigit(character))
            {
                hasSpec=true;
            }
        }
        return hasDig && hasUp && haslw && hasSpec;
    }
}
