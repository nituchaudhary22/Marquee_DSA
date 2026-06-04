package Array;

public class MissingNumber {
    public static int Missing(int[] arr){
        int n =arr.length;
        int[] temp =new int[n+1];
        for(int i=0;i<n;i++){
            temp[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(temp[i] == 0){
                return i;
            }
        }
        
        return n;
    }

    public static void main(String[] args) {
        int[] arr ={3,0,1};
        System.out.println(Missing(arr));
    }
}
// frequency check
// return count of all digits
// return count of digit which is repetitive