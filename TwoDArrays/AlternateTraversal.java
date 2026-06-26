package TwoDArrays;

import java.util.Arrays;

public class AlternateTraversal {
    public static int[][] alternatetraversal(int[][] matrix){
        int m =matrix.length;
        int n =matrix[0].length;
        int[][] result = new int[m][n];
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    result[i][j] =matrix[i][j];
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    result[i][j] = matrix[i][n-j-1];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = alternatetraversal(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
}
