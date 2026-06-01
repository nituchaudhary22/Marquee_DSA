package Array;

public class MaxSubArraySum {
    public static void MaxSum(int[] arr){
        int MaxSum =Integer.MIN_VALUE;
        int start =0;
        int end =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
        for(int j=i;j<arr.length;j++){
            sum +=arr[j];
            if(MaxSum<sum){
                MaxSum =sum;
                start = i;
                end =j;
            }

        }
        }
        System.out.println("Maximum sum of subarray is : " + MaxSum);
        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSum(arr);
    }
}
