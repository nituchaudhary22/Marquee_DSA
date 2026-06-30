package TwoDArrays;

import java.util.Arrays;

public class DiagonalTraverse {
    public static int[] DiagonalTraversal(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        int[] ans =new int[m*n];
        int row=0;
        int col=0;
        int dir =1;
        for(int i=0;i<m*n;i++){
            ans[i] = matrix[row][col];
            if(dir == 1){
                if(col == n-1){
                    row++;
                    dir = -1;
                }
                else if(row == 0){
                    col++;
                    dir =-1;
                }else{
                    row--;
                    col++;
                }
            }
            else{
                if(col==0){
                    row++;
                    dir = 1;
                }else if(row == m-1){
                    col++;
                    dir =1;
                }else{
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] ans={{1,2,3},{4,5,6},{7,8,9}};
        int[] answer =DiagonalTraversal(ans);
        System.out.println(Arrays.toString(answer));
    }
}
