package lab06_Methods;

import java.io.FilterOutputStream;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        String str = helloName("Bob");
        System.out.println(helloName("James"));
        System.out.println(str);
        System.out.println("******************************");
        String abba = makeAbba("Hi", "Bye");
        System.out.println("abba = " + abba);
        System.out.println("****************************");
        String b = "Hello";
        System.out.println(extraEnd(b));
        System.out.println("****************************");

        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo(""));

        System.out.println("****************************");

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("School"));


    }

  /*  public static String helloName(String name) {


        return "Hello " + name + "!";

    }*/

    public static String helloName(String name) {
        String result = "Hello " + name + "!";
        return result;
    }

    public static String makeAbba(String a, String b) {

        String result = a + b + b + a;
        return result;
    }

    public static String extraEnd(String a) {
        if (a.length() < 2) {
            return a;
        }

        String substring = a.substring(a.length() - 2);
        String result = substring.repeat(3);
        return result;
    }

    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;

        }
        return str.substring(0, 2);
    }

    public static String withoutEnd(String str) {
        if (str.length() >= 3) {
            return str.substring(1, str.length() - 1);
        } else {
            return str;
        }
    }






}
