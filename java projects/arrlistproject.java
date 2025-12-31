import java.util.ArrayList;
import java.util.Scanner;
public class arrlistproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks=new ArrayList<>();
        boolean running = true;
        while (running){
            System.out.println("-----MENU-----");
            System.out.println("1:---Add Task---");
            System.out.println("2:---View Task---");
            System.out.println("3:---Remove Task---");
            System.out.println("4:---Exit---");
            System.out.print("which operation do you want to perform ? ");
            int choice = sc.nextInt();
            sc.nextLine(); //consume line

            switch (choice){
                case 1:
                    System.out.println("enter task = ");
                    String task=sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added Succesfully. ");
                    break;
                
                case 2:
                    if(tasks.size()==0){
                        System.out.println("List Is Empty! ");
                    }else{
                    System.out.println("Your Task = ");
                    for(int i=0; i<tasks.size(); i++){
                        System.out.println((i+1)+"."+tasks.get(i));
                    }
                    }
                    break;
                
                case 3:
                    System.out.println("Enter the number of task which you want to remove");
                    int index= sc.nextInt();
                    index=index-1;
                    if(index< 0 || index>=tasks.size()){
                        System.out.println("Invalid Input! ");
                    }else{
                        tasks.remove(index);
                        System.out.println("Task Removed Successfully");
                    }
                    break;
                    
                case 4:
                    running=false;
                    System.out.println("Goodby. see you again.");
                    break;
                    default:
                        System.out.println("Invalid Input!");
            }
        }
        sc.close();
    }
}
