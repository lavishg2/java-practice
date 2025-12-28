class person{
    String name;
    int age;
    void input(String n, int a){
        name = n;
        age = a;
    }
    void output(){
        System.out.println("name = "+ name);
        System.out.println("age = " + age);
    }
}

public class personclass {
    public static void main(String[] args) {
        person person1 = new person();
        person1.input("lavish", 20);
        person1.output();

        person person2 = new person();
        person2.input("lakhvinder singh", 20);
        person2.output();
    }
}
