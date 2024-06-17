package W3Resource.JavaBasics;
import java.util.Scanner;
import java.lang.String;
// Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.
public class w169 {
    public static void main(String[] args) {
        w169 obj = new w169(); // Creating an object to call the method
        String sentence = obj.inputString();    // Creating a variable to store the inputs from the user
        String result = obj.reverseSentence(sentence);  // Storing the reversed string in a variable
        obj.printString(result);    // Displaying the result
    }
    public String inputString(){    // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter a sentence: ");
        return in.nextLine();   // Here I'm returning directly to avoid memory storage and to eliminate variable redundancy
    }
    public String reverseSentence(String text){     // Method to reverse the string
        String[] word = text.split(" ");    // Here I'm splitting the single string into substrings in order to store it in an array
        String result = "";     // Creating an empty string to store the result
        for (int i = word.length - 1; i >= 0; i--) {    // Here I'm setting the pointer to the end of the string and decrementing so that I can store the substring in reverse order
            result += word[i];
            if(i > 0){      // This condition provides a space between each substring
                result += " ";
            }
        }
        return result;  // Finally returning the result
    }
    public void printString(String result){     // Method to display the result
        System.out.println("Reversed string:\n"+result);
    }
}
