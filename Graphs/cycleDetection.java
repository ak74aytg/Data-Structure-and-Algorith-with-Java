package Graphs;
import java.util.*;
public class cycleDetection {
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
        graph[0].add(new Edge(0, 3));

        //1-vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        //2-vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        //3-vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        //4-vertex
        graph[4].add(new Edge(4, 3));
    }


    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, i, vis, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, int par){     //O(V+E)
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                if(detectCycleUtil(graph, e.des, vis, curr)){ 
                    return true;
                }
            }
            else if(vis[e.des] && e.des != par){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
