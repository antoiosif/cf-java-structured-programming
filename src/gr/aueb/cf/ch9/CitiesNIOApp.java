package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CitiesNIOApp {

    public static void main(String[] args) {
        String line;
        String[] cities;

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/Users/IT/jtmp/cities-app/cities.txt"))) {
            Path dir = Paths.get("C:/Users/IT/jtmp/cities-app");
            if (Files.notExists(dir)) Files.createDirectory(dir);
            Path path;

            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");
                switch (cities[0]) {
                    case "Greece":
                        path = dir.resolve("gr.txt");
                        PrintStream gr = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                        print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        path = dir.resolve("usa.txt");
                        PrintStream usa = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        path = dir.resolve("de.txt");
                        PrintStream de = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                        print(de, "DE Cities");
                        print(de, cities);
                        break;
                    default:
                        System.out.println("Error in Cities");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.println(tokens[i]);
        }
    }

    public static void print(PrintStream ps, String message) {
        ps.println(message);
    }
}
