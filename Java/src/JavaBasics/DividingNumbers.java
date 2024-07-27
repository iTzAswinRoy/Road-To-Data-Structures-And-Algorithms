package JavaBasics;
import java.util.ArrayList;     // Importing Array list

// Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
public class DividingNumbers {
    public static void main(String[] args) {    // Main method
        DividingNumbers obj = new DividingNumbers();    // Creating an object to call the method

        System.out.println("Numbers which are divisible by 3, 5 and both:");
        ArrayList<Integer> array = obj.numbers();   // Creating an array list to containing numbers from 1 to 100

        System.out.println("Divided by 3:");
        obj.divideBy3(array);   // Calling the number divided by 3 method

        System.out.println("\nDivided by 5:");
        obj.divideBy5(array);   // Calling the number divided by 5 method

        System.out.println("\nDivided by 3 and 5:");
        obj.divideBy3And5(array);   // Calling the number divided by 3 and 5 method
    }

    public ArrayList<Integer> numbers() {    // Method to collect numbers from 1 to 100
        ArrayList<Integer> num = new ArrayList<>();     // Creating an array list to store the numbers

        for (int i = 0; i < 100; i++) {
            num.add(i);       // Storing each numbers to the array list
        }
        return num;    // Returning the array list
    }

    public void divideBy3(ArrayList<Integer> data) {     // Method to divide the number by 3
        ArrayList<Integer> result = new ArrayList<>();      // Creating an array list to store the results

        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) % 3 == 0) {       // Checking if the number is divisible by 3
                result.add(data.get(i));    // Storing the number to an array list
            }
        }
        System.out.println(result);     // Displaying the result
    }

    public void divideBy5(ArrayList<Integer> data) {    // Method to divide the number by 5
        ArrayList<Integer> result = new ArrayList<>();  // Creating an array list to store the results

        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) % 5 == 0) {     // Checking if the number is divisible by 5
                result.add(data.get(i));    // Storing the number to an array list
            }
        }
        System.out.println(result);  // Displaying the result
    }

    public void divideBy3And5(ArrayList<Integer> data) {     // Method to divide the number by 5
        ArrayList<Integer> result = new ArrayList<>();      // Creating an array list to store the results

        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) % 3 == 0 && data.get(i) % 5 == 0) {      // Checking if the number is divisible by 3 and5
                result.add(data.get(i));        // Storing the number to an array list
            }
        }
        System.out.println(result);     // Displaying the result
    }
}
