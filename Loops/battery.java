package Loops;
import java.util.Scanner;
public class battery {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int battery =10;
        int count =0;
        while(battery<100){
            battery += 10;
            count++;
        }
        System.out.println(count);
    }
}
