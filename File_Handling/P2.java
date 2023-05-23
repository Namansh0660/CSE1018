
import java.io.File;
import java.util.Scanner;
public class FilefolderDemo1
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034/MTech/CSE/Java"); // C:\\Users\\Desktop\\22MIA1034 (for windows)
        boolean present = ff.exists();
        System.out.println("Folder present : " +present);
        if(present == false)
        ff.mkdirs();           // for multiple folders
        present = ff.exists();
        System.out.println("Folder present : "+present);
    }
}
