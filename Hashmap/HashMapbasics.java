package Hashmap;
import java.util.HashMap;
public class HashMapbasics {
    public static void main (String[] args){
        HashMap<Integer,Integer> first = new HashMap<>();
        // first.put(key,"value");  add in the hashmap
        first.put(1,3);
        first.put(2,5);
        first.put(7,900);
        first.put(5,200);
        System.out.println(first.get(1)); // get the value
        for(Integer key : first.keySet()){
            System.out.println(first.get(key));
        }
        if(first.containsKey(2)) System.out.println("Key value found");
        if(first.containsValue(400)) System.out.println("Value found");
        first.remove(5); // removes the value
        System.out.println(first.isEmpty()); //false

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums ={2,4,5,6};
        for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
        }
        System.out.println(map);
    }
}
