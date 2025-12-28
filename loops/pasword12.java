
import java.util.Scanner;

public class pasword12 {
    public static void main(String[] args) {
        String originalPasword= "Password123";
        Scanner sc= new Scanner(System.in);
        String userPassword;
        do { 
            System.out.println("enter your password: ");
            userPassword=sc.nextLine();
            if (originalPasword.equals(userPassword)){
                System.out.println("correct password, welcome.");
                break;
            }else{
                System.out.println("wrong password, try again.");
            }
        } while (true);
    }
}
