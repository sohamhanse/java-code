package backtracking;

public class sudoku {
    public static boolean sudoku_solver(int pat [][], int row , int col ){
        //base case
        if(row == 9){
            return true;
        }

        //recursion
        int next_row = row , next_col = col+1;

        if(col + 1 == 9){
            next_row = row+1;
            next_col = 0;
        }

        if(pat [row] [col] != 0){
            return sudoku_solver(pat, next_row, next_col);
        }

        for(int digit = 1 ; digit <= 9 ; digit++){  //it is for placing digit in row from 1 to 9 
            if(safe(pat,row,col,digit)){
                pat[row] [col] = digit ;
               // for testing on next col digit can able to sit or not
                if(sudoku_solver(pat, next_row, next_col)){
                    return true;
                }
                // backtracting
                pat[row][col] = 0; // if in the following row we can not place element on next col of current col simply again back trace and make it 0
            }
        }

        return false;
    }
    public static boolean safe(int pat[][],int row,int col,int digit){
         for(int i= 1 ; i <= 8 ; i++){
            if(pat [i][col]== digit){
                return false;
            } 
         }

         for(int i= 1 ; i <= 8 ; i++){
            if(pat [row][i]== digit){
                return false;
            } 
         }

        int  sr =(row/3)*3;
        int  sc = (col/3)*3 ;
         for(int i= sr ; i < sr+3 ; i++){
            for(int j=  sc ; j < sc+3 ; j++){
              if(pat [i][j]== digit){
                return false;
            } 
         }
        }
        return true;
    }

    public static void print(int ch[][]) {
        System.out.println("-------- SUDOKU SOLVED -----------");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        int pat [] [] = 
    {   {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0}  } ;

        if(sudoku_solver(pat, 0, 0)){
            print(pat);
        }
        else{
            System.out.println("SUDOKU NOT SOLVED");
        }
    }
}
