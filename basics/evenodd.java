
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("The number is EVEN ");
        }else if(num%2!=0){
            System.out.println("The number is ODD");
        }else{
            System.out.println("Invalid number");
        }

    }
}
