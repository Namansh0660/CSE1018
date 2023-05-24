import java.io.File;
import java.util.Scanner;
public class FilefolderDemo8
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034");
        File[] fileFolderList=ff.listFiles();
        for(File f: fileFolderList)
        {
            if(f.isDirectory())
            System.out.println(f);
        }
    }
}
