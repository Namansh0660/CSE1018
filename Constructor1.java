  class Constructordemo1{  
    int id;  
    String name;   
    Constructordemo1(int i,String n)
    {  
    id = i;  
    name = n;  
    }  
    void display()
    {
      System.out.println(id+" "+name);
    }  
    public static void main(String args[])
    {
      Constructordemo1 s1 = new Constructordemo1(111,"Karan");  
      Constructordemo1 s2 = new Constructordemo1(222,"Aryan");  
      s1.display();  
      s2.display();  
   }  
}  
