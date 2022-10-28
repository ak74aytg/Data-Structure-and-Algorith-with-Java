package bit_manipulation;

public class clearRange {

    public static int clear(int num, int i, int j)
    {
        int bitmask = (-1)<<(j+1);
        bitmask = bitmask | (~((-1)<<i));


        // // WE COULD HAVE ALSO DONE IT LIKE THAT
        // int a = (-1)<<(j+1);
        // // 011 = 3  = 2^2 - 1  =  1<<2 -1 
        // // 0111 = 7 = 2^3 - 1  =  1<<3 - 1
        // // 01111 = 15 = 2^4 - 1=  1<<4 - 1
        // int b = (1<<2) - 1;
        // bitmask = a|b;

        return (num & bitmask);
    }
    public static void main(String[] args) {
        int num = 2515;
        int i=2;
        int j=7;
        System.out.println((clear(num, i, j))); //2435
    }
}
