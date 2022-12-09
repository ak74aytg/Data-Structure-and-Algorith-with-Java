package Hashing.HashMap;
import java.util.*;
class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] list = new int[2];


        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                list[1]=i;
                list[0]=map.get(target-nums[i]);
                return list;
            }
            map.put(nums[i],i);

        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        int[] list = new int[2];
        list = twoSum(nums, target);
        for(int i=0;i<2;i++){
            System.out.print(list[i] + " ");
        }
    }
}