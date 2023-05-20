class example extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(2000);
                System.out.println("Child Thread : "+i);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class Threading
{
    public static void main(String args[])
    {
        example ob = new example();
        System.out.println(ob.getState());
        ob.run();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread : "+i);
        }
    }
}
