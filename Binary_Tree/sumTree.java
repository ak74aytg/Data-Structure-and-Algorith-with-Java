package Binary_Tree;
import java.util.LinkedList;
import java.util.Queue;
public class sumTree {
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


    public static int transform(Node root){
        if(root == null){
            return 0;
        }


        int left = transform(root.left);
        int right = transform(root.right);

        int data = root.data + left + right;
        root.data = left+right;
        return data;

    }


    public static void print(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
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
        
        print(Root);

        transform(Root);

        print(Root);
    }
}
