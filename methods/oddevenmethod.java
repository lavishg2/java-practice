
import java.util.Scanner;

public class oddevenmethod {
    static String evenoddcheck(int n){
        if (n%2==0){
            return "EVEN";
        }
        else{
            return "ODD";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number: ");
        int x= sc.nextInt();
        String result= evenoddcheck(x);
        System.out.println(result);
    }
}
