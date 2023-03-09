public class Methodsdemo1
{
    static double boxcircum(double r)
    {
        double circum;
        circum=2*3.14*r;
        return circum;
    }
    static void printLine()
    {   
        System.out.println("---------------------------");
    }
    public static void main(String args[])
    {
        printLine();
        System.out.println("Hello");
        double circum = boxcircum(6.9);
        System.out.println(circum);
        printLine();
    }
}
