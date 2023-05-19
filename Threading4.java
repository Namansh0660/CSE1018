class Example extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Child thread" + i);
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        Example obj=new Example();
        System.out.println(obj.getState());
        obj.setPriority(1);
        System.out.println(obj.getName());
        obj.setName("Customer");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        for (int i=0;i<5;i++)
        {
            System.out.println("main thread" + i);
        }
        System.out.println(obj.getState());
    }
}
