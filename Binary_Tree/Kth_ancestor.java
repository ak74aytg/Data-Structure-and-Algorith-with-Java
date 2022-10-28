package Binary_Tree;

public class Kth_ancestor {



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


    public static int Kth(Node root, int n1, int k){
        if(root == null){
            return -1;
        }

        if(root.data == n1){
            return 0;
        }

        int leftDist = Kth(root.left, n1, k);
        int rightDist = Kth(root.right, n1, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if(max+1 == k){
            System.out.println(root.data);
        }

        return max+1;

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
        

        int n1=6, k =1;
        Kth(Root, n1, k);
    }
}
