class Student01
{
    private String name;
    public String getName() 
    {  
        return name;  
    }  
    public void setName(String name) 
    {  
        this.name = name;  
    }  
}
class test
{
    public static void main(String args[])
    {
        Student01 s=new Student01();
        s.setName("VIT");  
        System.out.println(s.getName());
    }
}
