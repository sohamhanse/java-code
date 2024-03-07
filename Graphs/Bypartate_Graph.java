package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bypartate_Graph {
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

    public static boolean bsf(ArrayList<edge> graph [] , boolean vis[] , int color[]){
        for(int i = 0 ; i < graph.length ; i++){
            if(!vis[i] && ! bsfutil(graph,i,vis,color)){
                return false;
            }
        }
        return true;
    }

    public static boolean bsfutil(ArrayList<edge> graph [] , int curr , boolean vis [] ,int color[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(curr);
        color[curr] = 1;
        while(!q.isEmpty()){
            int cur = q.remove();
             if(!vis[cur]){
                for(int i= 0 ; i<graph[cur].size() ;i++){
                    q.add(graph[cur].get(i).destination);

                    if(!vis[graph[cur].get(i).destination]){
                        if(color[cur] == 1){
                            color[graph[cur].get(i).destination] = 2;
                        }else{
                            color[graph[cur].get(i).destination] = 1;
                        }
                    }
                } 
                vis[cur] = true;
            }else{
                for(int i= 0 ; i<graph[cur].size() ;i++){
                    if(color[cur] == color[graph[cur].get(i).destination]){
                        return false;
                    }
                }  
            }
            
        }
        return true;
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
       //       2         3                       \(6)
       //       |         |                        \
       //   (2) |         | (2)                     8
       //       |         |
       //       4         5
       //
       // it will return true 
       // if we joint 2,3 then it will return false


       for(int i= 0 ; i<graph.length ; i++){
        graph[i] = new ArrayList<>();
       }

       graph[0].add(new edge(0, 1, 5));

       graph[1].add(new edge(1 , 0, 5));
       graph[1].add(new edge(1, 2, 1));
       graph[1].add(new edge(1, 3, 3));

       graph[2].add(new edge(2, 1, 1));
       graph[2].add(new edge(2, 4, 2));

       graph[3].add(new edge(3, 1, 3));
       graph[3].add(new edge(3, 5, 2));

       graph[4].add(new edge(4, 2, 2));

       graph[5].add(new edge(5, 3, 2));

       graph[6].add(new edge(6, 7, 4));

       graph[7].add(new edge(7, 6, 4));
       graph[7].add(new edge(7, 8, 6));

       graph[8].add(new edge(8, 7, 6));



       boolean vis[] = new boolean[v];
       int color[] = new int[v];
       // 0 no color
       // 1 yellow
       // 2 blue
       System.out.println(bsf(graph , vis , color));
       
    }
}
