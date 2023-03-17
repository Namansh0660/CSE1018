import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter number of rows/column");
        //int n=sc.nextInt();
        int n=3;
        int ar[][]=new int[n][n];
        int ec=0,oc=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
                if(ar[i][j]%2==0){
                    ec++;
                }
                else{
                    oc++;
                }
            }
        }
        int p=0,s=0;
        System.out.println("Given Matrix is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j){
                    p+=ar[i][j];
                }
                if(i+j==n-1){
                    s+=ar[i][j];
                }
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        int temp;
        for(int i=0;i<n;i++)
        {
            temp=ar[i][i];
            ar[i][i]=ar[i][n-i-1];
            ar[i][n-i-1]=temp;
        }
        System.out.println("sum of Primary diagonal : "+p+",sum of Secondary diagonal : "+s);
        System.out.println("Total sum of diagonals "+(s+p));
        System.out.println("Matrix after changing the diagonal : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Even numbers Count:"+ec);
        System.out.println("Odd numbers Count:"+oc);
    }
}
