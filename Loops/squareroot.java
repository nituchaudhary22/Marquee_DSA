package Loops;
import java.util.Scanner;
public class squareroot {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int num1 = sc.nextShort();
    for(int i=1;i<=num1;i++){
        if(i*i==num1){
            System.out.println(i);
        }
    }
}
}
