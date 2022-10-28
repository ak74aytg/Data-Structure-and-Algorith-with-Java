package Heap_PriorityQueue;
import java.util.*;
public class NearbyCars {

    static class Info implements Comparable<Info>{
        int sqr;
        int idx;
        public Info(int sqr, int idx){
            this.sqr = sqr;
            this.idx = idx;
        }

        @Override
        public int compareTo(Info i2){
            return this.sqr - i2.sqr;
        }
    }

    public static void find(int pts[][], int k){
        PriorityQueue<Info> pq = new PriorityQueue<>();
        for(int i = 0; i<pts.length; i++){
            int sqr = 0;
            for(int j=0;j<2;j++){
                sqr += pts[i][j] * pts[i][j];
            }
            pq.add(new Info(sqr, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("C" + pq.peek().idx);
            pq.remove();
        }
    }

    public static void main(String args[]){
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        find(pts, k);
    }
}
