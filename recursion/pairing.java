package recursion;

public class pairing {


    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        // single
        int single = pair(n-1);
        // pairing
        int paired = (n-1)*pair(n-2);
        return (single+paired);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pair(n));
    }
}
