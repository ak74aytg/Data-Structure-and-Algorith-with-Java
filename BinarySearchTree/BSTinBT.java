package BinarySearchTree;
public class BSTinBT {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int max;
        int min;
        public Info(boolean isBST, int size , int max, int min){
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }

    public static int maxBST = 0;

    public static Info LargestBST(Node root){

        if(root == null){
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        Info left = LargestBST(root.left);
        Info right = LargestBST(root.right);

        int size = left.size + right.size +1;
        int max = Math.max(root.data, Math.max(left.max, right.max));
        int min = Math.min(root.data, Math.min(left.min, right.min));


        if(root.data <= left.max || root.data >= right.min){
            return new Info(false, size, max, min);
        }
        if(left.isBST && right.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, max, min);
        }

        return new Info(false, size, max, min);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(10);


        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);


        LargestBST(root);
        System.out.println(maxBST);
    }
}
