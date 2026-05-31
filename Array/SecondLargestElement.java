package Array;

public class SecondLargestElement {
    public static int Secondlargest(int[] arr){
        if(arr.length == 1) return -1;
        int max =Integer.MIN_VALUE;
        int Second =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                Second =max;
                max = arr[i];
            }else if(arr[i]>Second && arr[i] != max){
                Second=arr[i];
            }

        }
        return Second;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        System.out.println(Secondlargest(arr));
    }
}
