package Hashing.HashSet;
import java.util.*;

public class UnionAndIntersection {
    static HashSet<Integer> union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        return set;
    }

    static HashSet<Integer> intersection(int arr1[], int arr2[]){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(set1.contains(arr2[i])){
                set2.add(arr2[i]);
                set1.remove(arr2[i]);
            }
        }

        return set2;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }
}
