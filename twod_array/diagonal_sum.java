package twod_array;

public class diagonal_sum {
    public static void diagonal(int matrix[][]) {
        int sum=0;
        //time complexity of following code is O(n^2)

        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //         if(i+j == matrix.length-1 && i!=j)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        //time complexity of following code is O(n)
        
        for(int i=0;i<matrix.length;i++)
        {
            sum += matrix[i][i];
            if(i!= matrix.length-1-i)
            sum+= matrix[i][matrix.length-1-i];
        }

        System.out.println(sum);;
    }
    public static void main(String arg[]) {
        int matrix[][] = { { 1, 2, 3, 4 ,17},
                           { 5, 6, 7, 8 ,18},
                           { 9, 10, 11, 12 ,19}, 
                           { 13, 14, 15, 16 ,20},
                           { 21, 22, 23, 24, 25} 
                         };
        
        diagonal(matrix);
    }
}
