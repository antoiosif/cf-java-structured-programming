package gr.aueb.cf.ch7;

/**
 * Two types of String declaration and
 * initialization.
 */
public class StringDeclaration {

    public static void main(String[] args) {
        String alice = "Alice";
        String bob = new String("Bob");

        System.out.println("Length of \"Alice\" = " + alice.length());
        System.out.println("Length of \"Bob\" = " + bob.length());
        System.out.println("Total length = " + (alice.length() + bob.length()));
    }
}
