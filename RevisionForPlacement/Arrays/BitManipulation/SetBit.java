package RevisionForPlacement.Arrays.BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int num = 13; // Binary: 1001
        int i = 2;

        int shft = 1 << i;       // Shift 1 by i positions: 0001 << 2 = 0100
        int result = num | shft; // Set the ith bit

        System.out.println("Original number: " + num + " (Binary: " + Integer.toBinaryString(num) + ")");
        System.out.println("After setting bit " + i + ": " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}
