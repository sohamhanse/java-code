package Heaps_priority_queue;

import java.util.*;

public class nearby_car {
    static class dist implements Comparable<dist>{
        String car ; 
        int dis;
        dist(String car , int dis){
            this.car = car;
            this.dis = dis;
        }

        @Override
        public int compareTo(dist d){
            return this.dis - d.dis;
        }
    }

    public static void mindis(int arr[][],PriorityQueue<dist> pq){
        for(int i = 0  ; i<arr.length ; i++){
            int d = (arr[i][0]*arr[i][0]) + (arr[i][1]*arr[i][1]) ;
            pq.add(new dist("c"+i, d));
        }
    }

    public static void main(String arg[]){
        int ptr[][] = {{3,3},{5,-1},{-2,4}};
        PriorityQueue<dist> pq = new PriorityQueue<>();
        mindis(ptr, pq);
        while(!pq.isEmpty()){
            System.out.println(pq.peek().car + "-> " + pq.peek().dis);
            pq.remove();
        }
        System.out.println(pq.size());
    }
}
