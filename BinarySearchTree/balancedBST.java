package BinarySearchTree;
import java.util.*;
public class balancedBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void Inorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }

        Inorder(root.left, inorder);
        inorder.add(root.data);
        Inorder(root.right, inorder);
    }

    public static Node Insert(int si, int ei, ArrayList<Integer> arr){
        if(si > ei){
            return null;
        }
        int mid = (si + ei)/2;
        Node root = new Node(arr.get(mid));
        root.left = Insert( si, mid-1, arr);
        root.right = Insert( mid+1, ei, arr);

        return root;
        
    }

    public static Node BalancedBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        Inorder(root, inorder);

        root = Insert(0, inorder.size()-1, inorder);
        return root;

    }

    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);


        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        preorder(root);
        System.out.println();
        root = BalancedBST(root);
        preorder(root);
    }
}
