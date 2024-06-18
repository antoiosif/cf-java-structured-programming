package gr.aueb.cf.ch6;

public class FilteringGradesApp {

    public static void main(String[] args) {
        int[] grades = new int[] {4, 9, 9, 8, 7, 2, 1, 4, 10};
        final int PASS = 5;

        int[] passed = getPassGrades(grades, PASS);
        for (int pass : passed) {
            System.out.print(pass + " ");
        }
    }

    /**
     * Returns an array with the grades that are
     * greater or equal to a certain limit.
     *
     * @param grades    the source array of grades.
     * @param limit     the pass grade limit.
     * @return          a new array wth the 'pass' elements.
     */
    public static int[] getPassGrades(int[] grades, int limit) {
        int[] passed;
        int count = 0;
        int i = -1;

        if (grades == null || grades.length == 0) return new int[0];
        for (int grade : grades) {
            if (grade >= limit) {
                count++;
            }
        }
        passed = new int[count];
        for (int grade : grades) {
            if (grade >= 5) {
                passed[++i] = grade;
            }
        }

        return passed;
    }
}
