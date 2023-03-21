import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int time = 31536000;
        int pop = 512052096;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            pop += (time/8)+(time/40)-(time/15);
            System.out.println("Year "+i+" = "+pop);
        }
    }
