//leetcode 75 - using three pointers - method known as Dutch National Flag Algorithm
package Array;
import java.util.Arrays;
public class SortColors {
    public static void SortColorsinArray(int[] arr){
        int low =0;
        int mid =0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){ // to reverse the array check arr[mid] == 2
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,high,mid);
                high--;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }
    public static void main(String[] args) {
        int[] ans = {1,0,0,2,2,1,0,1};
        SortColorsinArray(ans);
        System.out.println(Arrays.toString(ans));
    }
}
