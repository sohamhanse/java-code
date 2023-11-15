package Heaps_priority_queue;

import java.util.PriorityQueue;

public class weakest_solder {
    static class weak implements Comparable<weak>{
        String row ; 
        int solder;
        int idx;
        weak(String row , int solder ,int idx){
            this.row = row;
            this.solder = solder;
            this.idx = idx;
        }

        @Override
        public int compareTo(weak d){
            if(this.solder == d.solder){
                return this.idx - d.idx;
            }
            return this.solder - d.solder;
        }
    }

    public static void mindis(int arr[][],PriorityQueue<weak> pq){
        for(int i = 0  ; i<arr.length ; i++){
            int count = 0;
            for(int j = 0 ; j< arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            pq.add(new weak("r"+i, count , i));
        }
    }

    public static void main(String arg[]){
        int ptr[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        PriorityQueue<weak> pq = new PriorityQueue<>();
        mindis(ptr, pq);
        while(!pq.isEmpty()){
            System.out.println(pq.peek().row + "-> " + pq.peek().solder);
            pq.remove();
        }
    }
}
