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
