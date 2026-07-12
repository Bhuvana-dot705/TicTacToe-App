import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // UC6: Place Move on Board
    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
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

        // Example move
        placeMove(0, 0, 'X');
        placeMove(1, 1, 'O');

        displayBoard();
    }
}