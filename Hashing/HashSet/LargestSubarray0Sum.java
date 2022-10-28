package Hashing.HashSet;

import java.util.HashMap;

public class LargestSubarray0Sum {
    static int size(int arr[]) {
        // sum[i+1, j] = sum[0,j]+sum[0,i]
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                len = Math.max(len, i - map.get(sum));
            }
        }
        return len;
    }

    public static void main(String[] args) {

        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

        System.out.println(size(arr));
    }
}
