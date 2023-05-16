class Expection_Handling
{
    public static void main(String args[])
    {
        int a = 10 , b = 0;
        int c = 0;
        try
        {
            c=a/b;
        }catch(Exception e)
        {
            System.out.println("Expection Occured");
        }
        System.out.println(c);
        System.out.println("End Of Program");
    }
}
