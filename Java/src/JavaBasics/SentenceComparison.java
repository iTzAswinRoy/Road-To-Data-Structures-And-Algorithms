package JavaBasics;

import java.util.Objects;       // Importing object class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to accept two strings and test if anyone of the second string contains the first one.
public class SentenceComparison {
    public static void main(String[] args) {    // Main method
        SentenceComparison obj = new SentenceComparison();  // Creating an object to call the method

        System.out.println("Enter the 1st sentence: ");
        String sentence1 = obj.userInputs();    // Creating a variable to store the inputs from the user

        System.out.println("Enter the 2nd sentence: ");
        String sentence2 = obj.userInputs();    // Creating a variable to store another inputs from the user

        System.out.println("\nChecking if the both sentence contains any similar words: "+obj.comparingStrings(sentence1, sentence2));
    }

    public String userInputs() {     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        return in.nextLine(); // Returning the user inputs
    }
    public boolean comparingStrings(String str1, String str2) {     // Method to compare both the strings if they have anything in common
        String[] temp1 = str1.split(" ");   // Storing the 1st sentence in an array by splitting them
        String[] temp2 = str2.split(" ");   // Storing the 2nd sentence in an array

        for (int i = 0; i < temp1.length; i++) {    // Iterating over each array in order to find any similar words between them

            for (int j = 0; j < temp1.length; j++) {

                if (Objects.equals(temp1[i], temp2[j])) {   // With the help of object class I'm comparing the sentence word by word
                    return true;    // Returning true if any one of the array contains a similar word
                }
            }
        }
        return false;
    }
}
