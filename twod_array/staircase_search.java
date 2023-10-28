package twod_array;
public class staircase_search {
    public static boolean search(int matrix[][],int key) {
        int row = matrix.length-1;
        int col = 0;
        while(row>=0 && col<matrix[0].length)
        {
            if(key == matrix[row][col])
            {
                System.out.println("key found at (" + row + "," + col + ")");
                return true;
            }
            else if(key > matrix[row][col])
            {
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("key not found");
        return false;
        }
    
    public static void main(String[] args) {
        int matrix[][] = { { 1,   2,  3,  4 ,17},
                           { 5,   6,  7,  8 ,18},
                           { 9,  10, 11, 12 ,19}, 
                           { 13, 14, 15, 16 ,20},
                           { 21, 22, 23, 24 ,25} 
                    };
        
        int key=8;
        char ch [] = {'a','b'};
        System.out.println(ch);

        search(matrix , key);
    }   
}
