package W3Resource.JavaBasics;
import java.util.Scanner;
// 32
public class w32 {
    public static void main(String args[]) {
        // Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int number1; // First number to compare
        int number2; // Second number to compare
        // Prompt the user to input the first integer
        System.out.print("Input first inteer: ");
        number1 = input.nextInt(); // Read the first number from the user
        // Prompt the user to input the second integer
        System.out.print("Input second integer: ");
        number2 = input.nextInt(); // Read the second number from the user
        // Compare and display the results
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}
