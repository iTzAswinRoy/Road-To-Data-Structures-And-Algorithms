package JavaBasics;
import java.lang.String;        // Importing string class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to capitalize the first letter of each word in a sentence.
public class CapitalizingFirstLetter {
    public static void main(String[] args) {    // Main method
        CapitalizingFirstLetter obj = new CapitalizingFirstLetter();     // Creating an object to call the method

        String sentence = obj.userInputs();     // Storing the string by getting the inputs from a method
        String result = obj.upperCase(sentence);        // Storing the result in a string

        System.out.println("\nCapitalizing the first letter of each word in a sentence:\n" + result);    // Printing the output
    }

    public String userInputs() {     // Method to get user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter a sentence:");

        return in.nextLine();    // Returning the inputs
    }

    public String upperCase(String text) {       // Method to convert letters to upper case
        String[] words = text.split(" ");      // Splitting the string and string it in a string array
        String result = "";    // Creating an empty string to store the result

        for (int i = 0; i < words.length; i++) {
            result += (Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ");     // Here, were getting the first letter of each string and then converting to uppercase along with remaining letters
        }
        return result;      // Returning the result
    }
}