class Hi{
    static int x =10;
}
class Hello{
    static int y=5;
}
public class Variables{
    public static void main(String[] args) {
        System.out.println(Hi.x+Hello.y); //static variables(no need to create object)


        // without final shows error
        final byte a =18; // without final a+b becomes int which will show error
        final byte b=15;
        byte c =a+b; //or else use (byte)(a+b) instead of a+b
        System.out.println(c);

    }
 }
