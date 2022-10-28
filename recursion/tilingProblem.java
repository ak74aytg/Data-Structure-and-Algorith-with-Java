package recursion;

public class tilingProblem {

    
    public static int compactTiling(int n){
        if(n==1 || n==0){
            return 1;
        }
        return compactTiling(n-1)+compactTiling(n-2);
    }


    public static int tiling(int n){
        // base case
        if(n==1 || n==0){
            return 1;
        }

        // verticle arrangement
        int verticle = tiling(n-1);

        // horizontal arrangement
        int horizontal = tiling(n-2);

        int totalways = verticle+horizontal;
        // total ways to arrange the tiles
        return totalways;

    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
