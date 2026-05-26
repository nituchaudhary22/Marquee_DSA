package Loops;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int sum =0;
        int original =num;
        while(num>0){
            int digit = num%10;
            sum +=(digit*digit*digit);
            num=num/10;
        }
        if(sum == original) {
            System.out.println(original + " is an Armstrong number");
        }
        else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
    }

