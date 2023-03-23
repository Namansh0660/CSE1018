class Box
{
    int l;
    int b;
    int h;
    Box(int l,int b ,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    int volume()
    {
        return l*b*h;
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
