
class A {
    int age;
    String name;
    void show(int a){
        age = 20;
        System.out.println("age = "+ age);
    }
}
class B extends A{
    void show(int a,String n){
        age = a;
        name=n;
        System.out.println(age);
        System.out.println(name);

    }
}
public class plymrphism {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(20);
        obj.show(20,"lavish");
    }
}
