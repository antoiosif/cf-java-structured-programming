package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) throws FileNotFoundException{
        int num = 0;
        File fd = new File("C:\\tmp\\hello.txt");

        try (Scanner in = new Scanner(fd)){
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException | FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
