public class Pattern5
{
    public static void main(String args[])
    {
        for(int i =0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==2 && j==2)
                {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
