package Graphs;
import java.util.*;
public class bipertiteGraph {
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
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        //2-vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        //3-vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));

    }



    public static boolean isBipertite(ArrayList<Edge>[] graph){
        int[] col = new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i] = -1;
        }
        for(int i=0;i<graph.length;i++){
           if(col[i] == -1){
                if(!isBipertite(graph, col)){
                    return false;
                }
           }
        }
        return true;
    }

    public static boolean isBipertite(ArrayList<Edge>[] graph, int[] col){     //O(V+E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        col[0] = 0;
        while(q.size()!=0){
            int curr = q.remove();
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    if(col[e.des] == -1){
                        if(col[curr] == 0){
                            col[e.des] = 1;
                        }else{
                            col[e.des] = 0;
                        }
                        q.add(e.des);
                    }
                    else if(col[e.des] == col[curr]){
                        return false;
                    }
                }
            
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(isBipertite(graph));
    }
}
