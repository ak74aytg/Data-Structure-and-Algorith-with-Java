
package Strings;
import java.util.ArrayList;
public class printing_characters {
    public static void find(String str){
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public void twoSum(int[] nums, int target) {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i] + nums[j])==target){
                    list1.add(nums[i]);
                    list1.add(nums[j]);
                    break;
                }     
            }
        }
        System.out.println(list1);
    }
    public static void main(String[] args) {
        String str = "Akshay is the great";
        find(str);

    }
}
