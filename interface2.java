interface Ridable
{
    void ride();
}
class Car implements Ridable
{
  public void ride()
  {
    System.out.println("You are riding a car");
  }
}
class Bike implements Ridable
{
  public void ride()
  {
    System.out.println("You are riding a bike");
  }
}
class Mechanic
{
    void check(Ridable r)
    {
        System.out.println("Checking");
        r.ride();
    }
}
class interfacedemo3
{
  public static void main(String[] args)
  {
    Mechanic m = new Mechanic();
    Car c = new Car();
    Bike b = new Bike();
    m.check(c);
    m.check(b);
  }
}
