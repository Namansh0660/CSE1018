import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class FileWriterDemo
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1034/test.txt");
        boolean present = ff.exists();
        if(present == false)
        try{
            boolean created = ff.createNewFile();
            System.out.println("File Created : "+created);
            FileWriter Writer = new FileWriter(ff);
            Writer.write(65);
            Writer.write("\n How are you");

            Writer.flush();
            Writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
