//find the number that is occuring once in a array
//XOR is used if only one element is occuring once
package Array;
public class SingleNo {
    public static int ElementOccuringOnce(int[] arr){
        int result =0;
        for(int num:arr){
            result ^= num;
            //12^12^13^14^13^15
            //(12^12)^(13^13)^(14)
            //0^0^14 --(0^0 =0) (1^0 = 1)
            //14
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr ={12,12,13,14,13};
        System.out.println((ElementOccuringOnce(arr)));
    }
}
