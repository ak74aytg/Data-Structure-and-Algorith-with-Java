package bit_manipulation;

public class countSetBit {
    public static int count(int num){
        int count= 0;
        while(num>0)
        {
            if((num&1)!=0)
            {
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(count(num));
    }
}
