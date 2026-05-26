package Functions;
import java.util.Scanner;
public class DigitCount {
    public static int CountDigit(int num){
        int count =0;
        while(num>0){
            int digit =num%10;
            count++;
            num=num/10;
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(CountDigit(num));
    }
}
