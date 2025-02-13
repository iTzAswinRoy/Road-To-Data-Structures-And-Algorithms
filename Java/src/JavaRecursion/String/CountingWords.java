package JavaRecursion.String;

// Write a recursive function to count the number of words in a string.

public class CountingWords {
    public static void main(String[] args) {//
        CountingWords obj = new CountingWords();//
        String sentence = "Hi! I'm Aswin Roy.";

        System.out.println("Given string:\n"+sentence);
        System.out.println("\nCounting number of words in a string:\n"+obj.countWords(sentence));
    }

    public int countWords(String data){
        if(data.isEmpty()){
            return 0;
        }
        if (data.indexOf(" ") == -1){
            return 1;
        }
        return 1 + countWords(data.substring(data.indexOf(" ")+1));

    }
}
