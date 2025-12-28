
import java.util.Scanner;

public class negposnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number which you want to check: ");
        int num= sc.nextInt();
        if (num>0){
            System.out.println("the number is positive ");
        }else if (num<0){
            System.out.println("the number is negetive ");
        }else{
            System.out.println("the entered number is zero");
        }
    }
}
