package lab05_String;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a duplicate string: ");

        String a = input.next();

        String result ="";

        for (int i = 0; i < a.length(); i++) {
            char each = a.charAt(i);
            if (!result.contains(""+ each)){
                result+= each;

            }

        }
        System.out.println("result = " + result);
    }
}
