import java.util.Random;

public class TicTacToe {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // UC7: Computer Makes a Random Move (Easy Level)
    public static void computerMove() {

        Random random = new Random();

        while (true) {

            // Generate random slot (1–9)
            int slot = random.nextInt(9) + 1;

            // Convert slot to row and column
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Check if the cell is empty
            if (board[row][col] == ' ') {
                board[row][col] = 'O';
                System.out.println("Computer selected slot: " + slot);
                break;
            }
        }
    }

    // Display Board
    public static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void main(String[] args) {

        computerMove();
        displayBoard();
    }
}