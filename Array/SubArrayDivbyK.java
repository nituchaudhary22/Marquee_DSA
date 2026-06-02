package Array;

public class SubArrayDivbyK {
    public static int SumDivisiblebyK(int[] arr,int k){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum =sum +arr[j];
                if(sum %k==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int k =4;
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println(SumDivisiblebyK(arr, k));
    }
}
