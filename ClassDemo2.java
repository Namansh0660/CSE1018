class Box{
    int length;
    int breadth;
    int height;
    int volume()
    {
        return length*breadth*height;
    }
}
public class ClassDemo2
{
    public static void main(String args[])
    {
        Box blackbox=new Box();
        blackbox.length=10;
        blackbox.breadth=8;
        System.out.println(blackbox.length);
        System.out.println(blackbox.breadth);
        System.out.println(blackbox.height);
        Box woodbox = new Box();
        woodbox.breadth=10;
        woodbox.height=5;
        int w =woodbox.volume();
        System.out.println("=================================");
        System.out.println(w);
    }
}
