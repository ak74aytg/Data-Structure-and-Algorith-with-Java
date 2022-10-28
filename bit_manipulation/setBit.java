package bit_manipulation;

public class setBit {
    public static int set(int num, int i)
    {
        int bitmask = 1<<i;
        return (num | bitmask);
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(set(num, 2));
    }
}
