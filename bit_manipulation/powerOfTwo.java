package bit_manipulation;

public class powerOfTwo {
    public static boolean check(int num)
    {
        return (num & (num - 1))==0;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(check(num));
    }
}
