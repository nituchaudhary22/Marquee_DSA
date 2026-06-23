package TwoDArrays;
import java.util.Arrays;
public class TransposeMatrix {
    public static void TransposingMatrix(int[][] arr){
        int[][] result = new int[arr[0].length][arr.length]; //rows become cols and vice-versa
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                result[j][i] = arr[i][j];
            }
        }
                System.out.println(Arrays.deepToString(result));
    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        TransposingMatrix(arr);
    }
}
