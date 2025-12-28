
import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int numbertoguess= ran.nextInt(  100) +1;
        int guess;
        do{
            System.out.println("guess a number: ");
            guess=sc.nextInt();
            if (numbertoguess==guess){
                System.out.println("congrats, you won.");
                break;
            }else if (numbertoguess>guess){
                System.out.println("guessed number is low, try again.");
            }else if(numbertoguess< guess){
                System.out.println("guessed number is high, try again.");
            }

        }while(true);
            
        }
    }