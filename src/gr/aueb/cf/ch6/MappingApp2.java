package gr.aueb.cf.ch6;

/**
 * Demonstrates Array Mapping.
 */
public class MappingApp2 {

    public static void main(String[] args) {
        int[] salaries = {1000, 1200, 900, 1700};
        double bonus = 0.25;
        double[] wages = getWagesWithBonus(salaries, bonus);

        for (double wage : wages) {
            System.out.print(wage + " ");
        }
    }

    /**
     * Returns a new array of the wages plus the bonus.
     *
     * @param arr       the array of initial wages.
     * @param bonus     the bonus, i.e. 0.10 as a
     *                  percentage of the wage.
     * @return          the updated waged.
     */
    public static double[] getWagesWithBonus(int[] arr, double bonus) {
        if (arr == null || arr.length == 0) return new double[0];

        double[] wages = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            wages[i] = arr[i] + (bonus * arr[i]);
        }

        return wages;
    }
}

