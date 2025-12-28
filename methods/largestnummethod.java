
import java.util.Scanner;
import javax.naming.spi.DirStateFactory;

public class largestnummethod {
    static int largest(int a, int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number: ");
        int x= sc.nextInt();

        System.out.println("enter the second number: ");
        int y= sc.nextInt();

        int ans = largest(x, y);
        System.out.println("largest number is = "+ ans);
    }
}
