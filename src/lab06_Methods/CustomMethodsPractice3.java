package lab06_Methods;

public class CustomMethodsPractice3 {
    public static void main(String[] args) {

        System.out.println(doubleChar("Cydeo"));

        System.out.println(endLy("friendly"));

        System.out.println(endLy("Cydeo"));

        System.out.println("*******************************");

        System.out.println(hasBad("badXXX"));
        System.out.println(hasBad("xbadXXX"));
        System.out.println(hasBad("XXbad"));

        System.out.println("********************");

        System.out.println(atFirst("ba"));
        System.out.println(atFirst("a"));
        System.out.println(atFirst("Hello"));
        System.out.println(atFirst(""));
        System.out.println("********************");

        System.out.println(isPalindrome("Java"));

        System.out.println(isPalindrome("Level"));

    }


    public static String doubleChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            // result += ""+ each+each;
            result += each;
            result += each;
        }


        return result;
    }

    public static boolean endLy(String str) {
        return str.endsWith("ly");
    }

    public static boolean hasBad(String str) {
        if (str.equals("bad")) {
            return true;
        }
        if (str.length() < 4) {
            return false;
        }
        if (str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }

    public static String atFirst (String str){
        if (str.isEmpty()){
            return "@@";
        }else if (str.length()==1){
            return str +"@";
        }else {
            return str.substring(0,2);
        }
    }

public static boolean isPalindrome (String str){
        return (str.equalsIgnoreCase(StringUtility.reverse(str)));
}

}
