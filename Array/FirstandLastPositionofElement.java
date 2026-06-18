package Array;
import java.util.Arrays;
public class FirstandLastPositionofElement {
    public static int[] FirstandLastPositionofElementinArray(int[] arr,int target){
        int[] result = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] == target && arr[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[]{-1,-1};
    }
    //if there is only one index i.e [1] this will not work
    //use single loop for that
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                if(res[0] ==-1){
                res[0] =i;
            }
            res[1]=i;
        }
        }
        return res;
    }
    public static void main(String[] args) {
        int target = 3;
        int[] arr = {1,3,4,6,8,9,3,2};
        int[] ans = searchRange(arr, target);
        // int[] ans = FirstandLastPositionofElementinArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
