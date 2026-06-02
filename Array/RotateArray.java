package Array;
import java.util.Arrays;
public class RotateArray{
    public static void Swap(int[] arr ,int i,int j){
      int temp = arr[i];
      arr[i] =arr[j];
      arr[j] =temp;
    }
    public static void Reverse(int[] arr ,int i,int j){
        while(i<j){
            Swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void Rotate(int[] arr,int d){
        int n =arr.length;
        d =d%n;
        Reverse(arr, 0, d-1);
        Reverse(arr, d, n-1);
        Reverse(arr,0,n-1);
    }
     public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int d =2;
        Rotate(arr, d);
        System.out.println(Arrays.toString(arr));
     }
    }
    
