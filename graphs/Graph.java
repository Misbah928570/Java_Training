package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;
    Graph(int v){
        adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u); //for undirected graphs
    }
    void print(){
        for(int i=0;i<adj.size();i++){
            System.out.print(i+" -> ");
            for(int neighbour: adj.get(i)){
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }


    void BFS(int start,int v){
        System.out.print("BFS Traversal from the node "+start+" :  ");
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];
        q.offer(start);
        visited[start] = true;
        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node+" ");
            for (int n : adj.get(node)) {
                if (visited[n] == false) {
                    q.offer(n);
                    visited[n] = true;
                }
            }
        }
    }
    void dfs(int node, boolean[] visited){
        visited[node] =true;
        System.out.print(node+" ");
        for(int n:adj.get(node)){
            if(!visited[n])
                dfs(n,visited);
        }
    }
    void dfsTraversal(int start){
        boolean[] visited = new boolean[adj.size()];
        System.out.println();
        System.out.print("DFS traversal : ");
        dfs(start,visited);
    }
    
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(1,2);
        g.addEdge(0,2);
        g.addEdge(1,0);
        g.addEdge(2,3);
        g.print();
        g.BFS(2,4);
        g.dfsTraversal(2);
    }
}
