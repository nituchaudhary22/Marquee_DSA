package Array;

public class GeometricTriplet {
    public static void Geometric(int[] arr){
        for(int i =0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((arr[j] * arr[j] == arr[i] * arr[k])){
                        System.out.println(arr[i] +" "+arr[j]+" "+arr[k]+ " is a geometric triplet");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,6};
        Geometric(arr);
    }
}
