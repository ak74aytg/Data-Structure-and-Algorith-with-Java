package Hashing.HashSet;

import java.util.HashSet;
public class create {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(3);
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(3);

        System.out.println(set);

        System.out.println(set.contains(3));

        set.remove(3);
        System.out.println(set);

        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
