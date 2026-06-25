package TwoDArrays;

import java.util.Arrays;

public class BooleanMatrix {
    public static void BooleanMatrixSetZeroes(int[][] arr){
        int n =arr.length;
        int m =arr[0].length;
        int rowflag =0;
        int colflag =0;
        for(int i=0;i<n;i++){
            if(arr[i][0] == 1){ rowflag =1;
            break;
            }
        }
        for(int j=0;j<m;j++){
            if(arr[0][j] == 1) {colflag =1;
            break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j] == 1){
                    arr[i][0] =1;
                    arr[0][j] =1;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j =1;j<m;j++){
                if(arr[0][j] ==1|| arr[i][0] == 1){
                    arr[i][j] =1;
                }
            }
        }
        if(colflag == 1){
        for(int i=0;i<n;i++){
             arr[i][0] = 1;
        }}
        if(rowflag == 1){
        for(int j=0;j<m;j++){
            if(colflag == 1) arr[0][j] =1;
        }
    }
    }
    public static void main(String[] args) {
        int[][] arr ={{1,0,0},{0,0,0},{0,0,0}};
        BooleanMatrixSetZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
