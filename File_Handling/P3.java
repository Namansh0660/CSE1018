
import java.io.File;
import java.util.Scanner;
public class FilefolderDemo2
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034/MTech/inheritance.txt");
        boolean present = ff.exists();
        System.out.println("Folder present : " +present);
        if(present == false)
        try {
        boolean created = ff.createNewFile();
        System.out.println("File Created : "+created);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
