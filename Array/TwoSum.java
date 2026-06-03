package Array;

import java.util.Arrays;

public class TwoSum {
    public static int[] Sum(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int k=4;
        int[] arr ={1,2,3,4,}; 
        int[] ans = Sum(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}
