public class wrapr {
    public static void main(String[] args) {
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j= a;   // autoboxing
        int b=i.intValue();
        int c=i;
        System.out.println("primitive: "+a);
        System.out.println("wrapper class: "+i);
        System.out.println(j);
        System.out.println(b);
        System.out.println(c);
    }
}
