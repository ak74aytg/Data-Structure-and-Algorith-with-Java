package BinarySearchTree;

import java.util.*;
public class mergeBST_myApproach {
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

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        arr.add(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void preorder1(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder1(root.left);
        preorder1(root.right);
    }

    public static ArrayList<Integer> arr= new ArrayList<>();

    public static Node merge(Node root1, Node root2){
        preorder(root2);
        preorder(root1);
        Node root = null;
        for(int i=0;i<arr.size();i++){
            root = Insert(root, arr.get(i));
        }
        return root;
    }
    public static void main(String[] args) {
        int value1[] = {1,2,4};
        int value2[] = {3,9,12};
        Node root1 = null;
        Node root2 = null;

        for(int i=0;i<value1.length;i++){
            root1 = Insert(root1, value1[i]);
        }

        preorder1(root1);
        System.out.println();

        for(int i=0;i<value2.length;i++){
            root2 = Insert(root2, value2[i]);
        }

        preorder1(root2);
        System.out.println();

        Node root = merge(root1, root2);
        preorder1(root);
    }
}

