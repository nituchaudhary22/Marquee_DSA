package Operators.Ternary;

public class MaxofThree {
    public static void main(String[] args){
        int num1 = 12;
        int num2 =56;
        int num3 = 23;
        System.out.println((num1>num2) ? (num1>num3? "num1 is big" :"num3 is big"):(num2>num3?"num2 is big":"num3 is big"));
    }
}
