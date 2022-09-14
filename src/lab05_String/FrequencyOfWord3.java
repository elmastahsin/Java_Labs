package lab05_String;

public class FrequencyOfWord3 {
    public static void main(String[] args) {
        String s = "Java Java Java Java Python C# Ruby Java Java";

        int countJava = 0;
        for (int i = 0; i <= s.length() - 4; i++) {

            String each = s.substring(i, (i + 4));
            if (each.equals("Java")) {
                countJava++;

            }
        }
        System.out.println("countJava = " + countJava);
    }
}
