package Strings;

public class compression {
    public static String compressByMe(String str){
        str += " ";
        StringBuilder sc = new StringBuilder();
        sc.append(str.charAt(0));
        Integer count = 1;
        for(int i=1; i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                if(count>1)
                {
                    sc.append(count.toString());
                    sc.append(str.charAt(i));
                }
                else{
                    sc.append(str.charAt(i));
                }
                count=1;
            }
        }
        return sc.toString();
    }

    public static String compressByMam(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++)
        {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1)
            {
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(compressByMam(str));
        System.out.println(compressByMe(str));
    }
}
