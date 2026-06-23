package TwoDArrays;
import java.util.Scanner;
public class Basics {
    public static void Print2Darray(){
        Scanner sc =new Scanner(System.in);
        int rows = sc.nextInt();
        int cols =sc.nextInt();
        int[][] arr =new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }    
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Print2Darray();
    }
}
