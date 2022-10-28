package Backtracking;

public class subset {
    public static void subsets(String str, int i, String newStr){
        if(i==str.length()){
            System.out.println(newStr);
            return ;
        }

        subsets(str, i+1, newStr+str.charAt(i));
        subsets(str, i+1, newStr);

    }


    public static void main(String[] args) {
        String str = "abc";
        subsets(str, 0, "");
    }
}
