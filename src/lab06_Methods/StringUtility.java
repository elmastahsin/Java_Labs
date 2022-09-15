package lab06_Methods;

public class StringUtility {
  /*  public static int frequency(String sentence, String word) {
      int count = 0;
        for (int i = 0; i <= sentence.length() - word.length(); i++) {

            String each = sentence.substring(i, (i + word.length()));
            if (each.equals(word)) {
                count++;

            }
        }
        return count;
        }*/

    // return the frequency of the given string
  public static int frequency(String sentence, String word) {

        int count = 0;

        while (sentence.contains(word)) {

            sentence = sentence.toLowerCase().replaceFirst(word, "");

            count++;
        }
        return count;
    }

    public static String reverse (String str){
     String result ="";
      for (int i = str.length()-1; i >=0;i--){
          result += str.charAt(i);
      }
      return result;
    }

    public static String removeDup ( String  str){
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(""+ each)){
                result+= each;

            }

        }
        return result;
    }

    public static int frequency (String str, char ch ){
      int count = 0 ;
      for (int i = 0  ;i<str.length();i++){
          if (str.charAt(i)==ch){
              count++;
          }

      }
      return count;
    }
}
