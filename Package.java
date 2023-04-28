package Mtech;
class student{
    int a,b,c;
    public void add(){
        a=6;
        b=6;
        c=a+b;
        System.out.println("The Answer is : "+c);
    }
}
class mainmethod{
    public static void main(String args[])
    {
        student s1=new student();
        s1.add();
    }
}

//To complie   javac -d . mainmethod.java (javac -d . classname.java)
//To run       java Mtech.mainmethod (java packagename.classname)
