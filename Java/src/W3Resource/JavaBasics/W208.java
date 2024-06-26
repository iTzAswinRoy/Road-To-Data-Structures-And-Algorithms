package W3Resource.JavaBasics;
import java.util.Scanner;   // Importing scanner class
import java.lang.String;    // Importing string class
// Write a Java program to create a basic string compression method using repeated character counts.
public class W208 {
    public static void main(String[] args) {    // Main method
        W208 obj = new W208();      // Creating an object of the class
        System.out.println("Enter any random characters: ");
        String string = obj.userInputs();     // Storing the inputs from the user in a variable
        String sortedString = obj.sort(string);      // Updating the variable by sorting them
        obj.characterCounter(sortedString);     // Calling the repeated character count method
    }
    public String userInputs(){     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        return in.nextLine();       // Returning the input data
    }
    public String sort(String text){    // Method to sort the sting using bubble sort
        char[] charArray = text.toCharArray();      // converting the input data to a character array
        // Using bubble sort to sort each character
        for (int i = 0; i < text.length() - 1; i++) {      // Setting the pinter to the first index
            for (int j = 0; j < text.length() - i - 1; j++) {   // Here we're reducing the size for each sorted elements
                if (charArray[j] > charArray[j+1]) {     // Checking if the value of the element is greater than the next element
                    // Now the swapping process takes place
                    char temp = charArray[j];   // Creating a temporary to swap the elements
                    charArray[j] = charArray[j + 1];  // Setting the elements to swap
                    charArray[j + 1] = temp;    // Now the elements are swapped
                }
            }
        }
        return String.valueOf(charArray);   // Converting the character to string and then returning it
    }
    public void characterCounter(String data){      // Method to calculate the repeated characters and its count
        String result = " ";    // Creating an empty string to store the result
        int count = 1;     // Initializing the count to 1
        for (int i = 0; i < data.length(); i++) {   // Iterating through each element
            if (i + 1 < data.length() && data.charAt(i) == data.charAt(i + 1)) {     // Checking if the pointer is less than its size and the element is equal to its next element
                count++;    // Incrementing the count by 1
            } else {
                result += data.charAt(i);   // once it reaches different character, then the character is concatenated accordingly
                if (count > 1) {     // Checking if the count is more than 1 in order to improve the readability
                    result += count;    // Concatenating the count to the character
                }
                count = 1;      // Now we're resetting the count to 1 in order to count elements of different type
            }
        }
        System.out.println("Count of the repeated characters in the string:\n"+result);      // Printing the results
    }
}
