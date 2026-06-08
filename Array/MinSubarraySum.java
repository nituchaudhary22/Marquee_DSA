package Array;

public class MinSubarraySum {
     public static int minSubArrayLen(int target, int[] nums) {
       for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return j-i+1;
                }
            }
       } 
       return 0;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,nums));
    }
}
