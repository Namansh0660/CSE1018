
import java.io.File;
import java.util.Scanner;
public class FilefolderDemo
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034"); // C:\\Users\\Desktop\\22MIA1034 (for windows)
        boolean present = ff.exists();
        System.out.println("Folder present : " +present);
        if(present == false)
        ff.mkdir();
        present = ff.exists();
        System.out.println("Folder present : "+present);
    }
}
