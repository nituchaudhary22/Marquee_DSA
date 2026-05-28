package Array;

public class ArrayDifference {
    public static int[] Difference(int[] arr1,int[] arr2){
        int[] result = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            result[i] = arr1[i]-arr2[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1={2,4,5,6};
        int[] arr2={3,5,6,7};
        int[] result=Difference(arr1, arr2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
