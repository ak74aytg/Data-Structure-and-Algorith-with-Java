package Hashing.HashSet;
import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // TreeSet<Integer> set = new TreeSet<>();
        
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(0);


        //Using Iterator
        // Iterator i = set.iterator();
        // while(i.hasNext()){
        //     System.out.print(i.next());
        // }
        // System.out.println();


        //Advanced for loop
        for(Integer key : set){
            System.out.println(key);
        }
    }
}
