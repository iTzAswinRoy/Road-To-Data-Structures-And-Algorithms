package JavaBasics;
import java.util.LinkedList; //
import java.util.Scanner; //
import java.util.Queue;  //
// Write a Java program that will accept an integer and convert it into a binary representation.
// Now count the number of bits equal to zero in this representation.
public class w163 {
    public static void main(String[] args) { //
        w163 obj = new w163();  // Creating an object
        int number = obj.integer();  // Storing the integer value to a variable
        Queue<Integer> binaryRepresentation = obj.convertToBinary(number);  // Storing the binary number to a queue interface
        System.out.println("Input number: \n"+number);  // Displaying the input number
        System.out.println("Binary representation of "+number+" is "+binaryRepresentation);
        System.out.println("Number of zero bits: "+ obj.count(binaryRepresentation));   // Displaying the count of zero bits
    }
    public int integer(){   // Creating a method to get values from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner class
        System.out.println("Enter the number: ");
        int num = in.nextInt();   // Storing the value to a variable
        in.close();   // Closing scanner to avoid data breach
        return num;     // returning the input value
    }
    public Queue<Integer> convertToBinary(int num){     // Creating a method to convert the number to binary
        Queue<Integer> binaryNumber = new LinkedList<>();  // Creating a queue interface
        int reminder = 0;
        if (num == 0){  // If the input value is zero then it returns 0
            binaryNumber.add(0); //
            return binaryNumber; //
        }
        while(num > 0) {    // Here the conversion of binary number takes place
            reminder = num % 2;
            binaryNumber.add(reminder);
            num = num / 2;
        }
        return binaryNumber;  //
    }
    public int count(Queue<Integer> num){    // Creating a method to count the zero bits present in the binary number
        int count = 0;
        for (int i = 0; i < num.size(); i++) {
            // Here I'm converting the queue interface to an linknedList so that I can access a certain element
            int element = ((LinkedList<Integer>) num).get(i);
            if (element == 0) {
                count++;    // For each iteration the count increase a values by 1
            }
        }
        return count;  // Returning the count value
    }
}
