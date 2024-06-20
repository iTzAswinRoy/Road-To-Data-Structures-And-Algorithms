package W3Resource.JavaBasics;
import java.util.Scanner;
// Write a Java program to compare two numbers
public class w32 {
    public static void main(String[] args) {
        w32 obj = new w32();    // Creating a class object to call the methods
        System.out.println("Enter the first number: ");
        int n1 = obj.userInputs();     // Storing inputs in a variable for num1
        System.out.println("Enter the second number: ");
        int n2 = obj.userInputs();      // Storing inputs in a variable for num2
        obj.compare(n1, n2);    // Calling the method to compare the numbers
    }
    public int userInputs(){    // Method to get the user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        return in.nextInt();    // returning the scanner
    }
    public void compare(int n1, int n2){    // Method to compare the two numbers
        if (n1 == n2) {     // Condition if the both numbers are equal
            System.out.println("Number 1 is equal to number 2");
        }else if (n1 > n2) {    // Checking if the number is greater or less than
            System.out.println("Number 1 is greater than number 2");
        } else {
            System.out.println("Number 1 is less than number 2");
        }
    }
}
