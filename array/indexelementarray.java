
import java.util.Scanner;

public class indexelementarray {
    public static void main(String[] args) {
        int arr[]={12,43,56,76,87,54,24};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nubmer : ");
        int target= sc.nextInt();
        int index=-1;

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        System.out.println(index);

        }
}
