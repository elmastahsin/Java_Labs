package lab05_String;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java Python C# Ruby";

        int originalLength =  sentence.length();
        String temp = sentence;
        temp = temp.replace("Java", "aaa");
        System.out.println(originalLength);
        int newLength = temp.length();
        System.out.println(newLength);
        System.out.println("Frequency of word = " + (originalLength - newLength));
    }
}
