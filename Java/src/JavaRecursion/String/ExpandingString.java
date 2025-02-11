package JavaRecursion.String;

// Write a recursive function to expand a compressed string (e.g., "a2b1c5a3" becomes "aabcccccaaa").
public class ExpandingString {
    public static void main(String[] args) {
        ExpandingString obj = new ExpandingString();

        String sentence = "a2b1c5a3";
        System.out.println("Given compressed string:\n" + sentence);

        System.out.println("\nString after compressing:\n" + obj.stringExpand(sentence));
    }

    public String stringExpand(String data){
        if(data.length() == 0){//
            return data;//
        }

        char currentLetter = data.charAt(0);//
        int charCount = Integer.parseInt(String.valueOf(data.charAt(1)));

        String expandedString = "";

        for (int i = 0; i < charCount; i++) {
            expandedString += currentLetter;
        }

        return expandedString + stringExpand(data.substring(2));
    }
}
