
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class method4 {
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number: ");
        int x= sc.nextInt(); 

        System.out.println("ener the second number: ");
        int y= sc.nextInt();

        int result= add(x, y);
        System.out.println("sum= "+result);
    }

}
