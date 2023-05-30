import java.io.*;
class  InputStreamExample                               //outputStreamWriterExample
{
    public static void main(String args[])
    {
try
{
        OutputStream outputStream = new FileOutputStream("/home/student/Desktop/22MIA1034/MTech/try.txt");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("Hello World");
        outputStreamWriter.close();    
}
catch(Exception e)
{
e.getMessage();
}
}
}   
