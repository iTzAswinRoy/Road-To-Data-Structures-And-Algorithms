package JavaRecursion.String;

// Write a recursive function to interleave two strings of the same length.
public class InterleaveStrings {
    public static void main(String[] args) {
        InterleaveStrings obj = new InterleaveStrings();
        String text1 = "abc";
        String text2 = "xyz";

        System.out.println("Interleaving strings:\n"+obj.interleavingStrings(text1, text2));
    }

    public String interleavingStrings(String data1, String data2){
        if(data1.length() <=1 || data2.length() <= 1){
            return data1 + data2;
        }

        char firstChar1 = data1.charAt(0);
        char firstChar2 = data2.charAt(0);

        return firstChar1+""+firstChar2 + interleavingStrings(data1.substring(1), data2.substring(1));
    }
}
