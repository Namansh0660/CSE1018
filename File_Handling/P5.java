import java.io.File;
import java.util.Scanner;
public class FilefolderDemo4
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034/MTech/inheritance.txt");
        File obj = new File("/home/student/Desktop/22MIA1034/MTech/try.txt");
        boolean rename = ff.renameTo(obj);
        System.out.println("File Renamed : "+rename);
    }
}
