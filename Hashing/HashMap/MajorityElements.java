package Hashing.HashMap;
import java.util.*;

public class MajorityElements {

    public static void majority(int nums[]){
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            // if(hm.containsKey(nums[i])){
            //     hm.put(nums[i], hm.get(nums[i])+1);
            // }
            // else{
            //     hm.put(nums[i], 1);
            // }

            //SHORTHAND FOR THE ABOVE LINES OF CODE
            hm.put(nums[i], hm.getOrDefault(i, 0)+1);
        }

        // Set<Integer> keys = hm.keySet();

        for (Integer k : hm.keySet()) {
            if(hm.get(k) > n/3){
                System.out.print(k+" ");
            }
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {1,3};
        majority(nums);
        
    }
}
