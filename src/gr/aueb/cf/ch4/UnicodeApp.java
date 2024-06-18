package gr.aueb.cf.ch4;

/**
 * Unicodes greater than 4 Hex digits
 * could be represented in UTF-16 by
 * surrogate pairs.
 * There are surrogate pairs calculators.
 * Or by calling Character wrapper class with
 * toString method.
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F600;    // UTF-8 smiley

        System.out.println("Smiley: \uD83D\uDE00");

        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
