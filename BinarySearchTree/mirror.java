package BinarySearchTree;

public class mirror {
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

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node Mirror(Node root){
        if(root == null){
            return null;
        }

        Node leftS = Mirror(root.left);
        Node rightS = Mirror(root.right);
        root.left = rightS;
        root.right = leftS;
        return root;
    }

    public static void main(String[] args) {
        int value[] = {8,5,10,3,11,6,14};
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = Insert(root, value[i]);
        }

        preorder(root);
        Mirror(root);
        System.out.println();
        preorder(root);
    }
}
