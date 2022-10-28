package Hashing.HashMap;

import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapCode {
    static class HashMap<K, V>{ // K and V are generics i.e. general for every datatype 
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;  //size of linked list
        private int N;  //size of bucket
        private LinkedList<Node> buckets[]; //buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[N];
            for(int i=0;i<N;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di=0;

            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = N*2;  
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes => add in new buckets
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // valid ;  -1

            if(di!=-1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){
                return false;
            }
            return true;
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            return null;
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 3);

        System.out.println(hm.containsKey("Nepal"));

        hm.remove("Nepal");
        
        ArrayList<String> keys = hm.keySet();
        System.out.print("{ ");
        for(int i=0;i<keys.size();i++){
            System.out.print(keys.get(i) + " => " + hm.get(keys.get(i)) + ", ");
        }
        System.out.print("}");
    }
}
