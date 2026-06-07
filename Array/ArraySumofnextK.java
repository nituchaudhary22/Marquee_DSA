//Print array to next K elements in arrays
package Array;
import java.util.Arrays;
public class ArraySumofnextK {
    public static int[] ArraySumofNextKelements(int[] arr,int k){
        int n =arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=1;j<=k;j++){
                sum += arr[(i+j)%n];
            }
            ans[i]=sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,4,6,7};
        int k=2;
        int[] result= ArraySumofNextKelements(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
