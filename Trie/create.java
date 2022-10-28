package Trie;

public class create {
    static class Node {
        Node[] children=new Node[26];
        boolean endOfWord=false;

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord;
    }
    public static void main(String[] args) {
        String[] word = {"the", "a", "there", "their", "any", "thee"};
        for (String s : word) {
            insert(s);
        }
        System.out.println(search("any"));
        System.out.println(search("a"));
    }
}
