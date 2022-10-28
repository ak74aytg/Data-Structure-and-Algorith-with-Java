package Heap_PriorityQueue;
import java.util.*;
public class SlidingWindowMaximum {

    static class Info implements Comparable<Info>{
        int data;
        int idx;
        public Info(int data, int idx){
            this.data = data;
            this.idx = idx;
        }

        @Override
        public int compareTo(Info i2){
            return i2.data - this.data;
        }
    }

    public static void maximum(int arr[], int k){
        PriorityQueue<Info> pq = new PriorityQueue<>();
        int result[] = new int[arr.length - k + 1];

        for(int i=0;i<k;i++){
            pq.add(new Info(arr[i], i));
        }

        result[0] = pq.peek().data;

        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }

            pq.add(new Info(arr[i], i));
            result[i-k+1] = pq.peek().data;
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        maximum(arr, 3);
    }
}
