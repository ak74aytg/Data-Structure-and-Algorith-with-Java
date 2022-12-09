package Graphs;
import java.util.*;
public class cycleDetection_Directed {
    static class Edge{
        int src;
        int des;
        
        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        // 0-vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        //1-vertex
        graph[1].add(new Edge(1, 3));

        //2-vertex
        graph[2].add(new Edge(2, 3));

        // //3-vertex
        // graph[3].add(new Edge(3, 0));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stack){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.des]){
                return true;
            }
            if(!vis[e.des] && detectCycleUtil(graph, e.des, vis, stack)){
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }


    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
