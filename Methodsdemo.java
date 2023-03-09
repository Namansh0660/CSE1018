public class Methodsdemo
{
    static int boxvolume(int length,int breadth,int height)
    {
        int vol;
        vol=length*breadth*height;
        return vol;
    }
    static void printLine()
    {   
        System.out.println("---------------------------");
    }
    public static void main(String args[])
    {
        printLine();
        System.out.println("Hello");
        int volume = boxvolume(4,5,6);
        System.out.println(volume);
        printLine();
    }
}
