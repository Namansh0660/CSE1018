import java.util.Scanner;
class Main
{
    private String Name;
    private String Color;
    private int year;
    Main(String Name,String Color,int year)
    {
        this.Name=Name;
        this.Color=Color;
        this.year=year;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();
        String Color=sc.nextLine();
        int year=sc.nextInt();
        Main ob=new Main(Name,Color,year);
        System.out.println("Manufacturer:"+ob.Name);
        System.out.println("Color:"+ob.Color);
        System.out.println("Year:"+ob.year);
    }
}
