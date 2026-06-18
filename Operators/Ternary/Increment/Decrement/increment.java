package Operators.Ternary.Increment.Decrement;

public class increment {
    public static void main(String[] args) {
        char ch ='a';
        System.out.println(ch++); // a (post increment) ->b(98)
        System.out.println(ch+2); // 98+2=100

         //
        byte c1 = 127;
        c1++; //out of range(-128 to 127) goes back to -128
        System.out.println((c1));

        //
        byte c2=-128; 
        c2--;
        System.out.println(c2); //127

        //
        byte b1=127;
        b1++;
        System.out.println(b1);
        //byte b3 = b1+3; ->error +3 is int datatype toh nhi add.
        //System.out.println(b3);

        //
         int x = 5;
        System.out.println(x++ + ++x * x++); //(5+7*7)=54 ->check operator precedence
        System.out.println(x); //8

        //
        int z = 1;
        System.out.println(++z + z++ + --z + z--);
        System.out.println(z); //1

        //
        int a = 1;
        ++a; //2
        int b = a++ ; //2
        int c = ++b + b++; //4+2
        System.out.println(c); //6
    }
}
//types of increment and decrement operators
// i = i + 1;  // Assignment + addition
// i += 1;     // Compound assignment
// i++;        // Increment operator
// ++i;        // Pre-increment operator