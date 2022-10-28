package Hashing.HashSet;
import java.util.*;
public class CountDistinct {
    static int distinct(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(distinct(num));
    }
}
