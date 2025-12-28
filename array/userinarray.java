import java.util.Scanner;

public class userinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students you want to add: ");
        int size = sc.nextInt();

        int age[]= new int[size];

        for(int i=0;i<size; i++){
            age[i]=sc.nextInt();
        }
        System.out.println("students list: ");
        for(int i:age){
        System.out.println(i);
    }
}
}
