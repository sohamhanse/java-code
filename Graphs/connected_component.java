package Graphs;

import java.util.*;

public class connected_component {
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

    public static void bsf(ArrayList<edge> graph [] , boolean vis[]){
        for(int i = 0 ; i < graph.length ; i++){
            if(!vis[i]){
                bsfutil(graph,i,vis);
            }
        }
    }

    public static void bsfutil(ArrayList<edge> graph [] , int curr , boolean vis []){
        Queue<Integer> q = new LinkedList<>();
        q.add(curr);
        while(!q.isEmpty()){
            int cur = q.remove();
             if(!vis[cur]){
                for(int i= 0 ; i<graph[cur].size() ;i++){
                    q.add(graph[cur].get(i).destination);
                }
                vis[cur] = true;
                System.err.print(cur+" ");
            }
        }
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
       bsf(graph , vis); 
    }
}
