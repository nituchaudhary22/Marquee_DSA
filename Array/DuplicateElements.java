package Array;

public class DuplicateElements {
    public static int Duplicate(int[] arr){
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                int duplicate = arr[i];
                System.out.println("Duplicate element is: " + duplicate);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        System.out.println("Count of Duplicate element is: " +Duplicate(arr));
    }
}
