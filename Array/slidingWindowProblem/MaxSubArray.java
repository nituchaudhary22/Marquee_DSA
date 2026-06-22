package Array.slidingWindowProblem;

public class MaxSubArray {
    public static int MaximumSubarraySum(int[] arr,int k){
        int sum =0;
        for(int i=0;i<k;i++){
            sum +=arr[i];
        }
        int maxSum =sum;
        for(int j=k;j<arr.length;j++){
            sum = sum -arr[j-k]+arr[j];
            maxSum =Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] ={12,-4,13,-3,23};
        int k=2;
        System.out.println(MaximumSubarraySum(arr, k));
    }
}
