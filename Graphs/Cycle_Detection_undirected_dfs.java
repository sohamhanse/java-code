package Graphs;

import java.util.ArrayList;

public class Cycle_Detection_undirected_dfs {
    static class edge{
        int weight;
        int source;
        int destination;

        edge(int source ,int destination , int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static boolean dfs(ArrayList<edge> graph [] , boolean vis []){
       for(int i = 0 ; i<graph.length ;i++){
        if(!vis[i]){
            if(dfsutil(graph , vis ,i , -1)){
                return true;
            }
        }
       }
       return false;
    }

    public static boolean dfsutil(ArrayList<edge> graph [] , boolean vis [] , int curr , int par){
        vis[curr] = true;
        for(int i = 0 ; i<graph[curr].size() ; i++){
            edge e = graph[curr].get(i);
            if(vis[e.destination] && e.destination != par){
                return true;
            }else if(!vis[e.destination] && dfsutil(graph, vis, e.destination, curr)){
                    return true;
            }
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String arg[]){
        int v = 9;
        ArrayList<edge> graph [] = new ArrayList[v];
        //  Graph :-
       //       (5)
       //    0 ----- 1
       //           / \
       //      (1) /   \ (3)             (4)
       //         /     \            6----------7
       //        /       \                       \
       //       2 ------- 3                       \(6)
       //       |   (1)   |                        \
       //   (2) |         | (2)                     8
       //       |         |
       //       4         5
       //


       for(int i= 0 ; i<graph.length ; i++){
        graph[i] = new ArrayList<>();
       }

       graph[0].add(new edge(0, 1, 5));

       graph[1].add(new edge(1 , 0, 5));
       graph[1].add(new edge(1, 2, 1));
       graph[1].add(new edge(1, 3, 3));

       graph[2].add(new edge(2, 1, 1));
       graph[2].add(new edge(2, 3, 1));
       graph[2].add(new edge(2, 4, 2));

       graph[3].add(new edge(3, 1, 3));
       graph[3].add(new edge(3, 2, 1));
       graph[3].add(new edge(3, 5, 2));

       graph[4].add(new edge(4, 2, 2));

       graph[5].add(new edge(5, 3, 2));

       graph[6].add(new edge(6, 7, 4));

       graph[7].add(new edge(7, 6, 4));
       graph[7].add(new edge(7, 8, 6));

       graph[8].add(new edge(8, 7, 6));



       boolean vis[] = new boolean[v];
       System.out.println(dfs(graph , vis)); 
    }
}
