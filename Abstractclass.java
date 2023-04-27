abstract class Member{
    private String name;
    abstract void welcomeMessage();
}
class Student extends Member{
    void welcomeMessage(){
        System.out.println("Hello Student");
    }
}
class Teacher extends Member{
    void welcomeMessage(){
        System.out.println("Hello Teacher");
    }
}
class general{
    void check(Member v)
    {
        System.out.println("checking");
        v.welcomeMessage();
    }
}
public class AbstractcollageDemo{
    public static void main(String args[])
    {
        general m1=new general();
        Student s1=new Student();
        Teacher t1=new Teacher();
        m1.check(s1);
        m1.check(t1);
    }
}
