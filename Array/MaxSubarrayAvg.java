// Sliding window technique
//given array ,find maximum subarray of size k.
//k is length of subarray
package Array;
public class MaxSubarrayAvg{
    public static double SubarrayAverage(int[] arr,int k){
        int sum =0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int maxAvg =sum;
        for(int j=k;j<arr.length;j++){
            sum = sum - arr[j-k] + arr[j];
            maxAvg= Math.max(maxAvg, sum);
        }
        return (double) maxAvg/k;
    }
    public static void main(String[] args) {
        int[] arr ={1,-4,-5,20,15};
        int k =2;
        System.out.println(SubarrayAverage(arr, k));
    }
}