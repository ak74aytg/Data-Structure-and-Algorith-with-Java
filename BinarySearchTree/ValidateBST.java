package BinarySearchTree;

public class ValidateBST {
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

    public static boolean Validation(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }

        if(max != null && root.data >= max.data){
            return false;
        }

        return (Validation(root.left, min, root) &&
        Validation(root.right, root, max)
        );
    }


    public static void main(String[] args) {
        int value[] = {8,5,10,3,6,6,14};
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = Insert(root, value[i]);
        }

        if(Validation(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}
