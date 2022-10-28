package BinarySearchTree;

public class search {

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

    public static boolean Search(Node root, int key){
        if(root== null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data < key){
            return Search(root.right, key);
        }
        else{
            return Search(root.left, key);
        }

    }

    public static void main(String[] args) {
        int value[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = Insert(root, value[i]);
        }

        System.out.println(Search(root, 3));
    }
    
}
