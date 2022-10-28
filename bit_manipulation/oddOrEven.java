package bit_manipulation;

public class oddOrEven {
    public static void oddoreven(int num)
    {
        int bitmask = 1;
        if((num & bitmask) == 1)
        {
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
    public static void main(String[] args) {
        int num =3453433;
        oddoreven(num);
    }
}
