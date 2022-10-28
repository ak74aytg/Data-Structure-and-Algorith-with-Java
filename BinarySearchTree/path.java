package BinarySearchTree;
import java.util.*;
public class path {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node Insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value){
            root.left = Insert(root.left, value);
        }else{
            root.right = Insert(root.right, value);
        }
        return root;
    }

    public static void RoottoLeaf(Node root, ArrayList<Integer> q){
        if(root == null){
            return;
        }
        q.add(root.data);
        if(root.left == null && root.right == null){
            
            for(int i=0 ;i<q.size();i++){
                System.out.print(q.get(i)+" ");
            }
            System.out.println();
        }

        RoottoLeaf(root.left, q);
        RoottoLeaf(root.right, q);
        q.remove(q.size()-1);

    }


    public static void main(String[] args) {
        int value[] = {8,5,10,3,6,11,14};
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = Insert(root, value[i]);
        }

        ArrayList<Integer> q = new ArrayList<>();

        RoottoLeaf(root, q);

    }
}
