package BinarySearchTree;

public class printInRange {
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

    public static void RangePrint(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            RangePrint(root.left, k1, k2);
            System.out.println(root.data);
            RangePrint(root.right, k1, k2);
        }
        if(root.data < k1){
            RangePrint(root.right, k1, k2);
        }
        if(root.data > k2){
            RangePrint(root.left, k1, k2);
        }
    }


    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = Insert(root, value[i]);
        }

        RangePrint(root, 5, 12);
    }
}
