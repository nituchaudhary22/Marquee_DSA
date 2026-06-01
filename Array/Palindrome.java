package Array;

public class Palindrome {
    public static boolean IsPalindrome(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i] == arr[j]){
                return true;
            }
            i++;
            j--;
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,2,1};
        System.out.println(IsPalindrome(arr));
    }
}
