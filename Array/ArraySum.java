package Array;

public class ArraySum {
    public static int[] Sum(int[] arr1,int[] arr2){
        int[] result=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
                result[i] = arr1[i]+arr2[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,4,4,5};
        int[] result = Sum(arr1, arr2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
