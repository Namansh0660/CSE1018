import java.util.Scanner;
class Box
{
    int length,breadth,height;
    void setDim(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    Box()
    {
        length=-1;
        breadth=-1;
        height=-1;
    }
    Box(int l)
    {
        length=l;
        breadth=l;
        height=l;
    }
    Box(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    int volume()
    {
        return length*breadth*height;
    }
    public static void main(String args[])
    {
        Box b0=new Box();
        b0.setDim(10,8,6);
        Box b1=new Box();
        Box b2=new Box(5);
        Box b3=new Box(1,2,4);
        System.out.println("From b0 we will get : "+b0.volume());
        System.out.println("From b1 we will get : "+b1.volume());
        System.out.println("From b2 we will get : "+b2.volume());
        System.out.println("From b3 we will get : "+b3.volume());
    }
}
