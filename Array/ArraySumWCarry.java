package Array;
import java.util.Arrays;
public class ArraySumWCarry {
    public static int[] Sum(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m =arr2.length;
        int i =n-1;
        int j =m-1;
        int max = Math.max(n,m);
        int[] result = new int[max+1];
        int k =max;
        int carry =0;
        while(i>=0 || j>=0){
            int sum =carry;
            if(i>=0){
                sum = sum+arr1[i];
                i--;
            }
            if(j>=0){
                sum =sum+arr2[j];
                j--;
            }
            result[k]=sum%10;
            carry = sum/10;
            k--;
        }
        result[k]=carry;
        return result;

    }
    public static void main(String[] args) {
        int[] arr1 = {9,7,8,9};
        int[] arr2 = {5,7,8};
        int[] ans = Sum(arr1, arr2);
        System.out.println("Sum of Arrays is:" + Arrays.toString(ans));
    }
}
