package Array;

import java.util.Arrays;

public class SortedArraySquares {
    public  static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i]*nums[i];
        }
        // Arrays.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums={3,-1,9,3,-4};
        int[] result = sortedSquares(nums);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    
}
}
