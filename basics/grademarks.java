
import java.util.Scanner;

public class grademarks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the marks: ");
        int marks= sc.nextInt();

        if(marks>90){
            System.out.println("A grade");
        }else if (marks<=90 && marks>70){
            System.out.println("B grade"); 
        }else if(marks<=70 &&  marks>60){
            System.out.println("C grade ");
        }else if (marks<=60){
            System.out.println("D grade");
        }
    }
}

