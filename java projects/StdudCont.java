
import java.util.ArrayList;
import java.util.Scanner;

public class StdudCont {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> phoneNumber=new ArrayList<>();
        boolean running=true;
        while(running){
            System.out.println("1.---Add Contact---");
            System.out.println("2.---View Contact---");
            System.out.println("3.---Search Contact by name---");
            System.out.println("4.---Update Contact---");
            System.out.println("5.---Delete---");
            System.out.println("6.---Exit---");
            System.out.println("Which OPERATION do you want to perform:- ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume line.

            switch (choice){
                case 1: //ADD NAMES AND CONTACTS OF STUDENTS.
                    System.out.println("Enter the NAME.");
                    String name=sc.nextLine();
                    names.add(name);
                    System.out.println("Enter the NUMBER.");
                    String numb=sc.nextLine();
                    phoneNumber.add(numb);
                    System.out.println("Number ADDED Successfully.");
                    break;

                case 2: // TO VIEW ALL THE CONTACTS. 
                    if(names.size()==0){
                        System.out.println("Your Contact list is EMPTY! ");
                    }else{
                        for (int i=0; i<names.size(); i++){
                            System.out.println((i+1)+"."+names.get(i)+"-" +phoneNumber.get(i));
                        } 
                    }
                    break;

                case 3: // SEARCH CONTANCT BY NAME.
                    System.out.println("Enter the NAME of contact.");
                    String searchName= sc.nextLine();
                    boolean found=false;
                    for(int i=0; i<names.size(); i++){
                        if(names.get(i).equalsIgnoreCase(searchName)){
                            System.out.println(names.get(i)+"-"+phoneNumber.get(i));
                            found=true;
                            break;
                        }
                        }
                        if(!found){
                            System.out.println("Contact NOT Found! ");
                        }
                    break;

                case 4: // UPDATE CONTACTS(MODIFY).
                    if(names.size()==0){
                        System.out.println("Cannot Update, Contact List is EMPTY! ");
                    }else{
                    System.out.println("which contact you want to UPDATE. ");
                        String searchName2=sc.nextLine();
                        boolean found2=false;
                        for(int i=0; i<names.size(); i++){
                            if(names.get(i).equalsIgnoreCase(searchName2)){
                                System.out.println("What you want to update? \n 1.NAME \n 2.NUMBER");
                                int updation=sc.nextInt();
                                sc.nextLine();
                                if(updation==1){
                                    System.out.println("Enter New NAME. ");
                                    String ch1=sc.nextLine();
                                    names.set(i, ch1);
                                }else if(updation==2){
                                    System.out.println("Enter New NUMBER. ");
                                    String ch2=sc.nextLine();
                                    phoneNumber.set(i, ch2);
                                }else{
                                    System.out.println("INVALID Input!");
                                }
                            System.out.println("Contact UPDATED successfully.");
                                found2= true;
                                break;
                            }
                        }
                        if(!found2){
                            System.out.println("Contact NOT Found");
                        }
                    }

                    break;

                case 5: // DELETE CONTACTS
                    if(names.size()==0){
                        System.out.println("Cannot delete, Contact list is EMPTY! ");
                    }else{
                    System.out.println("Which Contact you want to DELETE.");
                    String searchName3=sc.nextLine();
                    boolean found3=false;
                    for(int i=0; i<names.size(); i++){
                        if(names.get(i).equalsIgnoreCase(searchName3)){
                            System.out.println("Are you sure to DELETE(YES/NO)! \n (1 for yes and 0 for no))");
                            int confirmation=sc.nextInt();
                            if(confirmation==1){
                                names.remove(i);
                                phoneNumber.remove(i);
                                System.out.println("Contact DELETD successfully");
                            }else if(confirmation==0){
                                System.out.println("Deletion CANCELLED");
                            }else{
                                System.out.println("INVALID input");
                            }
                            found3=true;
                            break;
                        }
                    }
                    if(!found3){
                        System.out.println("Contact NOT Found! ");
                    }
                    }
                    break;

                case 6:
                    running=false;
                    System.out.println("GoodBye:)\nsee you again");
                    break;

                default:
                    System.out.println("Input Input.");
            }

            
        }
        sc.close();
    }
   
}