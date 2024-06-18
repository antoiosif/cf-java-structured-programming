package gr.aueb.cf.ch7;

/**
 * Demo of concat.
 */
public class ConcatStrApp {

    public static void main(String[] args) {
        String firstname = "Athanasios";
        String lastname = "Androutsos";
        String title = "Dr.";
        String fullName1, fullName2, fullName3, fullName4;

        // + operator is overloaded in Java.
        // When applied to strings is considered concat
        fullName1 = firstname + lastname;
        fullName2 = title + firstname + lastname;
        fullName3 = firstname.concat(lastname);
        fullName4 = title.concat(firstname).concat(lastname);   // method chain

        System.out.printf("Firstname: %s, Lastname: %s\n", firstname, lastname);
        System.out.println("Full name 1: " + fullName1);
        System.out.println("Full name 2: " + fullName2);
        System.out.println("Full name 3: " + fullName3);
        System.out.println("Full name 4: " + fullName4);
    }
}
