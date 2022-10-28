package Binary_Tree;
import java.util.ArrayList;

public class LowComAnc {
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


    public static Boolean getPath(Node root, int n, ArrayList<Node> path){

        if(root == null){
            return false;
        }

        path.add(root);

        if(root.data == n){
            return true;
        }

        Boolean foundLeft = getPath(root.left, n, path);
        Boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);

        return false;
    }


    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        Node lca = path1.get(i-1);
        return lca;


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
        System.out.println(lca(Root, n1, n2).data);
       
    }
}
