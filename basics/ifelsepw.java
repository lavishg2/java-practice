
import java.util.Scanner;

public class ifelsepw {
    public static void main(String[] args) {
        int origpasswrd= 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter correct password : ");
        int password = sc.nextInt();
        if(password == origpasswrd){
            System.out.println("account opened ");
        }else{
            System.out.println("wrong password ");
        }

    }
}
