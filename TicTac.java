public class TicTac {

    // Method to convert slot number to row and column
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[] { row, col };
    }

    public static void main(String[] args) {

        int slot = 7;

        int[] index = convertSlotToIndex(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + index[0]);
        System.out.println("Column: " + index[1]);
    }
}