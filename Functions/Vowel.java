package Functions;

import java.util.Scanner;

public class Vowel {
    public static boolean Vowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch=='a' || ch =='e' || ch =='i' || ch=='o'||ch=='u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(Vowel(ch));
    }
}
