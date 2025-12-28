class student {
    String name; 
    int age;
    void showInfo(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

}

public class Main {
    public static void main (String[]args){
    student s = new student();
    s.name = "lavish";
    s.age = 20;
    s.showInfo();
}
}