public class TicTacToe {

    static char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'X'}
    };

    // UC9: Check Winning Condition
    public static boolean checkWinner(char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {
                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // Check secondary diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        if (checkWinner('X')) {
            System.out.println("Player X Wins!");
        } else if (checkWinner('O')) {
            System.out.println("Player O Wins!");
        } else {
            System.out.println("No Winner");
        }
    }
}