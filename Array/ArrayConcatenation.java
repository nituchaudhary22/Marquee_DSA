package Array;

import java.util.Arrays;

public class ArrayConcatenation {
    public static int[] Concatenation(int[] arr){
        int[] ans = new int[2*arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[i];
            ans[i+arr.length] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,44,4,5};
        System.out.println(Arrays.toString(Concatenation(arr)));
    }
}
