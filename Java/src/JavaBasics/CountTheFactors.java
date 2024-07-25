package JavaBasics;
import java.util.Scanner;   // Importing scanner class
// Write a Java program to accept an integer and count the factors of the number
public class CountTheFactors {
    public static void main(String[] args) {    // Main method
        CountTheFactors obj = new CountTheFactors();    // Creating an object
        int number = obj.userInput();   // Storing the value by calling the method
        obj.countFactor(number);     // Calling the method to find the factors of a number
    }
    public int userInput(){     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter a number:");
        return in.nextInt();    // Returning the inputs
    }
    public void countFactor(int value){      // Method to count the factors
        int count = 0;      // Setting to count to 0
        for (int i = 1; i <= value; i++) {      // Iterating through each value
            if (value % i == 0 ){      // Checking if the value give reminder 0
                count++;    // Incrementing the count by 1
            }
        }
        System.out.println("Number of factors: "+count);    // Displaying the result
    }
}