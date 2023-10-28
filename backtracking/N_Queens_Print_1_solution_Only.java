package backtracking;

public class N_Queens_Print_1_solution_Only {
    public static boolean issafe(char ch[][], int row, int col) {
        // vertical upward check
        for (int i = row - 1; i >= 0; i--) {
            if (ch[i][col] == 'Q')
                return false;
        }
        // diagonally left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (ch[i][j] == 'Q')
                return false;
        }
        // disgonally right
        for (int i = row - 1, j = col + 1; i >= 0 && j < ch[0].length; i--, j++) {
            if (ch[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static boolean queens(char ch[][], int row) {
        if (row == ch.length) {
            return true;
        }
        for (int i = 0; i < ch[0].length; i++) {

            if (issafe(ch, row, i) == true) {
                ch[row][i] = 'Q';
                if (queens(ch, row + 1)) {
                    return true;
                }
                ch[row][i] = '*';
            }
        }
        return false;
    }

    public static void print(char ch[][]) {
        System.out.println("-------- N_queen -----------");
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        int n = 4;
        char ch[][] = new char[n][n];

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                ch[i][j] = '*';
            }
        }

        if (queens(ch, 0)) {
            System.out.println("THERE IS SOLUTION");
            print(ch);
        } else {
            System.out.println("THERE IS NO SOLUTION"); 
        }

    }
}
