import Method.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double a,b;
        String op;
        Operations calculator=null;
        while(true){
            System.out.println("enter the expression as (val op val)");
            a=scan.nextDouble();
            op=scan.next();
            b=scan.nextDouble();
            if(op.equals("+"))
                calculator=new Addition();
            else if(op.equals("-"))
                calculator=new Substraction();
            else if(op.equals("*"))
                calculator=new Multiplication();
            else if(op.equals("/"))
                calculator=new Division();
            System.out.println(calculator.cal(a,b));
            System.out.println("Enter y to continue to exit enter n");
            scan.nextLine();
            op=scan.nextLine();
            if(!op.equals("y"))
                break;
        }
    }
}