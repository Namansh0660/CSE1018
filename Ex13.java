// Java Program to swap two numbers without
// using temporary variable
import java.io.*;

public class Ex13 {

	public static void main(String args[])
	{
		int x = 10;
		int y = 5;
        System.out.println("Original Value");
        System.out.println("Value of X : "+x);
        System.out.println("Value of Y : "+y);
		x = x + y;
		y = x - y;
		x = x - y;
        System.out.println("Swapping Value");
        System.out.println("Value of X : "+x);
        System.out.println("Value of Y : "+y);
	}
}

