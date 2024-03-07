package Graphs;
import java.util.*;

import Graphs.Cycle_Detection_directed_Grafh.Edge;
public class topological_bfs {
    static class edge{
        int desti;
        int source;

        edge(int desti , int source){
            this.desti = desti;
            this.source = source;
        }
    }

    public static void tropology(ArrayList<Edge> graph[] , int arr[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int j = 0 ; j<graph[curr].size() ; j++){
                arr[graph[curr].get(j).desti]--;
                if(arr[graph[curr].get(j).desti] == 0){
                    q.add(graph[curr].get(j).desti);
                }
            } 
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String arg[]){
        //         5 ----------> 1     
        //          \            /\
        //           \            \
        //            \            \
        //            \/            \
        //             0            3
        //            /\           /\
        //            /            /
        //           /            / 
        //          /            /  
        //          4 --------> 2        
        //

        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList [v];

        for(int i = 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(4, 0));
        graph[5].add(new Edge(4, 1));



        int arr [] = new int[v];
        for(int i = 0 ; i<graph.length ; i++){
            for(int j = 0 ; j<graph[i].size() ; j++){
                arr[graph[i].get(j).desti]++;
            } 
        }
        
        tropology(graph , arr);
    }
}
