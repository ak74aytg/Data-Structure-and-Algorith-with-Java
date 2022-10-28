package recursion;

public class printNum {

    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    static int decOrder(int n){
        if(n>0){
            System.out.print(n+" ");
            return decOrder(n-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        int num =10;
        printDec(num);
    }
}
