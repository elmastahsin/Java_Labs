package lab06_Methods;

public class CustomMethosPractice2 {
    public static void main(String[] args) {

        System.out.println(comboString("Hello", "Hi"));

        System.out.println("***********************");

        System.out.println(left2("Hello"));
        System.out.println(left2("Java"));

        System.out.println("**********************");

        System.out.println(right2("Hello"));
        System.out.println(right2("Java"));
        System.out.println(right2("Hi"));

        System.out.println("***************************");

        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("Hello"));
        System.out.println(frontAgain("Java"));

        System.out.println("***************************");

        System.out.println(countHi("Hi Hi Hi hi Hi"));

        System.out.println("*******************************");

        System.out.println();


    }

    public static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else if (b.length() > a.length()) {
            return a + b + a;
        } else {
            return a + b;
        }

    }

    public static String left2 (String str){
        if (str.length()<3){
            return str;
        }
        String s1 = str.substring(0,2);
        String s2 = str.substring(2);

        String result = s2 + s1 ;
        return result;
    }

    public static String right2 (String str ){
        if (str.length()<3){
            return str;

        }
        String s1 = str.substring(str.length()-2);
        String s2 = str.substring(0,str.length()-2);
        String result = s1+ s2;
        return result;
    }

    public static boolean frontAgain(String str){
        if (str.length()<2){
            return false;
        }
        return str.substring(0,2).equals(str.substring(str.length()-2));
    }

    public static int countHi(String str){
        str = str.toLowerCase();
      return  StringUtility.frequency(str, "hi");
    }

    public static boolean catDog (String str ){
        str = str.toLowerCase();
        int countCat = StringUtility.frequency(str,"cat");
        int countDog = StringUtility.frequency(str,"dog");

        return countDog==countCat;
    }



}
