import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        float a = 10.0f;
        float b=3.0f;
        float result =a/b;
        System.out.println(result);


        int c = -10;
        int d = 3;
        int n =c%d;
        System.out.println(n);//-1 (if numerator is negative then ans also negative)

       
        float x =34;
        float y= 455;
        float z =43;
        //System.out.println(x<y<z); 
        // nhi hoga (x<y true hoga and true<z nhi ho paayega boolean and int compare nhi hoga)


        System.out.println(20 + 30 +"Java"+ 20 +30); // 50Java2030
        // after string everything will become string


    }
}
//why not using import.java.util.*;
//why camel case in java-case sensitive java is.
//next() and nextLine() difference
//charAt(0) is string method
//methods