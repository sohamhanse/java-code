package Graphs;

import java.util.*;

public class Cycle_Detection_directed_Grafh {
    static class Edge{
        int source;
        int desti;
        Edge(int source , int desti){
            this.source = source;
            this.desti = desti;
        }
    }

    public static boolean cycle(ArrayList<Edge> graph[] , Stack<Integer> s , boolean vis[]){
        for(int i = 0 ; i<graph.length ; i++){
            if(!vis[i] && detect(graph , s , vis , i)){
                return true;
            }
        }
        return false;
    }

    public static boolean detect(ArrayList<Edge>[] graph, Stack<Integer> s, boolean[] vis, int curr) {
        vis[curr] = true;
        s.push(curr);
    
        for (int i = 0; i < graph[curr].size(); i++) {
            if (vis[graph[curr].get(i).desti]) {
                if (s.contains(graph[curr].get(i).desti)) {
                    return true;
                }
            } else{
                if (detect(graph, s, vis, graph[curr].get(i).desti)) {
                    return true;  
                }
            }
           
        }
    
        s.pop();  
        return false; 
    }
    @SuppressWarnings("unchecked")
    public static void main(String arg[]){

        //         0 --------> 1     
        //                    ^  \
        //                    |   \
        //                    |    \
        //                    |    \/
        //                    |     2
        //                    |    /
        //                    |   /
        //                    |  / 
        //                    | \/   
        //                    3        
        //

        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList [v];

        for(int i = 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));

        
        boolean vis[] = new boolean[v];
        Stack<Integer> s = new Stack<>();
        System.out.println(cycle(graph ,s , vis ));
    }
}


