package bit_manipulation;

public class clearLastIthBit {

    public static int clear(int num, int i)
    {

        // // WRONG TRY
        // int value=0;
        // while(i>=0)
        // {
        //     int bitmask = ~(1<<i);
        //     value = (num & bitmask);
        //     i--;
        // }
        // return value;

        int bitmask = (-1)<<(i);
        return (num & bitmask);

    }

    public static void main(String[] args) {
        int num = 15;
        int i=2;
        System.out.println(clear(num, i));
    }
}
