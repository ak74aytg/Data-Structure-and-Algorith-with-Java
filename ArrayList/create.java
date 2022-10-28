package ArrayList;
import java.util.ArrayList;
public class create {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        // O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        // O(n)
        list1.add(2, 10);
        System.out.println(list1);

        // O(1)
        System.out.println(list1.get(2));

        // O(n)
        list1.remove(2);
        System.out.println(list1);

        // O(n)
        list1.set(2, 10);
        System.out.println(list1);

        // O(n)
        System.out.println(list1.contains(10));

        System.out.println(list1.size());
    }
        
}
