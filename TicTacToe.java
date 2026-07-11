import java.util.Random;

public class TicTacToe {

    // Game variables
    static char[][] board = new char[3][3];
    static char humanSymbol;
    static char computerSymbol;
    static char currentPlayer;

    // UC1: Initialize board
    public static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // UC1: Display board
    public static void displayBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    // UC2: Toss
    public static void toss() {
        Random random = new Random();

        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            System.out.println("Human won the toss!");
            humanSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = humanSymbol;
        } else {
            System.out.println("Computer won the toss!");
            computerSymbol = 'X';
            humanSymbol = 'O';
            currentPlayer = computerSymbol;
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("First Player: " + currentPlayer);
    }

    public static void main(String[] args) {

        initializeBoard();
        displayBoard();

        toss();
    }
}