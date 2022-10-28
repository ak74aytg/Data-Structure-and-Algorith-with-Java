package Heap_PriorityQueue;

import java.util.*;

public class priority {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String c, int rank) {
            this.name = c;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Tnteger> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("E", 12));


        while (!pq.isEmpty()) {
            System.out.print(pq.peek().name + "->" + pq.peek().rank+"\n");
            pq.remove();
        }
    }
}
