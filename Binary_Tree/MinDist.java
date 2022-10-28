package Binary_Tree;

public class MinDist {


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


    public static Node LCA(Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = LCA(root.left, n1, n2);
        Node rightLCA = LCA(root.right, n1, n2);

        if(rightLCA == null){
            return leftLCA;
        }

        if(leftLCA == null){
            return rightLCA;
        }

        return root;
    }


    public static int lcadist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcadist(root.left, n);
        int rightDist = lcadist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }


    public static int minDis(Node root, int n1, int n2){
        Node lca = LCA(root, n1, n2);
        int dis1 = lcadist(lca, n1);
        int dis2 = lcadist(lca, n2);

        return dis1+ dis2;
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
        

        int n1=4, n2 =2;
        System.out.println(minDis(Root, n1, n2));
       
    }
}
