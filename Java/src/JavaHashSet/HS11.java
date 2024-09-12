package JavaHashSet;

import java.util.HashMap;
import java.util.HashSet;

// Write a program that counts the frequency of each word in a string using a HashSet and HashMap.
public class HS11 {
    public static void main(String[] args) {
        String originalString = "This is a test. This test is only a test.";
        System.out.println("Given string:\n" + originalString);

        String[] splitArray = originalString.replace(".", "").split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < splitArray.length; i++) {
            wordCount.put(splitArray[i], wordCount.getOrDefault(splitArray[i], 0) + 1);
        }
        HashSet<String> uniqueWords = new HashSet<>(wordCount.keySet());

        System.out.println("\nFinding the frequency of the word:\n" + wordCount.entrySet());
        System.out.println("\nExtracting only the unique words from the string:\n" + uniqueWords);
    }
}