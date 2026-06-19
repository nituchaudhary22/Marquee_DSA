package Array;

import java.util.Arrays;

public class PlusOne {
    public static int[] PlusOneinArray(int[] arr){
        int[] result =new int[arr.length+1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i] =0;
        }
        result[0] =1;
        return result;
    }
    public static void main(String[] args) {
        int[] arr ={4,3,2,9};
        int[] ans = PlusOneinArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
