import java.util.*;
public class InputStreamExample          //collectionDemo
{
   public static void main(String args[])
    {
       int a[]=  new  int[5];
       ArrayList<Integer> alist = new ArrayList<Integer>();
        for(int i =1;i<=10;i++)
        alist.add(i);
        System.out.println(alist);
        alist.add(100);
        alist.add(200);
        alist.add(300);
        System.out.println(alist);
     }
}
