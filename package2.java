// save by Studeten.java
package cool;
class Studenten
{
    public void output()
    {        
        int a=10,b=15;
        int avg=(a+b)/2;
        System.out.println("Average of students : "+avg);
    }
}

// save by markcalculator.java
package cool;
import cool.Studenten;
class markcalculator
{
    public static void main(String args[])
    {
        Studenten ob = new Studenten();
        ob.output();
    }
}
