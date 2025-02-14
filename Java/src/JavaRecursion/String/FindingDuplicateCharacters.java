package JavaRecursion.String;
import java.lang.StringBuilder;

// Write a recursive function to find all duplicate characters in a string.

public class FindingDuplicateCharacters {
    public static void main(String[] args) {

        FindingDuplicateCharacters obj = new FindingDuplicateCharacters();
        String text = "Hi, there. I'm Aswin Roy C from Chennai.";//

        System.out.println("Given string:\n"+text);
        System.out.println("\nThe duplicate characters in the string:\n"+obj.duplicateCharacters(text, 0, new StringBuilder(), new StringBuilder()));
    }

    public StringBuilder duplicateCharacters(String data, int index, StringBuilder duplicates, StringBuilder seen){
        if(index >= data.length()){
            return duplicates;
        }

        if(Character.isLetter(data.charAt(index))) {
            char currentLetter = Character.toLowerCase(data.charAt(index));

            if(seen.toString().contains(Character.toString(currentLetter))){

                if(!duplicates.toString().contains(Character.toString(currentLetter))){
                   duplicates.append(currentLetter).append(" ");
                }

            } else {
                seen.append(currentLetter);
            }
        }//
        return duplicateCharacters(data, index+1, duplicates, seen);
    }
}
