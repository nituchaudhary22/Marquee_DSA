package Functions;
import java.util.Scanner;
public class AreaofCircle {
    public static float AreaofCircle(float r){
        float Area = 3.14f * r * r;
        return Area;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println("Area of circle is: "+ AreaofCircle(r));
    }
}
