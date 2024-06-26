package W3Resource.JavaBasics;
import java.util.Scanner;   // Importing scanner class
//  Write a Java program to calculate the position of a given prime number.
public class W198 {
    public static void main(String[] args) {    // Main method
        W198 obj = new W198();      // Creating a class object
        System.out.println("Enter a prime number:");
        int primeNumber = obj.userInputs();     // Calling the method to get the inputs from the user
        if (!obj.isPrime(primeNumber)) {    // Condition to check if the number is prime or not
            System.out.println("It's not a prime number");
        } else {
            System.out.println("The position of the prime number is " + obj.findPrimePosition(primeNumber));    // Displaying the position of the prime number
        }
    }
    public int userInputs() {   // // Method to get the user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        return in.nextInt();    // returning the scanner
    }
    public boolean isPrime(int value) {     // Method to check if the number is prime number
        if (value <= 1) {   // If the number is less than 1 then it's not a prime number
            return false;   // Breaks the loop
        }
        if (value == 2) {   // If the number is 2, then it's a prime number
            return true;    // Continues the loop
        }
        if (value % 2 == 0) {   // If the reminder is even then it's not a prime number
            return false;   // Breaks the loop
        }
        for (int i = 3; i <= Math.sqrt(value); i += 2) {    // Checking if any given number is prime or not
            if (value % i == 0) {   // If the reminder is zero then it's not a prime number
                return false;   // Breaks the loop
            }
        }
        return true;    // If true then it means it found the prime number
    }
    public int findPrimePosition(int value) {   // Method to find the position of the prime number
        int count = 0;  // Initializing the count to 0
        for (int i = 2; i <= value; i++) {     // Iterating through each value till it reaches the given number, starting with the smallest prime number
            if (isPrime(i)) {   // Calling the prime method
                count++;    // If the number is prime then the count will be incremented by 1
            }
        }
        return count;   // Thus, the count will return the position of the prime number
    }
}
