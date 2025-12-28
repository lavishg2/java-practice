
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class agecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the age: ");
        int age = sc.nextInt();

        if (age>= 18){
        System.out.println("the person is ADULT");
    }
        else{
            System.out.println("the person is MINOR");
        }
    }
}
