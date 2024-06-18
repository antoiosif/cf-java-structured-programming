package gr.aueb.cf.ch5;

/**
 * Παραστάσεις floating point.
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.8F;
        double doubleNum1 = 12.8;

        float resultFloat = 0.0F;
        double resultDouble = 0.0;

        // Αν υπάρχει ένας float οι μικρότεροι μεγέθους τύποι
        // μετατρέπονται σε float.
        resultFloat = floatNum + intNum;

        // Αν υπάρχει έστω και ένας double,
        // τα intNum1 και floatNum μεταρέπονται σε double
        resultDouble = doubleNum1 + floatNum + intNum;

        System.out.printf("floatResult = %f\n", resultFloat);
        System.out.printf("doubleResult = %f", resultDouble);
    }
}
