abstract class Person{
    abstract void show();

}
class Student extends Person{
    public void show(){
        System.out.println("child class");
    }
}

public class abstrct {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.show();
    }
}
