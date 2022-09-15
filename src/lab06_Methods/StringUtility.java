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
}
