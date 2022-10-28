package recursion;

public class fibonacci {
    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn = fibbo(n-1)+fibbo(n-2);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fibbo(20)); 
    }
}
