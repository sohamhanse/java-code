package recursion;

public class no_of_way_to_attain_party {
    public static int party(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // int fmn1= party(n-1);
        // int fmn2 = party(n-2);
        // int pair =(n-1) * fmn2;
        // return pair + fmn1 ;

        // same code only in short form

        return party(n - 1) + (n - 1) * party(n - 2);

        // one more way of writing code (more faster than above one )
        // takes less time complexity 
        
        // if(n%2 == 0 ){
              // return party(n - 1) + (n - 1) * 2;   // because party(n - 2) always give 2 in output if num is even
                                                    
        //  }
        //  return party(n - 1) + (n - 1) * 1;        // gives 1 in output if num is odd
    }

    public static void main(String arg[]) {
        System.out.println(party(3));
    }
}
