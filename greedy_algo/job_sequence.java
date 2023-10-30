package greedy_algo;

import java.util.*;

public class job_sequence {
    public static class job {
        int id;
        int deadline;
        int value;

        job(int id, int deadline, int value) {
            this.id = id;
            this.deadline = deadline;
            this.value = value;
        }
    }

    public static void main(String arg[]) {
        int pair[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<job> jobs = new ArrayList<>();
        for(int i = 0 ;i<pair.length;i++){
            jobs.add(new job(i, pair[i][0], pair[i][1]));
        }
        Collections.sort(jobs, (a, b) -> b.value - a.value); // Sort in descending order of value

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0 ;i<jobs.size() ;i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Maximum jobs can be done :- " + seq.size());
        System.err.println("job sequence : -");
        for(int i = 0 ;i<seq.size();i++){
            System.out.print(seq.get(i) + "->" );
        }

        //This method use to sort by 2D array and then we use greedy algo 
        // Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        // int ed = 0;
        // int amount = 0;
        // for (int i = pair.length - 1; i >= 0; i--) {
        //     if (pair[i][0] > ed) {
        //         amount += pair[i][1];
        //         ed++;
        //     }
        // }
        // System.out.println(amount);
    }
}
