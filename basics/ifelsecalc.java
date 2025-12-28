import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class ifelsecalc {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter first number: ");
        int num1=sc.nextInt();
        System.out.println("enter second number: ");
        int num2= sc.nextInt();
        System.out.println("which operation you want to perform (+,-,%,*,/)");
        char oper=sc.next().charAt(0);

        if (oper=='+'){
            int sum = num1+num2;
            System.out.println(num1+" + "+num2+" = "+sum);
        }else if(oper=='-'){
            int  sub= num1-num2;
            System.out.println(num1+" - "+num2+" = "+sub);
        }else if(oper=='*'){
            int mult= num1*num2;
            System.out.println(num1+" * "+num2+" = "+mult);
        }else if(oper=='%'){
            int div= num1%num2;
            System.out.println(num1+" % "+num2+" = "+div);
        }else if(oper=='/'){
            int fdiv= num1/num2;
            System.out.println(num1+" / "+num2+" = "+fdiv);
        }
    }

}
