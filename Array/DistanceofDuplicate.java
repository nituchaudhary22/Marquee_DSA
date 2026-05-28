package Array;

public class DistanceofDuplicate {
    public static int Distance(int[] arr){
        int maxDistance =0;
        int distance =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    distance = j-i;
                if(distance>maxDistance){
                    maxDistance=distance;
                }
                }
            }          
        }
        return maxDistance;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,3};
        System.out.println(Distance(arr));
    }
}
