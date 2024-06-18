package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random-file.txt");

        try (Scanner in = new Scanner(file)) {
            char ch = (char) System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Exception: " + e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
