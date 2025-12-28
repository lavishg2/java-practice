import java.util.Arrays;

public class majorityelem {
    public static void main(String[] args) {
        int arr[]={1,5,1,3,2,1,8,1,1,2,2,2,2,2,2,2,2,2};
        // first method

        // int fre=1;
        // int n=arr.length;
        // for(int i=0; i<n; i++){
        //     for (int j=1; j<n; j++){
        //         if(arr[i]==arr[j]){
        //             fre++;
        //         }
        //     }
        //     if(fre>n/2){
        //         System.out.println(arr[i]);
        //         break;
        //     }
        // }

        int n=arr.length;
        Arrays.sort(arr);
        int count=1;
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>n/2){
                System.out.println(arr[i]);
            }
        }

    }
}
