package JavaStack;

//  Write a Java program to find the maximum and minimum elements in a stack.

public class FindingMaxMin {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    FindingMaxMin(int size) {          // Creating a parameterized constructor by passing a value
        // Initializing the reference variable
        arr = new int[size];        // Here, we're creating an array object whenever an object is created
        top = -1;       // Initializing the top to -1, which indicates the stack size is empty
    }

    public void push(int num) {      // Method to add element into the stack
        if (top == arr.length - 1) {        // Checking if the stack is full
            System.out.println("Stack is full");

        } else {
            top++;      // Incrementing top by 1
            arr[top] = num;     // Adding the value to the stack
        }
    }

    public int pop() {      // Method to remove element from the stack
        if (top == -1) {        // Checking if the stack is empty
            System.out.println("Stack is empty");
            return 0;       // Returns 0, if empty

        } else {
            System.out.println("\nPopping element from the stack:");

            int popElement = arr[top];      // Accessing the last element from the stack
            top--;      // Decrementing top by 1

            return popElement;      // Returning the popped element
        }
    }

    public int peek() {        // Method to get the last element from the stack
        if (top == -1) {        // Checking if the stack is empty
            System.out.println("stack is empty");
            return 0;
        }
        System.out.println("\nPeeking the last element from the stack:");
        return arr[top];        // Restringing the last element
    }

    public void maxAndMin() {       // Method to find the maximum and minimum in the stack
        int max = Integer.MIN_VALUE;        // Storing minimum value
        int min = Integer.MAX_VALUE;        // Storing maximum value

        // Iterating through stack
        for (int i = top; i >= 0; i--) {
            // Checking if the element is greater than min value
            if (arr[i] < min) {
                min = arr[i];       // Updating the min
            }
            // Checking if the element is less than max value
            if (arr[i] > max) {
                max = arr[i];       // Updating the max
            }
        }
        // Displaying the maximum and minimum element in the stack
        System.out.println("\nThe maximum element in the stack: " + max);
        System.out.println("The minimum element in the stack: " + min);
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        FindingMaxMin obj = new FindingMaxMin(5);       // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        obj.push(15);
        obj.push(20);
        obj.push(99);
        obj.push(35);
        obj.push(50);

        // Displaying all the elements in the stack
        System.out.println("Given stack:");
        obj.display();

        // Calling the method to find the maximum and minimum in the stack
        obj.maxAndMin();
    }
}
