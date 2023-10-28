package backtracking;

public class Rat_In_Maze {
    public static boolean solution(int maze[][] , int row , int col,int visit[][] ,String str){
        //base case
        if(row == maze.length-1 && col == maze[0].length-1 && maze[row][col] == 1){  // when reach cell
            System.out.println(str);
            return true;
        }
        
          visit[row][col] = 1;
          
        //recursion
        if(issafe(maze,row,col) == true){

           if(visit[row] [col] ==1) {
            return false;
           }

        if(solution(maze, row, col+1,visit,str)){
            str = str+"R";
              return true ;
        }
        if(solution(maze, row+1, col,visit,str)){
            str = str+"D";
            return true ;
        }
        if(solution(maze, row-1, col,visit,str)){
            str = str+"U";
            return true ;
        }
        if(solution(maze, row, col-1,visit,str)){
            str = str+"L";
            return true ;
        }

         visit[row][col] = 0;

        }
       
       
        return false;
    }
   public static boolean issafe(int maze[][],int row,int col){

         if(row == maze.length || col == maze[0].length || row ==-1 || col == -1){ //for out the maze
            return false;
        }

        if(maze[row][col] == 0){
            return false;
        }

        return true;
    }

    public static void print(int ch [][]){
        for(int i = 0 ; i<ch.length ; i++){
            for(int j = 0 ; j<ch.length ; j++){
              System.out.print(ch[i][j]+" ") ; 
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int maze [][] = 
        {{1, 0, 0, 0},
         {1, 1, 0, 1},
         {0, 1, 0, 0},
         {1, 1, 1, 1}};

          int visit [][] = 
        {{0, 0, 0, 0},
         {0, 0, 0, 0},
         {0, 0, 0, 0},
         {0, 0, 0, 0}};

         solution(maze, 0, 0,visit,"");
         print(maze);
    }
}
