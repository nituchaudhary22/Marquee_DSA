package Functions;

import java.util.Scanner;

public class Hello {
    public static String HelloUser(String name){
        return name;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =sc.next();
        System.out.println("Hello " + HelloUser(name));
    }
}
