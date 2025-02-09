package JavaRecursion.String;

// Write a recursive function to find the longest palindromic substring in a string.
public class FindingLongestPalindrome {
    public static void main(String[] args) {
        FindingLongestPalindrome obj = new FindingLongestPalindrome();
        String sentence = "bopob holloh";

        System.out.println("Enter a series of string containing palindrome:\n"+sentence);//
        System.out.println("\nFinding longest palindromic substring in a string:\n" + obj.longestPalindrome(sentence, "", Integer.MIN_VALUE));
    }

    public String longestPalindrome(String data, String result, int max){
        if(data.isEmpty() ){
            return result;
        }
        if(data.indexOf(" ") == -1){

            if(checkPalindrome(data) && data.length() > max) {

                return data;
            }
            return result;
        }

        String currentString = data.substring(0, data.indexOf(" "));

        if(checkPalindrome(currentString)){

            if(currentString.length() > max) {

                result = currentString;
                max = currentString.length();
            }
        }
        return longestPalindrome(data.substring(data.indexOf(" ")+1), result, max);//
    }

    public boolean checkPalindrome(String data) {
        int currentIndex = 0;//
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
