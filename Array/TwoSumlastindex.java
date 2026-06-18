package Array;

import java.util.Arrays;

public class TwoSumlastindex{
    public static int[] TwoSum(int[] arr,int target){
        int[] result =new int[]{-1,-1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] +arr[j] == target){
                    result[0] =i;
                    result[1] =j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int target=10;
        int[] arr ={1,2,3,4,2,7,2,8,5}; 
        int[] ans = TwoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
