class sudokuSolver {

    public static boolean isSafe(char[][] board, int row, int col, int num) {

        // check column
        for (int i = 0; i < board.length; i++) {

            if (board[i][col] == (char)(num + '0')) {
                return false;
            }

            // check row
            if (board[row][i] == (char)(num + '0')) {
                return false;
            }
        }

        // check 3x3 grid
        int sr = row / 3 * 3;
        int sc = col / 3 * 3;

        for (int i = sr; i < sr + 3; i++) {

            for (int j = sc; j < sc + 3; j++) {

                if (board[i][j] == (char)(num + '0')) {
                    return false;
                }
            }
        }

        return true;
    }


    public static boolean helper(char[][] board, int row, int col) {

        // if we reached after the last row,
        // the Sudoku has been solved
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        // move to next column
        if (col != board.length - 1) {

            nrow = row;
            ncol = col + 1;

        }

        // move to first column of next row
        else {

            nrow = row + 1;
            ncol = 0;
        }


        // if cell is already filled
        if (board[row][col] != '.') {

            if (helper(board, nrow, ncol)) {
                return true;
            }
        }

        // if cell is empty
        else {

            // try numbers 1 to 9
            for (int i = 1; i <= 9; i++) {

                // check if number can be placed
                if (isSafe(board, row, col, i)) {

                    // place number
                    board[row][col] = (char)(i + '0');

                    // solve the next cell
                    if (helper(board, nrow, ncol)) {
                        return true;
                    }

                    // if it didn't work, undo
                    else {
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }


    public static void solvesudoku(char[][] board) {

        helper(board, 0, 0);
    }


    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},

            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},

            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };


        solvesudoku(board);


        // print solved Sudoku
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}