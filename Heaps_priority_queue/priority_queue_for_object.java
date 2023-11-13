package Heaps_priority_queue;
import java.util.*;
public class priority_queue_for_object {
    static class student implements Comparable<student>{
        String name;
        int rollno;

        student(String name , int rollno){
            this.name =name;
            this.rollno =rollno;
        }

        @Override
        public int compareTo(student s2){
            return this.rollno - s2.rollno;
        }
    }
    public static void main(String arg[]){
        PriorityQueue<student> pq = new PriorityQueue<>();
       // PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder()); ->   use this to get roll no in reverse order or in assending order
        pq.add(new student("soham",10));
        pq.add(new student("sanket",5));
        pq.add(new student("sandeep",2));
        pq.add(new student("suvarna",1));
        while(! pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rollno);
            pq.remove();
        }
    }
}
