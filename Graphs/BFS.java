package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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

       Queue<Integer> q = new LinkedList<>();
       q.add(0);
       boolean visited[] = new boolean[v];

       while(!q.isEmpty()){
        int curr = q.remove();
        if(!visited[curr]){
            for(int j = 0 ; j < graph[curr].size() ; j++){
              q.add(graph[curr].get(j).destination);
            }
            visited[curr] = true;
            System.out.print(curr + " ");
        }
       }
    }
}
