package JavaBasics;

import java.util.Scanner;   // Importing Scanner class

// Write a Java program to rearrange the alphabets in the order
// followed by the sum of digits in a given string containing uppercase alphabets and integer digits (from 0 to 9).
public class W192 {
    public static void main(String[] args) {    // Main method
        W192 obj = new W192();  // Creating a class object

        System.out.println("Enter a set of character's (in upper case) and number's:");
        String upperCaseText = obj.userInputs();     // Creating a variable to store inputs from the user

        System.out.println("\nSorting the character's with the sum of number's: ");
        obj.rearrangeCharacters(upperCaseText);    // Displaying the rearranged string by calling the method
    }

    public String userInputs() {     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        return in.nextLine();   // Returning the scanner object
    }

    public void rearrangeCharacters(String input) {     // Method to rearrange the characters
        char[] alphabets = new char[input.length()];    // Creating a character array to store the sorted characters
        int alphabetsCount = 0;     // Creating a count for number of characters
        int numSum = 0;     // Initializing the sum of number to 0 in order to store the sum value

        for (int i = 0; i < input.length(); i++) {      // Iterating through each characters in an array
            char character = input.charAt(i);   // Creating an instance variable to store each character for each iteration

            if (character >= 'A' && character <= 'Z') {     // Checking if the array contains any characters
                alphabets[alphabetsCount] = character;      //
                alphabetsCount++;   // Incrementing count by 1

            } else if (character >= '0' && character <= '9') {      // Checking if the array contains any numbers
                numSum += character - '0';     // With the help of ASCII value, we can find the difference between zero character and given character
            }
        }
        for (int i = 0; i < alphabetsCount - 1; i++) {      // Using bubble sort to rearrange the alphabets

            for (int j = 0; j < alphabetsCount - i - 1; j++) {     // Reducing the length for each sorted elements

                if(alphabets[j] > alphabets[j+1]) {     // Checking if the element is greater than the next element

                    char temp = alphabets[j];       // Swapping the element with the help of temporary variable
                    alphabets[j] = alphabets[j+1];  // Here the elements are assigned to each other
                    alphabets[j+1] = temp;      // Now the elements are swapped
                }
            }
        }
        for (int i = 0; i < alphabetsCount; i++) {      // Printing each element in a for loop
            System.out.print(alphabets[i]);     // Prints the element for each iteration
        }
        System.out.print(numSum);   // Finally concatenation the sum of numbers along with the rearranged alphabets
    }
}