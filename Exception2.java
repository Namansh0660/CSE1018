class Exception2 
{
    public static void main(String[] args) 
    {
        int a=10,b=0;
        int c=0;
        try
        {
            int arr[]=null;
            System.out.println(arr[1]);
            c=a/b;   
        }
        catch(NullPointerException e){
            System.err.println("NULLPointerException Error occured");
        }
        catch(ArithmeticException e){
            System.err.println("ArithmeticException Error occured");
        }
        catch(Exception e){
            System.err.println("Error occured");
        }
        finally{
            System.err.println("this gets printed no matter");
        }
        System.err.println(c);
        System.err.println("End of program");
    }
}
