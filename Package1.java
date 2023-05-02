//save by A.java  
//in 1st class  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  

//save by B.java  
//in 2nd class
package mypack;  
import pack.A;  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  

//javac -d . A.java
//javac -d . B.java
//java mypack.B


//save by C.java
//in 3rd java
package mypack;
import pack.A;
class C{
    public static void main(String args[])
    {
        A obj = new A();
        obj.msg();
    }
}

//javac -d . A.java
//javac -d . D.ava
//java mypack.D


//save by D.java
//in 4th java
package mypack;
class D
{
    public static void main(String args[])
    {
        pack.A obj = new pack.A();
        obj.msg();
    }
}


//javac -d . A.java
//javac -d . C.java
//java mypack.C


