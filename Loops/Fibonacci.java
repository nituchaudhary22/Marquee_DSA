package Loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int num1=0;
        int num2=0;
            for(int i=0;i<=num;i++){
                System.out.println(num1);
                int next = num1+num2;
                num1=num2;
                num2=next;
            }
            
        
    }
}
