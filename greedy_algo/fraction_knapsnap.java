package greedy_algo;

import java.util.*;

public class fraction_knapsnap {
    public static void main(String arg[]){
        int weight[] = {20,10,30};
        int value [] = {100 ,60 ,120};
        int activity [][] = new int[weight.length][3] ;
        int bagweigth = 50;

        for (int i = 0; i < weight.length; i++) {
            activity[i][0] = weight[i];
            activity[i][1] = value[i];
            activity[i][2] = activity[i][1] / activity[i][0];
        }
        Arrays.sort(activity , Comparator.comparingDouble(o -> o[2]));
        int val = 0 ;
        for(int i = weight.length-1 ; i>=0 ;i--){
            if(bagweigth == 0){
                break;
            }
            if(activity[i][0] <= bagweigth){
                val += activity[i][1];
                bagweigth -= activity[i][0];
            }else{
                val += bagweigth * activity[i][2];
            }
        }
        System.out.println(val);
    }
}
