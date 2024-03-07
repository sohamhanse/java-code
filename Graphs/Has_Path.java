package Graphs;
import java.util.*;
public class Has_Path {
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

    public static boolean haspath(ArrayList<edge> graph [] ,int curr ,int desti, boolean vis []){
        if(curr == desti ){
            return true;
        }
        vis[curr] = true;
        for(int i = 0 ; i< graph[curr].size() ; i++){
            if(!vis[graph[curr].get(i).destination] && haspath(graph, graph[curr].get(i).destination, desti ,vis)){
                return  true;
            } 
      } 
      return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String arg[]){
        int v = 6;
        ArrayList<edge> graph [] = new ArrayList[v];
        //  Graph :-
       //       (5)
       //    0 ----- 1
       //           / \
       //      (1) /   \ (3)
       //         /     \
       //        /       \
       //       2 ------- 3
       //       |   (1)   |    
       //   (2) |         | (2)
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

       boolean vis[] = new boolean[v];
      System.out.println(haspath(graph , 0 ,9, vis)); 
    }
}
