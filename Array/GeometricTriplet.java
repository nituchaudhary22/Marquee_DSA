package Array;

public class GeometricTriplet {
    public static void Geometric(int[] arr){
    //     for(int i =0;i<arr.length-2;i++){
    //         for(int j=i+1;j<arr.length-1;j++){
    //             for(int k=j+1;k<arr.length;k++){
    //                 if((arr[j] * arr[j] == arr[i] * arr[k])){
    //                     System.out.println(arr[i] +" "+arr[j]+" "+arr[k]+ " is a geometric triplet");
    //                 }
    //             }
    //         }
    //     }
    // }
     int n =arr.length;
     for(int j=1;j<n-1;j++){
        int i=j-1;
        while ((i>=0)) {
            int k =j+1;
            while(k<n){
                if(arr[j]*arr[j] == arr[k]*arr[i]){
                    System.out.println(("("+arr[i] +" "+arr[j]+" "+arr[k]+") is a geometric triplet"));
                }
                k++;
            }
            i--;
        }
     }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,6};
        Geometric(arr);
    }
}
