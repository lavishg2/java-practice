public class oddevenfunc {
    public static boolean ifEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(ifEven(8));
    }
}
