package twod_array;
public class spyral_matrix {
    public static void spiral_print(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // top row
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startrow][i] + " ");
            }
            // rightside coloum
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            // bottom row
            for (int i = endcol - 1; i >= startcol; i--) {
                  if(startrow==endrow)
                  {
                      break;
                  }
                System.out.print(matrix[endrow][i] + " ");
            }
            // leftside coloum
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if(startcol==endcol)
                  {
                      break;
                  }
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 ,17},
                           { 5, 6, 7, 8 ,18},
                           { 9, 10, 11, 12 ,19}, 
                           { 13, 14, 15, 16 ,20},
                           { 21, 22, 23, 24, 25} 
                    };

        spiral_print(matrix);
    }
}
