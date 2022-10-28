package Strings;

public class compare {
    public static void main(String[] args) {
        String str1 = "Akshay";
        String str2 = "Akshay";
        String str3 = new String("Akshay");

        if(str1==str2)
        {
            System.out.println("equal12");
        }
        if(str1==str3)
        {
            System.out.println("equal13");
        }
        if(str1.equals(str3))
        {
            System.out.println("equal13e");
        }
        
        
    }
}
