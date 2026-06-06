package Array;

public class MaxConsecutiveBits {
    public static int CountMaximumConsecutiveBits(int[] arr){
        int count0 =0;
        int count1=0;
        int max1 =0;
        int max0=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count0 ++;
                max0 =Math.max(count0,max0);
            }else{
                count0=0;
            }
            if(arr[i] == 1){
                count1++;
                max1=Math.max(count1,max1);
            }else{
                count1=0;
            }
        }
       int max =Math.max(max0,max1);
       return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,0,0,1,1,1};
        System.out.println(CountMaximumConsecutiveBits(arr));
    }
}
