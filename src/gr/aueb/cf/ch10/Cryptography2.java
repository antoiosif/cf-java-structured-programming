package gr.aueb.cf.ch10;

import java.util.ArrayList;
import java.util.Scanner;

public class Cryptography2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int KEY = 128;
        String s;
        String s1, s2;

        System.out.println("Please insert a string");
        s = in.nextLine();

        s1 = encrypt(s, KEY).toString();
        System.out.println(s1);

        s2 = decrypt(encrypt(s, KEY), KEY).toString();
        System.out.println(s2);
    }

    public static ArrayList<Integer> encrypt(String s, int key) {
        ArrayList<Integer> encrypted = new ArrayList<>();
        char ch;
        int cipher = 0;
        int prev = -1;
        int i = 0;

        while ((ch = s.charAt(i)) != '#') {
            cipher = cipher(ch, prev, key);
            encrypted.add(cipher);
            prev = cipher;
            i++;
        }
        encrypted.add(-1);
        return encrypted;
    }

    public static int cipher(char ch, int prev, int key) {
        if (prev == -1) return ch;
        return (ch + prev) % key;
    }

    public static ArrayList<Character> decrypt(ArrayList<Integer> encrypted, int key) {
        ArrayList<Character> decrypted = new ArrayList<>();
        char ch;
        int cipher = 0;
        int prev = -1;
        int i = 0;

        while ((cipher = encrypted.get(i)) != -1) {
            ch = decipher(cipher, prev, key);
            decrypted.add(ch);
            prev = cipher;
            i++;
        }
        decrypted.add('#');
        return decrypted;
    }

    public static char decipher(int cipher, int prev, int key) {
        if (prev == -1) return (char) cipher;
        return (char) ((cipher - prev + key) % key);
    }
}
