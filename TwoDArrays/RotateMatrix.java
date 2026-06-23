package TwoDArrays;

import java.util.Arrays;

public class RotateMatrix {
    public static void swap(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j]  = arr[j][i];
        arr[j][i] =temp;
    }
    public static void rotate(int[][] arr){
        int n =arr.length;
        //transpose the matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(arr, i, j);
            }
        }
        //reversing the rows
        for(int i=0;i<n;i++){
            int left =0;
            int right =n-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] =temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
