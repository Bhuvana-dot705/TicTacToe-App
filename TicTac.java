import java.util.Scanner;

public class TicTac {

    // Method to accept user slot input
    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        int slot;

        do {
            System.out.print("Enter a slot number (1-9): ");
            slot = sc.nextInt();

            if (slot < 1 || slot > 9) {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
            }

        } while (slot < 1 || slot > 9);

        return slot;
    }

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Selected Slot: " + slot);
    }
}