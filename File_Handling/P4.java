import java.io.File;
import java.util.Scanner;
public class FilefolderDemo3
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034/MTech/test.txt");
        ff.delete();
        boolean present = ff.exists();
        System.out.println("Folder present : "+present);
    }
}
