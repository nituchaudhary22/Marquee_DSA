package Array;
import java.util.Arrays;
//this will be used when we know that 1st array size is bigger than the second..
public class ArraySubtractionwithBorrow {
    public static int[] Substraction(int[] arr1,int[] arr2,int n,int m){
        int max = Math.max(n,m);
        int i = n-1;
        int j =m-1;
        int k = max -1;
        int[] result = new int[max];
        int borrow =0;
        while(k>=0){
            int digit1 =0;
            int digit2 =0;
        
        if(i>=0){
            digit1 =arr1[i];
        }
        if(j>=0){
            digit2=arr2[j];
        }
        digit1 = digit1-borrow;
            if(digit1<digit2){
                digit1=digit1+10;
                borrow = 1;
            }else{
                borrow =0;
            }
        
        result[k] = digit1-digit2;
        i--;
        j--;
        k--;
        }
    
    int start =0;
     while (start < result.length - 1 && result[start] == 0) {
            start++;
        }

        int[] ans = new int[result.length - start];

        for (int x = start; x < result.length; x++) {
            ans[x - start] = result[x];
        }

        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        int m =1;
        int[] arr1 = {9,9,9};
        int[] arr2 = {1};
        int[] res = Substraction(arr1,arr2,n,m);
        System.out.println(Arrays.toString(res));
    }
}
