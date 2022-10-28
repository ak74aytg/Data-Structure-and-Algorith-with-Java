package Hashing.HashSet;

import java.util.*;

public class IteneraryOfTickets {
    static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Channai", "Bangluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Channai");
        tickets.put("Delhi", "Goa");

        String sp = getStart(tickets);
        System.out.print(sp);
        while(tickets.get(sp)!=null){
            System.out.print(" -> "+tickets.get(sp));
            sp = tickets.get(sp);
        }
    }
}
