class Person{
    private  int age;
    void output(){
        System.out.println("age = "+age);
    }
}

public class inheritcls {
    public static void main(String[] args) {
        Person obj = new Person();
        //  obj.age=20;
        obj.output();
    }
}
