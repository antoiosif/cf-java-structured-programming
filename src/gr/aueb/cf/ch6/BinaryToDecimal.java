package gr.aueb.cf.ch6;

public class BinaryToDecimal {

    public static void main(String[] args) {
        int[] vector = {1, 0, 0, 0, 1, 1, 1, 0};    // 142
        int decimal = binaryBigEndianToDecimal(vector);
        System.out.println("Value: " + decimal);
    }

    /**
     * Converts a binary vector to decimal.
     * Assume that the binary vector is given in
     * Big-endian form -- MSB (Most Significant Bit) first,
     * and LSB (Least Significant Bit) last--.
     *
     * @param binaryVector  The source vector.
     * @return              The decimal representation of the vector.
     */
    public static int binaryBigEndianToDecimal(int[] binaryVector) {
        int decimal = 0;
        int n;

        if (binaryVector == null) {
            throw new IllegalArgumentException();
        }

        n = binaryVector.length;
        for (int i = n - 1; i >= 0; i--) {
            decimal = decimal + binaryVector[i] * (int) Math.pow(2, n - 1 - i);
        }

        return decimal;
    }

    /**
     * Converts a binary vector to decimal.
     * Assume that the binary vector is given in
     * Little-endian form -- LSB (Least Significant Bit) first,
     * and MSB (Most Significant Bit) last--.
     *
     * @param binaryVector  The source vector.
     * @return              The decimal representation of the vector.
     */
    public static int binaryLittleEndianToDecimal(int[] binaryVector) {
        int decimal = 0;
        int n;

        if (binaryVector == null) {
            throw new IllegalArgumentException();
        }

        n = binaryVector.length;
        for (int i = 0; i < n; i++) {
            decimal = decimal + binaryVector[i] * (int) Math.pow(2, i);
        }

        return decimal;
    }
}
