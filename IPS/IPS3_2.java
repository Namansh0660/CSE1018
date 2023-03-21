import java.util.Scanner; 
class Sal
{
    int max1,max2;
    int first(int n,int max1,int ar[])
    {
        for(int i=1;i<n;i++) 
        { 
            if(max1<ar[i]) 
                max1=ar[i]; 
        }
        return max1; 
    }
    int second(int n,int max2,int ar[])
    {
        for(int i=1;i<n;i++) 
        { 
            if((max2<ar[i])&&(ar[i]!=first(n,ar[0],ar))) 
            max2=ar[i];
        }
        return max2;
    }
}
public class Salary1 
{ 
    public static void main(String[]args) 
    {
        Scanner sc = new Scanner(System.in); 
        int ar[]=new int[100]; 
        System.out.print("Enter the no of employees : "); 
        int n=sc.nextInt();  
        System.out.print("Enter salaries of "+n+" emloyees : "); 
        for(int i=0;i<n;i++)
        { 
            ar[i]=sc.nextInt(); 
        }
        Sal ob =new Sal();
        System.out.println("\nThe First highest salary is : "+ob.first(n,ar[0],ar));
        System.out.println("The Second highest salary is : "+ob.second(n,ar[0],ar));
        sc.close();
    } 
} 


 

 

 

 

 
