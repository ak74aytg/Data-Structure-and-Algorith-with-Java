package BinarySearchTree;

public class ArraytoBST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node Insert(int si, int ei, int arr[]){
        if(si > ei){
            return null;
        }
        int mid = (si + ei)/2;
        Node root = new Node(arr[mid]);
        root.left = Insert( si, mid-1, arr);
        root.right = Insert( mid+1, ei, arr);

        return root;
        
    }

    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }


    public static void main(String[] args) {
        int value[] = {3,5,6,8,10,11,12};
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = Insert(0 ,value.length - 1, value);
        }

        Preorder(root);
    }
}
