import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // UC5: Validate User Move
    public static boolean isValidMove(int row, int col) {

        // Check if row and column are within bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if the cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        if (isValidMove(row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}