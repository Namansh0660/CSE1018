import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        System.out.println("MATRIX 1");
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++)
           {
             System.out.println("Enter Value at "+i+","+j+" = ");
             a[i][j]=sc.nextInt();
           }
        }
        System.out.println("MATIRX 2");
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
            System.out.println("Enter Value at "+i+","+j+" = ");
            b[i][j]=sc.nextInt();
          }
        }
        System.out.println("Enter Choice for Matrix Operations");
        System.out.println("+ - * /");
        int ch = sc.next().charAt(0);
        switch(ch)
        {
            case '+':
                for(int i=0;i<3;i++)
                {
                  for(int j=0;j<3;j++)
                  {
                     c[i][j]=a[i][j]+b[i][j];
                     System.out.print(c[i][j]+"  ");
                  }
                System.out.println();
                }
           break;


            case '-':
                for(int i=0;i<3;i++)
                {
                  for(int j=0;j<3;j++)
                  {
                     c[i][j]=a[i][j]-b[i][j];
                     System.out.print(c[i][j]+"  ");
                  }
                System.out.println();
                }
           break;


            case '*':
                for(int i=0;i<3;i++)
                {
                  for(int j=0;j<3;j++)
                  {
                     c[i][j]=a[i][j]*b[i][j];
                     System.out.print(c[i][j]+"  ");
                  }
                System.out.println();
                }
           break;


            case '/':
                for(int i=0;i<3;i++)
                {
                  for(int j=0;j<3;j++)
                  {
                     c[i][j]=a[i][j]/b[i][j];
                     System.out.print(c[i][j]+"  ");
                  }
                System.out.println();
                }
           break;

           default:System.out.println("Wrong Input");
            break;
        }
    }
}
