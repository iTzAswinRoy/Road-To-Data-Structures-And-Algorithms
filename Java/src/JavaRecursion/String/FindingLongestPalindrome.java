package JavaRecursion.String;

// Write a recursive function to find the longest palindromic substring in a string.
public class FindingLongestPalindrome {
    public static void main(String[] args) {
        FindingLongestPalindrome obj = new FindingLongestPalindrome();
        String sentence = "bopob holloh";

        System.out.println("Given string:\n"+sentence);
        System.out.println("\nFinding longest palindromic substring in a string.:\n");


        System.out.println(obj.longestPalindrome(sentence, Integer.MIN_VALUE));

//        System.out.println(obj.checkPalindrome(sentence));
    }

    public String longestPalindrome(String data, int length){
        if(data.isEmpty() ){
            return data;
        }
        if(data.indexOf(" ")== -1){
            return data.substring(0, data.length()-1);
        }

        String currentString = data.substring(0, data.indexOf(" "));


        if(checkPalindrome(currentString)){
            if(currentString.length() > length) {
                length = currentString.length();
            }
        }

        return longestPalindrome(data.substring(data.indexOf(" ")+1), length);
    }

    public boolean checkPalindrome(String data) {
        int currentIndex = 0;
        int lastIndex = data.length()-1;

        if(currentIndex >= lastIndex){
            return true;
        }

        if(data.charAt(currentIndex) == data.charAt(lastIndex)) {
            return checkPalindrome(data.substring(currentIndex+1, lastIndex));
        }
        return false;
    }
}
