
import java.util.jar.Attributes;

class Student{
    String name ; 
    int age ;
}


public class createclass {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1. name= "lavish";
        s1.age= 20;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
