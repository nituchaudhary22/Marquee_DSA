package Functions;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static double CelsiustoFahrenheit(double c){
        double f = (c*9/5)+32;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double c =sc.nextDouble();
        System.out.println(CelsiustoFahrenheit(c));
    }
}
