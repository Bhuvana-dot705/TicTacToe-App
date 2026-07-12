public class TicTacToe {

    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    // UC10: Detect Draw Condition
    public static boolean isDraw() {

        // Check for any empty cell
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        // No empty cells found
        return true;
    }

    public static void main(String[] args) {

        if (isDraw()) {
            System.out.println("Game is a Draw!");
        } else {
            System.out.println("Game is Not a Draw!");
        }
    }
}