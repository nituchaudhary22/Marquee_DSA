package TwoDArrays;

import java.util.Arrays;

public class MatrixMultiplication {
    public static int[][] MatrixMultiply(int[][] matrix1,int[][] matrix2){
        int m = matrix1.length;
        int n =matrix1[0].length;
        int[][] res =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] += matrix1[i][j] * matrix2[j][i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = MatrixMultiply(matrix1, matrix2);
        System.out.println(Arrays.deepToString(ans));
    }
}
