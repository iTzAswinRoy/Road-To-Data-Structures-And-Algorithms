package JavaBasics;

// Write a Java program to compute the sum of the first 100 prime numbers.
public class CountingPrimeNumbers {
    public static void main(String[] args) {      // Main method
        CountingPrimeNumbers obj = new CountingPrimeNumbers();       // Creating an object to call the methods
        obj.sumOfPrimeNumbers();    // Calling the method containing sum of prime numbers
    }

    public boolean isPrime(int n) {     // Method to check if a number is prime or not
        if (n <= 1) {       // Checking if the number is less than 1
            return false;       // Returns false if it reaches the condition
        }

        if (n == 2) {       // Checking if the number is 2
            return true;        // Returns true because 2 is a prime number
        }

        if (n % 2 == 0) {       // Checking if the number is equal to 2
            return false;       // Returns true if it attains the condition
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {     // Iterating though the square root of the number
            if (n % i == 0) {       // Checking is the square root of the number is divisible by itself
                return false;       // Return false if the number is even
            }
        }
        return true;        // Return true if the number is divisible by 1 or itself
    }

    public void sumOfPrimeNumbers() {         // Method to calculate the sum of prime numbers
        int number = 2;     // Setting the number to 2 since the prime number starts with 2
        int count = 0;      // initializing the count ot 0
        int sum = 0;        // Creating a sum variable

        while (count < 100) {       // Iterating till the count is greater than 100 in order to reach the 100 prime numbers
            if (isPrime(number)) {      // Checking if the number is prime or not
                sum += number;      // If it's a prime number then it adds to sum variable
                count++;
            }
            number++;       // Incrementing number to check the next number
        }
        System.out.println("The sum of first 100 prime numbers: " + sum);       // Displaying the result
    }
}