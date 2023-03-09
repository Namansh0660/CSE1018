class Box{
    int length;
    int breadth;
    int height;
}
public class ClassDemo1
{
    public static void main(String args[])
    {
        Box blackbox=new Box();
        blackbox.length=10;
        blackbox.breadth=8;
        System.out.println(blackbox.length);
        System.out.println(blackbox.breadth);
        System.out.println(blackbox.height);
    }
}
