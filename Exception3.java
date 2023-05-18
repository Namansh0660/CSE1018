class throwdemo
{
    static void checkage(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Access Denied");
        }
        else
        {
            System.out.println("Access Granted");
        }
    }
    public static void main(String args[])
    {
        checkage(15);
    }
}
