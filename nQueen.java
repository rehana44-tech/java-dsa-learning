import java.util.ArrayList;
import java.util.List;

class nQueen {

    public static boolean isSafe(int row, int col, char[][] board) {

        // horizontal
        for(int j = 0; j < board[0].length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // upper-left
        int r = row;

        for(int c = col; c >= 0 && r >= 0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        // upper-right
        r = row;

        for(int c = col; c < board[0].length && r >= 0; c++, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        // lower-left
        r = row;

        for(int c = col; c >= 0 && r < board.length; c--, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        // lower-right
        r = row;

        for(int c = col; c < board[0].length && r < board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {

        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i < board.length; i++) {

            String row = "";

            for(int j = 0; j < board[0].length; j++) {

                if(board[i][j] == 'Q') {
                    row += 'Q';
                }
                else {
                    row += '.';
                }
            }

            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    public static void nqueen(List<List<String>> allBoard, char[][] board, int col) {

        if(col == board.length) {
            saveBoard(board, allBoard);
            return;
        }

        for(int row = 0; row < board.length; row++) {

            if(isSafe(row, col, board)) {

                board[row][col] = 'Q';

                nqueen(allBoard, board, col + 1);

                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {

        int n = 4;

        List<List<String>> allBoard = new ArrayList<>();

        char[][] board = new char[n][n];

        nqueen(allBoard, board, 0);

        System.out.println(allBoard);
    }
}