package Array;


public class DistanceEven {
    public static int DistancebetweenEven(int arr[]){
        int start =0;
        int end =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2==0){
                start =i;
                break;
            }
        }
        for(int j=start+1;j<arr.length;j++){
            if(arr[j]%2==0){
                end = j;
                break;
            }
        }
        int distance = end -start;
        if (distance == 0 || start == 0 ||end ==0){
            return -1;
        }
        
        return distance;
    }
    public static void main(String[] args) {
       int[] arr = {1,3,3,5,6,7};
       int ans = DistancebetweenEven(arr);
        System.out.println(ans);
}
}