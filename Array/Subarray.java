package Array;

import java.util.Arrays;

public class Subarray {
    public static void print(int[] arr,int start,int end){
        for(int i =start;i<=end;i++){
            System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    public static void PrintAllSubarray(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                print(arr, i, j);
            }

        }
    }
    public static void main(String[] args) {
        int n =4;
        int[] arr ={1,2,3,4};
        PrintAllSubarray(arr, n);
    }
}

