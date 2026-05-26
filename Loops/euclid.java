package Loops;
import java.util.Scanner;
public class euclid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int divisor = sc.nextInt(); 
        int dividend = sc.nextInt();
        while(dividend !=0){
            int rem = divisor%dividend;
            divisor=dividend;
            dividend=rem;
        }
        System.out.println(divisor);
    }
}
