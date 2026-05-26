package Switch;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        switch(ch){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                if(num2 !=0){
                    System.out.println(num1/num2);
                }else{
                    System.out.println("exception");

                }
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                if(num2 !=0){
                    System.out.println(num1%num2);
                }else{
                    System.out.println("exception");
                }
                break;
            default:
                System.out.println("Invalid ");
        }
    }
}
