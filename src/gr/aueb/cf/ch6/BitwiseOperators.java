package gr.aueb.cf.ch6;

public class BitwiseOperators {

    public static void main(String[] args) {

    }

    /**
     * Implements the logical XOR between two booleans.
     *
     * @param b1    the first boolean.
     * @param b2    the second boolean.
     * @return      the logical XOR output.
     */
    public static boolean XOR(boolean b1, boolean b2) {
        return (b1 && !b2) || (!b1 && b2);
    }

    /**
     * Converts a binary number to one's compliment format.
     * That is 1 -> 0 and 0 -> 1. That is the ~ bitwise operator.
     *
     * @param vector    the source binary number.
     * @return          the one's compliment.
     */
    public static int[] complimentByOne(int[] vector) {
        int[] binOut;

        if (vector == null) throw new IllegalArgumentException();
        binOut = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            binOut[i] = (vector[i] == 0 ? 1 : 0);
        }

        return binOut;
    }
}

