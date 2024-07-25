package JavaBasics;
import java.lang.String;        // Importing string class
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;       // Importing scanner class
// Write a Java program to capitalize the first letter of each word in a sentence.
public class w58 {
    public static void main(String[] args) {    // Main method
        w58 obj = new w58();     // Creating an object to call the method

        String sentence = obj.userInputs();     // Storing the string by getting the inputs from a method
        ArrayList<String> result = obj.upperCase(sentence);        // Storing the result in a string

        System.out.println("\nCapitalizing the first letter of each word in a sentence:\n"+ result);    // Printing the output
    }

    public String userInputs() {     // Method to get user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter a sentence:");
        return in.nextLine();    // Returning the inputs
    }

    public ArrayList<String> upperCase(String text) {       // Method to convert letters to upper case
        String[] words = text.split(" ");      // Splitting the string and string it in a string array
        ArrayList<String> result = new ArrayList<>();    // Creating an empty string to store the result
        for (int i = 0; i < words.length; i++) {
            result.add(Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1)+ " ");     // Here, were getting the first letter of each string and then converting to uppercase along with remaining letters
        }
        return result;      // Returning the result
    }

    public String convertingToString(ArrayList<String> result) {
        String finalResult = " ";
        for (int i = 0; i < result.size(); i++) {
            finalResult += result.get(i) + " ";
        }
        return finalResult;
    }
}
