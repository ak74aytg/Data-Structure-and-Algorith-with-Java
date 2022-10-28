package Hashing.HashMap;
import java.util.*;
public class create {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 5);
        hm.put("Nepal", 6);

        // System.out.println(hm);


        // int population = hm.get("India");
        // System.out.println(population);


        // System.out.println(hm.containsKey("India"));

        // hm.remove("China");
        // System.out.println(hm);

        Set<String> keys = hm.keySet();
        // System.out.println(keys);

        for (String k : keys) {
            System.out.println(k+"=>"+hm.get(k));
        }

    }
}


