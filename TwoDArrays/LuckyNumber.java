package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result =new ArrayList<>();
        int m = matrix.length;
        int n =matrix[0].length;
        int[] resultrow = new int[m];
        int[] resultcol = new int[n];
        for(int i=0;i<m;i++){
            int min =matrix[i][0];
           for(int j=1;j<n;j++){
            if(matrix[i][j] < min){
                min = matrix[i][j];
            }
           }
           resultrow[i] =min;
        }
        for(int j=0;j<n;j++){
            int max =matrix[0][j];
            for(int i=1;i<m;i++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
            resultcol[j]=max;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(resultrow[i] == resultcol[j]){
                    result.add(resultrow[i]);
                }
            }
        }

    return result;
    }
    public static void main(String[] args) {
        int[][] matrix ={{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> result = luckyNumbers(matrix);
        System.out.println(result);
    }

}
