package Loops;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    int reverse =0;
    int original = num;
    while(num !=0){
    int digit = num%10;
    num /=10;
    reverse = reverse *10 + digit;
    }
    if(reverse == original){
    System.out.println("Palindrome");
    }else{
    System.out.println("Not a palindrome");
    }
}
}
