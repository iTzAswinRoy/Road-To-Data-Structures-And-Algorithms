package JavaRecursion.String;
import java.lang.StringBuilder;

// Write a recursive function to remove all adjacent duplicate characters in a string.
public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {

        RemoveAdjacentDuplicates obj = new RemoveAdjacentDuplicates();
//        StringBuilder text = new StringBuilder();
//         text.append("aaxbbyccz");

        String text = "aaxbbyccz";

        System.out.println("Given string:\n"+text);
        System.out.println("\nThe duplicate characters in the string:\n" + obj.adjacentDuplicates(text, 0, new StringBuilder()));
    }

    public String adjacentDuplicates(String data, int index, StringBuilder duplicates, String result){
        if(index >= data.length()){
            return duplicates.toString();
        }
        int currentChar = data.charAt(index);

        for (int i = 0; i < data.length()-1; i++) {
            if(currentChar == data.charAt(i+1)){
                continue;

            }
        }


    }
}
