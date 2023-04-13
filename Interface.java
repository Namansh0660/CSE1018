class Car
{
    void ride()
    {
        System.out.println("You are riding a car");
    }
}
class Bike
{
    void ride()
    {
        System.out.println("You are riding a bike");
    }
}
class Mechanic
{
    void check(Car c)
    {
        System.out.println("checking");
        c.ride();
    }
}
public class InterfaceDemo
{
    public static void main(String args[])
    {
        Mechanic m=new Mechanic();
        Car c=new Car();
        m.check(c);
    }
}
