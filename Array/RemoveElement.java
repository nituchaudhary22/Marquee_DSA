package Array;
import java.util.Arrays;
public class RemoveElement {
    public static int[] RemovingElements(int[] arr,int target){
    //     int count =0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] != target){
    //             count++;
    //         }
    //     }
    //     int[] temp = new int[count];
    //     int index =0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] != target){
    //             temp[index++] = arr[i];
    //         }
    //     }
    //     return temp;
    // }
        int count =0;
        int[] temp = new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] != target) {
           temp[count] = arr[i];
           count++;
         }
    }
    return Arrays.copyOf(temp, count);  //to copy array temp of new length of count..
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4};
        int target = 4;
        int[] ans = RemovingElements(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}

