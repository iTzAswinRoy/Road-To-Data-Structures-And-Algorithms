package JavaBasics;

import java.util.Scanner;       // Importing scanner class

// Write a Java program to print the number of prime numbers less than or equal to a given integer.
public class NumberOfPrimeNumbers {
    public static void main(String[] args) {      // Main method
        NumberOfPrimeNumbers obj = new NumberOfPrimeNumbers();      // Creating an object of the same class

        int primeNumber = obj.userInputs();     // Getting inputs from the user
        obj.countPrime(primeNumber);      // Calling the count prime number method
    }

    public int userInputs() {      // Method the get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter the prime number:");

        return in.nextInt();    // Returning the inputs
    }

    public boolean isPrime(int num) {    // Method to check if the number is prime or not
        if (num <= 1) {      // Checking if the number is less than 1
            return false;
        }
        if (num == 2) {      // Checking if the number is equals to 2
            return true;
        }
        if (num % 2 == 0 ) {     // Checking if the number is even or not
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {      // Iterating over the square root of the given number by incrementing 2

            if (num % i == 0) {       // Checking if the number is divisible by its odd number
                return false;
            }
        }
        return true;    // Returns true if it cant be divisible by any numbers other than itself.
    }

    public void countPrime(int num) {       // Method to count number of prime numbers
        int count = 0;      // Initializing count to 0

        if (!isPrime(num)) {      // Checking if the given number is prime or not
            System.out.println("\nNot a prime number!");
        } else {
            for (int i = 2; i <= num; i++) {    // Iterating thrown the given number

                if (isPrime(i)) {       // Checking if the 'i' is prime number
                    count++;    // If yes, count increments by 1
                }
            }
            System.out.println("Number of prime numbers in the given number: " + count);    // Displaying the count
        }
    }
}