package Strings;

public class palindrome {
    public static boolean check(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("not a palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("it is a palindrome string");
        return true;

    }
    public static void main(String[] args) {
        String str = "noon";
        check(str);
    }
}
