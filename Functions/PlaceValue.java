package Functions;

public class PlaceValue {
    public static int Place(int num,int digit){
        int place =1;
        while(num>0){
            int rem = num%10;
            if(rem == digit){
                return rem*place;
            }
            num =num/10;
            place *=10;
        }
        return -1;
    }
    public static void main(String[] args) {
        int num =1234;
        int digit =3;
        System.out.println(Place(num, digit));
    }
}
