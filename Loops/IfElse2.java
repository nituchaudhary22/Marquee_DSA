package Loops;

public class IfElse2 {
    public static void main(String[] args) {
         int a=3;
        if(a*2>5 || a/0>1)
        System.out.println("Safe"); //So once the first condition becomes true,Java does NOT check the second condition.
    }
}
//Shortcircuiting -Java stops evaluating a logical expression as soon as the final result is already known.
// It happens with:|| (Logical OR)  ,&& (Logical AND)