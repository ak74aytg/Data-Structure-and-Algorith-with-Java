package Backtracking;

public class gridWays {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int trick(int n, int m){
        int num = factorial(n+m-2);
        int deno = factorial(n-1)*factorial(m-1);
        return num/deno;
    }
    public static int ways(int row, int col, int n, int m){
        // base case
        if(row==n-1 && col==m-1){
            return 1;
        }
        if(row==n || col==m){
            return 0;
        }
        // recursion
        int W1=ways(row+1, col, n, m);
        int W2=ways(row, col+1, n, m);
        return W1+W2;
    }
    public static void main(String[] args) {
        int n=4, m=4;
        System.out.println(trick(n, m));
        System.out.println(ways(0,0,n,m));
    }
}
