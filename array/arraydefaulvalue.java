public class arraydefaulvalue {
    public static void main(String[] args) {
        int a[]= new int[5];
        a[0]= 23;
        a[1]=24;
        a[2]= 42;
        for(int i:a){
            System.out.println(i);
        }
        double b[] = new double[5];
        b[0]=12;
        b[1]= 3;
        for(double i:b){
            System.out.println(i);
        }
        String c[] = new String[5];
        c[0]= "lavish";
        c[1]= "lakhvinder";
        c[2]= "singh";
        for(String i:c){
            System.out.println(i);
        }
    }
}
