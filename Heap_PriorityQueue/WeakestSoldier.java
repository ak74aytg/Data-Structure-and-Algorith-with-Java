package Heap_PriorityQueue;
import java.util.*;
public class WeakestSoldier {
    static class Info implements Comparable<Info>{
        int ones;
        int idx;
        public Info(int ones, int idx){
            this.ones = ones;
            this.idx = idx;
        }

        @Override
        public int compareTo(Info i2){
            int check = this.ones!=i2.ones?this.ones - i2.ones:this.idx - i2.idx;
            return check;
        }
    }

    public static void weakest(int arr[][], int k){
        PriorityQueue<Info> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            int ones=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 1){
                    ones++;
                }
            }
            pq.add(new Info(ones, i));
        }
        for(int i=0;i<k;i++){
            System.out.println("Row " + pq.remove().idx);
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
         {1,1,1,1}, 
         {1,0,0,0}, 
         {1,0,0,0},
         {1,0,0,0}};
        
        weakest(arr, 2);
    }
}
