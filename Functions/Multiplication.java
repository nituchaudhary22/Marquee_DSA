package Functions;
import java.util.Scanner;
public class Multiplication {
    public static int Multiplication (int num1,int num2){
        int multiplication=num1* num2;
        return multiplication;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(Multiplication(num1, num2));
    }

}
