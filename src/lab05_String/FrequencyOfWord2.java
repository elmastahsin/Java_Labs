package lab05_String;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String s = "Java Java Java Java Python C# Ruby";

        int countJava = 0 ;

        while (s.contains("Java")){

          s = s.replaceFirst("Java","");

            countJava++;
        }
        System.out.println("countJava = " + countJava);
    }
}
