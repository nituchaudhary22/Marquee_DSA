package TwoDArrays;

public class Basics {
    public static void Print2Darray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2} ,{2,3,4}, {3,3,4}};
        Print2Darray(arr);
    }
}
