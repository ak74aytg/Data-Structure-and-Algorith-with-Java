package BinarySearchTree;

public class delete {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.left = Insert(root.left, value);
        } else {
            root.right = Insert(root.right, value);
        }
        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node Delete(Node root, int key) {
        if (root.data > key) {
            root.left = Delete(root.left, key);
        } else if (root.data < key) {
            root.right = Delete(root.right, key);
        }
        else{
            // no child
            if (root.left == null && root.right == null) {
                return null;
            }
            // only right child
            if (root.left == null) {
    
                return root.right;
            }
            // only left child
            else if (root.right == null) {
                return root.left;
            }
            // both children
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right, IS.data);
        }

        return root;

    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = Insert(root, value[i]);
        }

        Inorder(root);
        System.out.println();

        root = Delete(root, 1);
        System.out.println();
        Inorder(root);
    }
}
