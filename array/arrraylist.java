
import java.util.ArrayList;
import java.util.Collections;

public class arrraylist {
    public static void main(String[] args) {
        // how to create an array list
        ArrayList<String> list=new ArrayList<String>();
        // how to add element
        list.add("lavish");
        list.add("lakhvinder");
        String element;
        // how to insert an element
        list.add(1,"singh");
        // how to access
        System.out.println(list);
        //get an element from list
        System.out.println(list.get(1)); 
        // change an element
        list.set(0, "lakhvindersingh");
        System.out.println(list.get(0));
        System.out.println(list);
        // how to remove an element from a list
        list.remove(1);
        System.out.println(list);
        // how to remove all the elements of a list
        // list.clear();
        System.out.println("this is new list = "+list); //empty list
        // how to run a loop 
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        // how to sort a list
        Collections.sort(list);
        System.out.println(list);
    }
}
