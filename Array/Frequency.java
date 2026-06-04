package Array;
import java.util.Arrays;
public class Frequency {
    public static int[] CountFrequency(int[] arr){
    //     int n =arr.length;
    //     int[] freq = new int[n];
    //     for(int i=0;i<n;i++){
    //         freq[arr[i]]++;
    //     }
    //     return freq;
    // }
    

    int max = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    int[] freq = new int[max + 1];
    for (int i = 0; i < arr.length; i++) {
        freq[arr[i]]++;
    }
    return freq;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,2,2,4,7 };
        int[] ans = CountFrequency(arr);
        System.out.println(Arrays.toString(ans));
    }
}
