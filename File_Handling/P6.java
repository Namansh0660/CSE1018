import java.io.File;
import java.util.Scanner;
public class FilefolderDemo5
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034/MTech/try.txt");
        System.out.println("File Name : "+ff.getName());
        File obj = new File("/home/student/Desktop/22MIA1034/MTech/test.txt");
        boolean rename = ff.renameTo(obj);
        System.out.println("File Renamed : "+rename);
        System.out.println("File Name : "+obj.getName());
    }
}
