package Graphs;

import java.util.ArrayList;

public class Creation {
    static class edge{
        int source;
        int desti;
        int weight;
        edge(int source , int desti , int weight){
            this.desti = desti;
            this.source = source;
            this.weight = weight;
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String arg[]){
       //  Graph :-
       //       (5)
       //    0 ----- 1
       //           / \
       //      (1) /   \ (3)
       //         /     \
       //        /       \
       //       2 ------- 3
       //       |   (1)
       //   (2) |
       //       |
       //       4
       int v = 5;
       ArrayList<edge> graph [] = new ArrayList[v];
       for( int i = 0 ; i<v ; i++){
          graph[i] = new ArrayList<>();
       }

    // 0's vetises
    graph[0].add(new edge(0, 1, 5));

    // 1's vetises
    graph[1].add(new edge(1, 2, 1));
    graph[1].add(new edge(1, 3, 3));

    // 2's vetises
    graph[2].add(new edge(2, 1, 1));
    graph[2].add(new edge(2, 3, 1));
    graph[2].add(new edge(2, 4, 2));

    // 3's vetises
    graph[3].add(new edge(3, 1, 3));
    graph[3].add(new edge(3, 2, 1));

    //4's vetises
    graph[4].add(new edge(4, 2, 2));

    //2's neighbors
    for(int i= 0 ; i<graph[2].size() ; i++){
        System.out.println(graph[2].get(i).desti);
    }
  } 
}
