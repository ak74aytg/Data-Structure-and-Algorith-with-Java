import java.util.*;
public class binary {

    public static int binToDeci(int binNo){
        int pow = 0;
        int deci = 0;
        
        while(binNo > 0)
        {
            int lastNo = binNo%10;
            deci = deci + (lastNo* (int)Math.pow(2,pow));
            binNo = binNo/10;
            pow++;
        }
        return deci;
    }


    public static int deciToBin(int deci)
    {
        int bin = 0;
        int pow = 0;
        while(deci > 0){
            int rem = deci % 2;
            bin = bin + (rem*(int)Math.pow(10, pow));


            deci = deci/2;
            pow++;
        }
        return bin;
    }

    public static void main(String argv[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a binary number:");
        int binNo = sc.nextInt();
        System.out.println("The decimal of '"+binNo+ "' is '" +binToDeci(binNo)+"'");


        System.out.println("Enter a decimal number:");
        int diciNo = sc.nextInt();
        System.out.println("The binary of '"+diciNo+ "' is '"+deciToBin(diciNo)+"'");


    }
}
