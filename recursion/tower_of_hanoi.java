package recursion;

public class tower_of_hanoi {
    public static void hanoi(String src , String helper , String dest ,int n ){
        if(n == 1){
            System.out.println("transfer disk "+n+"from "+src+" to "+dest);
            return;
        }

        //transfer top n-1 from src to helper usingdest as 'helper'
        hanoi(src, dest , helper, n-1 );
        System.out.println("transfer disk "+n+"from "+src+" to "+dest);
        hanoi(helper, src , dest, n-1 );
}
    public static void main(String arg[]){
        hanoi("a", "b","c" , 3);
    }
}
