import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class FileReaderDemo1
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1117/test.txt");
        boolean present = ff.exists();
        if(present == true)
        try{
            FileReader fileRead = new FileReader(ff);
            char[] ch=new char[(int)ff.length()];
            System.out.println(ch.length);
            fileRead.read(ch);
            for(char ch1:ch)
            System.out.print(ch1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}   
