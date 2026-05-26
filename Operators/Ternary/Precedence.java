package Operators.Ternary;

public class Precedence {
    public static void main(String[] args) {
        int a = 2 + 3 * 4;
        System.out.println(a); //14
        System.out.println( 40 / 20 * 4 + 10);
        System.out.println(40 * 20 / 2 + 10);
        System.out.println((12+24 *12) -42);

    }
}
//order:(), unary, *, /, %, +, -, comparison, !, &&, ||