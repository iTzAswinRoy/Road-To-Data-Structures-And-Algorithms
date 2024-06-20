package W3Resource.JavaBasics;
import java.util.Scanner;
// Write a Java program to reverse a string.
public class w37 {
    public static void main(String[] args) {
        w37 obj = new w37();    // Creating a class object to call the methods
        System.out.println("Enter a sentence: ");
        String sentence = obj.userInputs();     // Storing the inputs in a variable
        obj.reverseString(sentence);    // Calling the reversed string method
    }
    public String userInputs(){     // Method to get the user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        return in.nextLine();   // returning the scanner
    }
    public void reverseString(String data){     // Method to reverse each string
        char[] newArray = data.toCharArray();       // Converting the datatype from string to character array
        System.out.println("Reversed string: ");
        for (int i = newArray.length - 1; i >= 0; i--) {    // Setting the pointer to the end of the string and iterating through the string
            System.out.print(newArray[i]);      // Printing each letters in a string in reversed order
        }
    }
}

