public class selectsort {
    public static void main(String[] args) {
        int arr[]={2,35,6,74,7,47,4,6,3,5,7,83,2};
        int n=arr.length;
        System.out.println("Before sorting");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        } 
        for(int i=0; i<n; i++){
            int smallest=i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After sorting");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
