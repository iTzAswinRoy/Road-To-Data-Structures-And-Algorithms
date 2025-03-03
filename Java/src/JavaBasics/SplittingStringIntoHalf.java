package JavaBasics;

import java.util.Scanner;   // Importing scanner class

// Write a Java program to extract the first half of even string.
public class SplittingStringIntoHalf {
    public static void main(String[] args) {    //  Main method
        SplittingStringIntoHalf obj = new SplittingStringIntoHalf();    // Creating a class object

        String result = obj.userInputs();   // Storing the userInputs method in a variable
        obj.splittingString(result);    // Calling the splitting method
    }

    public String userInputs() {     // Method to get user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter a string containing even letters:");

        return in.nextLine();   // Receiving inputs from the user
    }

    public void splittingString(String text) {      // Method to split the string in a half
        String result = " ";    // Creating an empty string to store the result

        if (text.length() % 2 == 0) {      // Checking if the string is even
            result = text.substring(0, text.length() / 2);    // Splitting the string into half

            System.out.println("The first half of the given string:\n" + result);     // Displaying the result
        } else {
            System.out.println("Invalid string!");   // This executes if the string contains odd no. of letters
        }
    }
}
