public class sumarray {
    public static void main(String[] args) {
        int number[]= {12,43,65,76,32,65,43,98};
        int sum= 0;
        for(int i=0; i<number.length; i++){
        //   sum+=number[i];
            sum = sum+number[i];
        }
        System.out.println("sum = "+sum);
    }
}
