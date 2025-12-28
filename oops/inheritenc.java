class A {
    void show(){
        System.out.println("hello, lavish");
    }
}
    class B extends A{

    }
    public class inheritenc{
        public static void main(String[] args) {
            B obj = new B();
            obj.show();
        }
    }