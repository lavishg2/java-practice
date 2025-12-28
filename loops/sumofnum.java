
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
// sum of numbers till n
public class sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <=n ; i++){
            sum = sum+i;
        }
        System.out.println("sum = "+ sum);
    }
}
