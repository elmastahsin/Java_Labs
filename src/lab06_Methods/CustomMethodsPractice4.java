package lab06_Methods;

public class CustomMethodsPractice4 {


    public static void main(String[] args) {

        String str = "aaaaaabccdeeeef";
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
          /*  char each = str.charAt(i);

            int f = StringUtility.frequency(str, each);
            if (f == 1) {
                unique += each;
            }*/

            if (StringUtility.frequency(str, str.charAt(i))==1){
                unique += str.charAt(i);
            }

        }

        System.out.println(unique);



        System.out.println("-----------------------------");

        String s = "aaabbc";//a3b2c1

        String nonDup = StringUtility.removeDup(s);
        String result ="";

        for (int i = 0; i <nonDup.length() ; i++) {
       //     int a = StringUtility.frequency(s,nonDup.charAt(i));
         //   result += "" + nonDup.charAt(i) + a;
            result  += ""+ nonDup.charAt(i)+StringUtility.frequency(s,nonDup.charAt(i));

        }
        System.out.println(result);


    }
}
