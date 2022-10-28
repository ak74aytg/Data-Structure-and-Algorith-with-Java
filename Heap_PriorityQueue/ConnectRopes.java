package Heap_PriorityQueue;
import java.util.*;
public class ConnectRopes {

    public static int connect(int ropes[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }

        int cost = 0;

        while(pq.size()>1){
            int size = pq.remove();
            size += pq.remove();
            cost += size;
            pq.add(size);
        }

        return cost;
    }

    public static void main(String[] args) {
        int ropes[] = {4,3,2,6};
        System.out.println(connect(ropes));
    }
}
