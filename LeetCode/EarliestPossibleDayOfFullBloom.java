package LeetCode;
import java.util.*;
public class EarliestPossibleDayOfFullBloom {

        private static class seed{
            int plant;
            int grow;
            seed(int plant, int grow){
                this.plant = plant;
                this.grow = grow;
            }
        }
        public static int earliestFullBloom(int[] plantTime, int[] growTime) {
            ArrayList<seed> Plant = new ArrayList<>();
            for(int i=0;i<plantTime.length;i++){
                Plant.add(new seed(plantTime[i], growTime[i]));
            }
    
            Plant.sort((a, b) -> (b.grow - a.grow));
    
            int max = 0;
            int pt = 0;
            for(int i=0;i<plantTime.length;i++){
                max = Math.max(max, Plant.get(i).plant + Plant.get(i).grow + pt );
                pt+=Plant.get(i).plant;
            }
    
            return max;
        }
 

    public static void main(String[] args) {
        // plantTime = [1,4,3], growTime = [2,3,1]
        int[] plantTime = {1,4,3};
        int[] growTime = {2,3,1};

        int days = earliestFullBloom(plantTime, growTime);
        System.out.println(days);
    }
}
