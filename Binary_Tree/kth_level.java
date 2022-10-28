package Binary_Tree;

public class kth_level {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void kth(Node root, int level, int k){
        if(root==null){
            return;
        }

        if(level == k){
            System.out.println(root.data);
            return;
        }
        kth(root.left, level+1, k);
        kth(root.right, level+1, k);
    }



    public static void main(String argv[]){

            //        1
            //       / \
            //      2   3
            //     / \ / \
            //    4  56   7





        Node Root = new Node(1);
        Root.left = new Node(2);
        Root.right = new Node(3);
        Root.left.left = new Node(4);
        Root.left.right = new Node(5);
        Root.right.left = new Node(6);
        Root.right.right = new Node(7);
        


        kth(Root, 1, 2);
    }
}
