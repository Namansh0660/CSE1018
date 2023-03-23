class Box
{
    int length;
    int breadth;
    int height;
    Box(int l,int b ,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    int volume()
    {
        return length*breadth*height;
    }
}

public class Constructordemo
{
    public static void main(String args[])
    {
        Box blackbox=new Box(10,6,8);
        System.out.println(blackbox.volume());
    }     
}
