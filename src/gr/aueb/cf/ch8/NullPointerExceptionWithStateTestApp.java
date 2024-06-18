package gr.aueb.cf.ch8;

/**
 * Null Pointer Exception.
 */
public class NullPointerExceptionWithStateTestApp {

    public static void main(String[] args) {
        String s = null;

        if (s == null) {
            System.out.println("String is null");
            return;
        }
        if (s.equals("Coding")) System.out.println("Coding");
    }
}
