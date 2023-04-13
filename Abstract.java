abstract class Parent1
{
    public void grow()
    {
        System.out.println("Growing Childen");
    }
    public abstract void study();
}
class child1 extends Parent1
{
    public void study()
    {
        System.out.println("Studying Accountancy");
    }
}
public class abstractdemo
{
    public static void main(String args[])
    {
        child1 ch=new child1();
        ch.grow();
        ch.study();
    }
}
