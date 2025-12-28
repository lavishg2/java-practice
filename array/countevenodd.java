public class countevenodd {
    public static void main(String[] args) {
        int arr[]={23,54,56,87,34,87,33,65};
        int even=0, odd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        } 
        System.out.println("Even numbers in array are = "+even);
        System.out.println("Odd numbers in array are = "+odd);
    }
}
