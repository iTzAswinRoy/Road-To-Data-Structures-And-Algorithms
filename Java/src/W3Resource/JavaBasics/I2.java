package W3Resource.JavaBasics;
import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class
// Extract the prime numbers from the array and display the same.
// Also display the sum of the prime numbers displayed
public class I2 {
    public static void main(String[] args) {    // Main method
        I2 obj = new I2();      // Creating class object
        int[] arr = obj.userInput();    // Creating an array by calling the user input method to store values
        System.out.println("Prime numbers:\n"+obj.displayPrime(arr));   // Displaying the array consisting of prime numbers
        System.out.println("Sum of prime numbers: "+obj.sumOfPrime(arr));     // Displaying the sum of prime numbers is an array
    }
    public int[] userInput() {      // Method to get user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter the size");
        int size = in.nextInt();    // Initializing the size of the array
        int[] temp = new int[size];     // Creating a temporary  variable to store the values
        System.out.println("Enter the values:");
        for (int i = 0; i < size; i++) {    //
            temp[i] = in.nextInt();
        }
        return temp;
    }
    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(num); i+= 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> displayPrime(int[] num){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if(checkPrime(num[i])){
            temp.add(num[i]);
            }
        }
        return temp;
    }
    public int sumOfPrime(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if(checkPrime(num[i])){
                sum += num[i];
            }
        }
        return sum;
    }
}
