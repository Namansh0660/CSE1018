class Vehicle
{
    void ride()
    {    
    }
}
class Car extends Vehicle
{
    void ride()
    {
        System.out.println("You are riding a car");
    }
}
class Bike extends Vehicle
{
    void ride()
    {
        System.out.println("You are riding a bike");
    }
}
class Mechanic
{
    void check(Vehicle v)
    {
        System.out.println("checking");
        v.ride();
    }
}
public class InterfaceDemo
{
    public static void main(String args[])
    {
        Mechanic m=new Mechanic();
        Car c=new Car();
        Bike b=new Bike();
        m.check(c);
        m.check(b);
    }
}
