//  find the maximum element in array.
//public class maxminarr {
//    public static void main(String[] args) {
//        int number[]= {23,56,57,54,6,34,76,34};
//         int max = number[0];
//         for(int i=1; i<number.length; i++){
//             if(max<number[i]){
//                 max=number[i];
//             }
//         }
//         System.out.println("maximum number = "+max);
//     }
// }
//  find the minimum element in an array
public class maxminarr {
    public static void main(String[] args) {
        int number[]={44,65,76,32,9,75,24,98,65,12};
        int min= number[0];
        for(int i=1; i<number.length; i++){
            if(min>number[i]){
                min=number[i];
            }
        }
        System.out.println("minimum number = "+min);
    }
}