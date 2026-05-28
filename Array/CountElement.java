package Array;

import javax.naming.spi.DirStateFactory.Result;

public class CountElement {
    public static int Count(int[] arr,int X){
        int count1 =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<X){
                count1++;
            }
        }
        return count1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,5};
        int X = 5;
        System.out.println(Count(arr, X));
    }
}
