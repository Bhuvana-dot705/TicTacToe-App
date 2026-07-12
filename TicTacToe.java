import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

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

    // Check valid move
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Place move
    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Check winner
    public static boolean checkWinner(char symbol) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;

            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
                return true;
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;
    }

    // Check draw
    public static boolean isDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    // Computer random move
    public static void computerMove() {
        while (true) {
            int slot = random.nextInt(9) + 1;
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                placeMove(row, col, 'O');
                System.out.println("Computer selected slot: " + slot);
                break;
            }
        }
    }

    // UC8: Continuous Turn-Based Game Loop
    public static void main(String[] args) {

        boolean playerTurn = true;

        while (true) {

            displayBoard();

            if (playerTurn) {
                System.out.print("Enter slot (1-9): ");
                int slot = sc.nextInt();

                int row = (slot - 1) / 3;
                int col = (slot - 1) % 3;

                if (isValidMove(row, col)) {
                    placeMove(row, col, 'X');

                    if (checkWinner('X')) {
                        displayBoard();
                        System.out.println("Player Wins!");
                        break;
                    }

                    if (isDraw()) {
                        displayBoard();
                        System.out.println("Game Draw!");
                        break;
                    }

                    playerTurn = false;
                } else {
                    System.out.println("Invalid Move! Try Again.");
                }

            } else {

                computerMove();

                if (checkWinner('O')) {
                    displayBoard();
                    System.out.println("Computer Wins!");
                    break;
                }

                if (isDraw()) {
                    displayBoard();
                    System.out.println("Game Draw!");
                    break;
                }

                playerTurn = true;
            }
        }

        sc.close();
    }
}