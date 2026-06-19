package Loops;

public class loopsbasics {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30}; //for each loop
        for(int num : arr) {
            System.out.println(num);
        }
    }
}
// | Situation                    | Loop       |
// | ---------------------------- | ---------- |
// | Known number of iterations   | `for`      |
// | Unknown number of iterations | `while`    |
// | Must execute at least once   | `do-while` |
// | Traversing arrays/ArrayList  | `for-each` |
