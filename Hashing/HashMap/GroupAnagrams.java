package Hashing.HashMap;
import java.util.*;
class Solution {
    public static List<List<String>> groupAnagrams(String[] words) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String value : words) {

            //converting a string to a character array using toCharArray() function
            char[] str = value.toCharArray();
            Arrays.sort(str);
            //converting a character array to a string using valueOf() function
            String s = String.valueOf(str);

            if (map.get(s) != null) {
                List<String> a = map.get(s);
                a.add(value);
                map.put(s, a);
            } else {
                List<String> a = new ArrayList<>();
                a.add(value);
                map.put(s, a);
            }
        }
        for(String s : map.keySet()){
            res.add(map.get(s));
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"pop","bat","tab","opp"};
        List<List<String>> res = groupAnagrams(words);
        System.out.println(res);
    }
}