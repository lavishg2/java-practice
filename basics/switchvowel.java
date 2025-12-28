
import java.util.Scanner;

public class switchvowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a character: ");
        int value= sc.next().charAt(0);
        switch(value){
            case 'a':
                System.out.println("you entered a vowel");
                break;
            case 'e':
                System.out.println("you entered a vowel");
                break;
            case 'i':
                System.out.println("you entered a vowel");
                break;
            case 'o':
                System.out.println("you entered a vowel");
                break;
            case 'u':
                System.out.println("you entered a vowel");
                break;
            default:
                System.out.println("you entered a constant");
        }
    }
}
