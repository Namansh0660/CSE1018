import java.io.*;
class InputStreamExample
{
    public static void main(String args[])throws Exception
    {
        FileInputStream input1=new FileInputStream("/home/student/Desktop/22MIA1034/MTech/try.txt");
        FileInputStream input2=new FileInputStream("/home/student/Desktop/22MIA1034/MTech/test.txt");
        SequenceInputStream inst = new SequenceInputStream(input1,input2);
        int j;
        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}   
