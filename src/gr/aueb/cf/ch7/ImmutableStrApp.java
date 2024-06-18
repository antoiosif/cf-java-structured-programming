package gr.aueb.cf.ch7;

/**
 * When a string gets a new value, it does
 * not change the contents of its memory storage.
 * Thus, strings can not be changed, they are
 * unchangeable or immutable.
 * Instead, a new string area is created in the heap
 * to store the new string.
 * The reference (s1) gets a new value (points to a
 * new position), while the old string remains unreferenced
 * and then is garbage collected.
 */
public class ImmutableStrApp {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding Factory";

        s1 = "Coding Plus";
        System.out.println(s1);
        System.out.println(s2);
    }
}
