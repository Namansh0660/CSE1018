import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class FileReaderDemo
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034/test.txt");
        boolean present = ff.exists();
        if(present == true)
        try{
            FileReader fileRead = new FileReader(ff);
            int output = fileRead.read();
            while(output!=-1)
            {
                System.out.println((char)output);
                output = fileRead.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
