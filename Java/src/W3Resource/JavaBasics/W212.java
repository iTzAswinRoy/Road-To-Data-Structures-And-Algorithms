package W3Resource.JavaBasics;
import java.util.Scanner;   // Importing scanner class
import java.lang.String;    // Importing string class
// Write a Java program to compute the digit number of the sum of two given integers.
public class W212 {
    public static void main(String[] args) {    // Main method
        W212 obj = new W212();      // Creating a class of an object
        System.out.println("Enter the first number:");
        int num1 = obj.userInputs();    // Storing the inputs in a variable
        System.out.println("Enter the second number:");
        int num2 = obj.userInputs();
        obj.sumOfTwoIntegers(num1, num2);
    }
    public int userInputs(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public void sumOfTwoIntegers(int a, int b) {
        int c = a + b;
        int count = 0;
        String subString = String.valueOf(c);
        for (int i = 0; i < subString.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}
