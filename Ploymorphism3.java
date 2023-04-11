class Shape
{  
    void draw(int l,int b)
    {
        System.out.println("drawing...");
    }  
}  
class Rectangle extends Shape
{  
    void draw(int l,int b)
    {
        System.out.println("Area of Rectangle... : "+l*b);
    }  
}  
class Circle extends Shape
{  
    void draw(int r,int r1)
    {
        System.out.println("Area of Circle... : "+(3.14*r*r1));
    }  
}  
class Triangle extends Shape
{  
    void draw(int h,int b)
    {
        System.out.println("Area of Triangle... : "+(0.5*b*h));
    }  
}  
class TestPolymorphism2
{  
    public static void main(String args[])
    {  
        Shape s;  
        s=new Rectangle();  
        s.draw(11,12);  
        s=new Circle();  
        s.draw(12,12);  
        s=new Triangle();  
        s.draw(1,2);  
    }  
} 
