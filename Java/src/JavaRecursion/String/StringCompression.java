package JavaRecursion.String;

// Write a recursive function to compress a string (e.g., "aabcccccaaa" becomes "a2b1c5a3").
public class StringCompression {
    public static void main(String[] args) {
        StringCompression obj = new StringCompression();

        String sentence = "adabcbed";
        System.out.println("Given string:\n" + sentence);

        String sortedString = obj.bubbleSort(sentence);
        System.out.println("\nString after compressing:\n" + obj.countLetters(sortedString));
    }

    public String bubbleSort(String data) {
        if (data.length() == 0) {
            return data;
        }
        char[] charArray = data.toCharArray();

        for (int i = 0; i < data.length() - 1; i++) {

            if (charArray[i] > charArray[i+1]) {

                char temp = charArray[i];
                charArray[i] = charArray[i+1];
                charArray[i+1] = temp;
            }
        }
        String updatedData = String.valueOf(charArray);

        String sortedArray = String.valueOf(charArray[data.length()-1]);

        return bubbleSort(updatedData.substring(0, data.length()-1)) + sortedArray;
    }

    public String countLetters(String data){
        if(data.length() == 0){
            return data;
        }
        int count = 0;
        int index = 0;

        for (int i = 0; i < data.length(); i++) {

            if(data.charAt(0) == data.charAt(i)){
                count++;
                index++;
            }
            if (data.charAt(0) != data.charAt(i)){
                break;
            }
        }
        String compressedString = data.charAt(0) + String.valueOf(count);

        return compressedString + " " + countLetters(data.substring(index));
    }
}