package recursion;
public class removeDuplicate {


    public static void remove(String str){
        int i = 0;
        StringBuilder new_str = new StringBuilder("");
        boolean map[] = new boolean[26];
        remove(str, i, new_str, map);
    }


    public static void remove(String str, int i, StringBuilder new_str, boolean map[]){
        if(i==str.length()){
            System.out.println(new_str);
            return;
        }



        if(map[(str.charAt(i)-'a')]==true){
            remove(str, i+1, new_str, map);
        }

        else{
            map[str.charAt(i)-'a'] = true;
            remove(str, i+1, new_str.append(str.charAt(i)), map);
        }
    }

    
    public static void main(String[] args) {
        String str = "apnacollege";
        remove(str);
    }
}
