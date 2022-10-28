package bit_manipulation;

public class getBit {
    public static int get(int num, int i){
        int value = num & (1<<i);
        if(value !=0)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(get(num, 2));
    }
}
