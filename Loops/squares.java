package Loops;

import java.util.Scanner;

public class squares {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        for(int i=0;i<=num2;i++){
            if(i*i >= num1 && i*i <= num2){
                System.out.println(i*i);
            }
        }
    }
    }

