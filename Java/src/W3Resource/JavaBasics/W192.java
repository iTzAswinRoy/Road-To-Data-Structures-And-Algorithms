package W3Resource.JavaBasics;

import java.util.Scanner;

// Write a Java program to rearrange the alphabets in the order
// followed by the sum of digits in a given string containing uppercase alphabets and integer digits (from 0 to 9).
public class W192 {
    public static void main(String[] args) {
        W192 obj = new W192();
        System.out.println("Enter a set of character's and number's in upper case:");
        String text = obj.userInputs();
        System.out.println("Sorting the character's with the sum of number's: ");
        obj.rearrangeString(text);
    }
    public String userInputs(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public void rearrangeString(String input) {
        char[] alphabets = new char[input.length()];
        int alphabetsCount = 0;
        int numSum = 0;
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (character >= 'A' && character <= 'Z') {
                alphabets[alphabetsCount] = character;
                alphabetsCount++;
            } else if (character >= '0' && character <= '9') {
                numSum += character - '0';
            }
        }
        for (int i = 0; i < alphabetsCount - 1; i++) {
            for (int j = 0; j < alphabetsCount - i - 1; j++) {
                if(alphabets[j] > alphabets[j+1]) {
                    char temp = alphabets[j];
                    alphabets[j] = alphabets[j+1];
                    alphabets[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < alphabetsCount; i++) {
            System.out.print(alphabets[i]);
        }
        System.out.print(numSum);
    }
}
