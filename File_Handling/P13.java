import java.io.*;
class BufferWritingDemo
{
    public static void main(String args[])
    {
        File ff = new File("/home/student/Desktop/22MIA1117/test.txt");
        FileWriter fwriter;
        try{
            fwriter = new FileWriter(ff);
            BufferedWriter bwriter = new BufferedWriter(fwriter);
            bwriter.write("Tamil");
            bwriter.newLine();
            bwriter.write("English");
            bwriter.newLine();
            bwriter.flush();
            bwriter.close();
        }catch(Exception e){
                e.printStackTrace();}
      }
}   
