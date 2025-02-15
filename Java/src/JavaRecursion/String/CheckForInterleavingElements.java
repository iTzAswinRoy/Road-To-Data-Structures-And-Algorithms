package JavaRecursion.String;

// Write a recursive function to check if a string is an interleaving of two other strings.
public class CheckForInterleavingElements {
    public static void main(String[] args) {
        CheckForInterleavingElements obj = new CheckForInterleavingElements();
        String sentence1 = "abc";
        String sentence2 = "xyz";


        System.out.println("Given string:\n" + sentence1 + "\n" + sentence2);

        String interleaveString = obj.interleaveElements(sentence1, sentence2, "");

        System.out.println("\nString after interleave:\n" + interleaveString);

        System.out.println("\nChecking if the strings is an interleaving of two other strings:\n"+obj.isInterleave(sentence1,sentence2,interleaveString));

    }
    public String interleaveElements(String s1, String s2, String result){
        if(s1.isEmpty() && s2.isEmpty()) {
            return result;
        }

        if(!s1.isEmpty()) {
            result += s1.charAt(0);
        }

        if(!s2.isEmpty()) {
            result += s2.charAt(0);
        }

        return interleaveElements(s1.substring(1), s2.substring(1), result);
    }

    public boolean isInterleave(String s1, String s2, String s3){
        if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty()){
            return true;
        }
        boolean firstCondition = false;
        boolean secondCondition = false;

        if(!s1.isEmpty() && s1.charAt(0) == s3.charAt(0)){
            firstCondition = isInterleave(s1.substring(1), s2, s3.substring(1));
        }

        if(!s2.isEmpty() && s2.charAt(0) == s3.charAt(0)){
            secondCondition = isInterleave(s1, s2.substring(1), s3.substring(1));
        }

        return firstCondition || secondCondition;
    }
}