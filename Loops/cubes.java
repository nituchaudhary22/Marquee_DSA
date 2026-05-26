package Loops;
import java.util.Scanner;
public class cubes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start =sc.nextInt();
        int end=sc.nextInt();
        for(int i=1;i<=end;i++){
        if(i*i*i>=start && i*i*i<=end){
            System.out.println(i*i*i);
        }
    }
    }
}
