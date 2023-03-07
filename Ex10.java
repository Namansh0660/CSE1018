import java .util.Scanner;
public class Ex10 {
  public static void main(String[] args) {
    
    // create variables
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Value of A : ");
    int a=sc.nextInt();
    System.out.println("Enter Value of B : ");
    int b=sc.nextInt();
      int c = 0;

      c = a + b;
      System.out.println("c = a + b = " + c );

      c += a ;
      System.out.println("c += a  = " + c );

      c -= a ;
      System.out.println("c -= a = " + c );

      c *= a ;
      System.out.println("c *= a = " + c );

      a = 10;
      c = 15;
      c /= a ;
      System.out.println("c /= a = " + c );

      a = 10;
      c = 15;
      c %= a ;
      System.out.println("c %= a  = " + c );

      c <<= 2 ;
      System.out.println("c <<= 2 = " + c );

      c >>= 2 ;
      System.out.println("c >>= 2 = " + c );

      c >>= 2 ;
      System.out.println("c >>= 2 = " + c );

      c &= a ;
      System.out.println("c &= a  = " + c );

      c ^= a ;
      System.out.println("c ^= a   = " + c );

      c |= a ;
      System.out.println("c |= a   = " + c );
   }
}
