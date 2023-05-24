import java.io.File;
import java.util.Scanner;
public class FilefolderDemo7
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034");
        String[] listofFilesFolders=ff.list();
        for(int i=0;i<listofFilesFolders.length;i++)
        {
            System.out.println(listofFilesFolders[i]);
        }
    }
}
