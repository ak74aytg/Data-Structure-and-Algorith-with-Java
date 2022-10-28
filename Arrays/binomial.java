import java.util.*;
public class binomial{

    public static int factorial(int n)
    {
        int fact = 1;
        for(int i=n; i>0; i--)
        {
            fact *= i;
        }
        return fact;
    }


    public static int binomia(int n, int r)
    {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int n_rFact = factorial(n-r);
        int binom = nFact/(rFact*n_rFact);
        return binom;
    }


    public static void main(String argv[])
    {
        Scanner sc = new Scanner (System.in);
        //binomial - n!/r!*(n-r)!
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nBino = binomia(n, r);
        System.out.println(nBino);
    }
}