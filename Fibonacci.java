import java.util.Scanner;
public class Fibonacci {
    public static int fibRecursion(int num) {
      if (num == 0) {
        return 0;
      }
      if (num == 1 || num == 2) {
        return 1;
      }
      return fibRecursion(num - 1) + fibRecursion(num - 2);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number till you want to get the fibonacci :");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series of " + n + " numbers is: \n");
        for (int i = 0; i < n; i++) {
        System.out.print(fibRecursion(i) + " ");
      }
    }
  }
  
