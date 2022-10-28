package Strings;
public class letterToUpperCase {

    public static String toUppercase(String str){
        StringBuilder sc = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));

        sc.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1){
                sc.append(" ");
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sc.append(ch);
            }
            else{
                sc.append(str.charAt(i));
            }
        }
        return sc.toString();

    }

    public static void main(String[] args) {
        String str = "hi, i am akshay";
        System.out.println(toUppercase(str));
    }
}
