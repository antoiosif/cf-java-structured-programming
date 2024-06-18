package gr.aueb.cf.ch5;

public class FactorialRecursiveApp {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
//        if (n <= 1) {
//            return 1;
//        } else {
//            return n * factorial(n-1);
//        }


//        if (n <= 1) return 1;
//
//        return n * factorial(n-1);

        return (n <= 1) ? 1 : n * factorial(n-1);
    }
}
