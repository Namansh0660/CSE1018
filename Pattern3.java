public class Pattern3
{
    public static void main(String args[])
    {
        for(int i =0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("* ");
                if(i==2 && j>=1)
                { 
                    break;
                }
            }
            System.out.println();
        }
    }
}
