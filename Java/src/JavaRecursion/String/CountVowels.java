package JavaRecursion.String;

// Write a recursive function to count the number of vowels in a string.
public class CountVowels {
    public static void main(String[] args) {
        CountVowels obj = new CountVowels();
        String text = "Aswin Roy";

        System.out.println("Given string:\n" + text);
        System.out.println("\nNumber of vowels in a string:\n"+obj.count(text, 0,0));//
    }

    public int count(String str, int index, int result){
        if(index >= str.length()){
            return result;
        }

        char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
        char currentChar = str.charAt(index);

        for (int i = 0; i < vowels.length; i++) {
            if (currentChar == vowels[i]) {
                result++;
                break;
            }
        }
        return count(str, index+1, result);//
    }//
}
