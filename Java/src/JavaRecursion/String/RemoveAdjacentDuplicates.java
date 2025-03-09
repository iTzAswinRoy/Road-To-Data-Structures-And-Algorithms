package JavaRecursion.String;
import java.lang.StringBuilder;

// Write a recursive function to remove all adjacent duplicate characters in a string.
public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        RemoveAdjacentDuplicates obj = new RemoveAdjacentDuplicates();

        String text = "aaxbbyccz";

        System.out.println("Given string:\n" + text);
        System.out.println("\nRemoving adjacent duplicates from the string:\n"+obj.adjacentDuplicates(text));
    }
    public String adjacentDuplicates(String data){
        if(data.length() <= 1){
            return data;
        }

        if(data.charAt(0) == data.charAt(1)){
            int index = 1;
            return adjacentDuplicates(data.substring(index+1));
        }
        return data.charAt(0) + " " + adjacentDuplicates(data.substring(1));//

    }
}
