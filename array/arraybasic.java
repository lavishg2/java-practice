public class arraybasic {
    public static void main(String[] args) {
        int age[]={3,6,4,7,4,7,6,8,2};  // array creation  
        //System.out.println(age[2]);  // array element access
        for (int i=0; i<8; i++){    // access of complete array by for loop 
            System.out.println(age[i]);
        }
        System.out.println("for each");
        for (int i: age){   // for each loop to access compete array
            System.out.println(i);
        }
        
    }
}