public class largestelement {
    public static void main(String[] args) {
        int arr[]={23,65,86,34,65,78,54};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
            }else if (i>second && i!=first){
                second=i;
            }
                
            }
            System.out.println(first);
            System.out.println(second);
        }
    }
