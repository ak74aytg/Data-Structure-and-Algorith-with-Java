package Hashing.HashSet;

import java.util.HashMap;

public class CountSubarrayKSum {
    static int size(int arr[], int key) {
        // sum[i+1, j] = sum[0,j]+sum[0,i]
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - key)) {
                count += map.get(sum - key);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        // sum[i+1, j] = sum[0,j]+sum[0,i]
        int arr[] = { 1, 2, 3 };

        System.out.println(size(arr, 3));
    }
}
