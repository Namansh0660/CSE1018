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
        alist.add(100);
        alist.add(100);
        System.out.println(alist);
        System.out.println(alist.get(3));
        alist.set(0,95);
        System.out.println(alist);
     }
}
