// bubble sort in array
public class bubblesort {
    public static void main(String[] args) {
        int arr[]={5,7,4,3,9,4,7,4,6,7,4,3,6,1};
        int n=arr.length;
        System.out.print("Before sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        } 
        for (int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
