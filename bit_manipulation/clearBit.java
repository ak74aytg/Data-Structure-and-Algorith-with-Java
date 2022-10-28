package bit_manipulation;

public class clearBit {
    public static int clear(int num, int i)
    {
        int bitmask = 1<<i;
        return (num & ~bitmask);
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(clear(num, 1));
    }
}
