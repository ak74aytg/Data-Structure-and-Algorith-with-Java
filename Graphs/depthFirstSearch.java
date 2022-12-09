package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class depthFirstSearch{
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        // 0-vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //1-vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2-vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //3-vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        //4-vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            dfsUtil(graph, i, vis);
        }
    }

    public static void dfsS(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        s.push(0);

        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                vis[curr] = true;
                System.out.print(curr+" ");
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    s.push(e.des);
                }
            }

        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis){     //O(V+E)
        
        System.out.print(curr+" ");

        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                dfsUtil(graph, e.des, vis);
            }
        }

    }


    public static void main(String args[]){


        int n = 7;
        ArrayList <Edge>[] graph = new ArrayList[n];
        createGraph(graph);
        dfsS(graph);


    }
}