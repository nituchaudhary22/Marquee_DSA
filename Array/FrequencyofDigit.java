package Array;
// import java.util.Arrays;
public class FrequencyofDigit {
    public static int[] CountFrequency(int num){
    int[] freq = new int[10];
        while(num>0){
            int digit = num%10;
            freq[digit]++;
            num/=10;
        }
        return freq;
    }
    public static void main(String[] args) {
        int num = 112234551;
        int[] ans = CountFrequency(num);
        for(int i=0;i<10;i++){
            if(ans[i]>0){
                System.out.println("Frequency of "+ i+" is "+ans[i]);
            }
        }
        // System.out.println(Arrays.toString(ans));
    }
}
