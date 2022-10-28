package recursion;

public class powerOptimized {
    public static int XPowerN(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = XPowerN(x, n/2);
        if(n%2==0){
            return halfPower*halfPower;
        }
        else{
            return x*halfPower*halfPower;
        }
    }
    public static void main(String[] args) {
        System.out.println( XPowerN(2, 10));
    }
}
