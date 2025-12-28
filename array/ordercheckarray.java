public class ordercheckarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,6};
        boolean sorted = true;
        for(int i=0; i>arr.length-1; i++){
            if(arr[0]>arr[i+1]){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}
