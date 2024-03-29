import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] lockers = new boolean[n];
        for (int i=1;i<=n;i++)
        {
            shuffle(lockers,i);
        }
        display(lockers);
    }
    public static void shuffle(boolean[] openlocker,  int first) 
    {
        int nextLocker = first;
        for (int i=first-1;i<openlocker.length;i+=nextLocker) 
        {
            openlocker[i]=!openlocker[i];
        }
    }
    public static void display(boolean[] lockers) 
    {
        for (int i=0;i<lockers.length;i++) 
        {
            if (lockers[i]) 
            {
                System.out.println(i+1);
            }
        }
    }
}
