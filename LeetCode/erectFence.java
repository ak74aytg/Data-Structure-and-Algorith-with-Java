package LeetCode;
import java.util.*;
class erectFence {
    private static class Points{
        int x;
        int y;
        public Points(int x, int y){
            this.x = x;
            this.y = y;
        }


    }
    public static int[][] outerTrees(int[][] trees) {
        List<Points> points = new ArrayList<>();
        
        
        for(int i=0;i<trees.length;i++){
            points.add(new Points(trees[i][0], trees[i][1]));
        }

        if(points.size() == 1) {
            return trees;
        }
        Collections.sort(points, (a,b)-> a.x == b.x ? a.y - b.y : a.x - b.x);

        Stack<Points> s = new Stack<>();

        s.push(points.get(0));
        s.push(points.get(1));

        for(int i=2;i<points.size();i++){
            Points top = s.pop();
            while(s.size()>1 && check(s.peek(), top, points.get(i)) < 0){
                top = s.pop();
            }
            s.push(top);
            s.push(points.get(i));
        }

        if(s.size() == points.size()){
            int [][] arr = new int[s.size()][2];
            for(int i=0;i<arr.length;i++){
                arr[i][0] = s.peek().x;
                arr[i][1] = s.pop().y;
            }

            return arr;
        }

        for(int i=points.size()-2;i>=0;i--){
            Points top = s.pop();
            while(s.size()>1 && check(s.peek(), top, points.get(i)) < 0){
                top = s.pop();
            }
            s.push(top);
            s.push(points.get(i));
        }

        s.pop();

        int[][] arr = new int[s.size()][2];

        for(int i=0;i<arr.length;i++){
            arr[i][0] = s.peek().x;
            arr[i][1] = s.pop().y;
        }

        return arr;

    }

    public static double check(Points p, Points q, Points r){
        double prod = ((r.y - q.y)*(q.x - p.x)) - ((q.y - p.y)*(r.x - q.x));
        return prod;
    }

    public static void main(String[] args) {
        // points = [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
        int [][] points = {{1,1}, {2,2}, {2,0}, {2,4}, {3,3}, {4,2}};
        
        int [][] res = outerTrees(points);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0] + res[i][1]);
        }
    }
}