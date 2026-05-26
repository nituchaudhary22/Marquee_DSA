package Loops;
import java.util.Scanner;
public class checkpower {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();
        
        if(num1%num2==0){
            num1 = num1/num2;
        }
        if(num1==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
