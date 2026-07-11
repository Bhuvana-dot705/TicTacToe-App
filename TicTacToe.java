public class TicTacToe {

    // 3x3 board
    static char[][] board = new char[3][3];

    // Initialize board with '-'
    public static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // Display board
    public static void displayBoard() {
        System.out.println("Current Tic-Tac-Toe Board:");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Initialize board
        initializeBoard();

        // Display empty board
        displayBoard();
    }
}