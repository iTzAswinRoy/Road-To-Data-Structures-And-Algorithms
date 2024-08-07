package JavaBasics;

import java.io.Console;     // This imports console libraries

// Write a Java program to input and display your password.
public class DisplayPassword {
    public static void main(String[] args) {    // Main method
        DisplayPassword obj = new DisplayPassword();    // Creating an abject
        Console cons = obj.checkingConsole();   // Creating an abject from the console class

        if (cons == null) {     // Checking whether the console is available or not
            System.out.println("No console available");
            return;     // Exiting the condition
        }

        char[] pass_ward = cons.readPassword("Enter your Password: ");      // Storing the password in character array
        System.out.println("\nYour password is " + new String(pass_ward));      // Printing the password by converting to sting
        java.util.Arrays.fill(pass_ward, ' '); // Clear the password from memory
    }

    private Console checkingConsole() {     // Method to check if the console is available or not
        Console checkCons = System.console();       // Creating a Console object

        if (checkCons != null) {    // Condition for availability
            System.out.println("Console is available");
        } else {
            System.out.println("Console is not available");
        }
        return checkCons;   // Returning the console
    }
}
