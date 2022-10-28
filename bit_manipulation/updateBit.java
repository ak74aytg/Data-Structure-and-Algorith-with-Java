package bit_manipulation;

public class updateBit {

    public static int set(int num, int i)
    {
        int bitmask = 1<<i;
        return (num | bitmask);
    }

    public static int clear(int num, int i)
    {
        int bitmask = ~(1<<i);
        return (num & bitmask);
    }

    public static int update(int num, int i, int value){
        if(value == 1)
        {
            return set(num, i);
        }
        else if(value==0){
            return clear(num, i);
        }
        return -1;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(update(num, 2, 0));
    }
}
