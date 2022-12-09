package Queue;

import java.util.Stack;

public class twoStacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if(s1.isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(6);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
