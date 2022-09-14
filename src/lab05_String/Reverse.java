package lab05_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).nextLine();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char each = word.charAt(i);
            reverse += "" + each;

        }
        System.out.println("reverse = " + reverse);
    }
}
