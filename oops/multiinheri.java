class A{
    void msg1(){
        System.out.println("hello, lavish");
    }
}
class B extends A{

}
class C extends B{

}

public class multiinheri {
    public static void main(String[] args) {
        C obj= new C();
        obj.msg1();
    }
}
