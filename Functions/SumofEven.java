package Functions;

import java.util.Scanner;

public class SumofEven {
    public static int Sum(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                sum +=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start = sc.nextInt();
        int end =sc.nextInt();
        System.out.println(Sum(start, end));
    }
}
