package Array;
import java.util.Arrays;
public class MoveZeroestoEnd {
    public static int[] MoveZeroes(int[] arr){
        int n =arr.length;
        int[] temp = new int[n];
        int tempIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                temp[tempIndex]=arr[i];
                tempIndex++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr ={1,0,2,0,3};
        int[] ans = MoveZeroes(arr);
        System.out.println(Arrays.toString(ans));
    }
}
