package recursion;

public class power {
    public static int XPowerN(int x, int n){
        if(n==0){
            return 1;
        }
        return x*XPowerN(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println( XPowerN(2, 10));
    }
}
