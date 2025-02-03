package JavaStack;
// Write a Java program that implements a stack and checks if all elements of the stack satisfy a condition.
public class WS26 {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    WS26 (int size) {          // Creating a parameterized constructor by passing a value
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

    public boolean isEmpty() {      // Method to check if the stack is empty
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEven() {        // Method to check if the elements inside the stack is even
        // Checking if the stack is empty
        if (isEmpty()) {
            System.out.println("Stack is empty");

        } else {
            // Iterating through the for stack
            for (int i = top; i >= 0; i--) {
                // Check if the element is even
                if (arr[i] % 2 != 0) {
                    return false;
                }
            }
        }
        return true;        // Returns true, if the stack contains only even elements
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        WS26 obj = new WS26(5);         // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        obj.push(2);
        obj.push(4);
        obj.push(6);
        obj.push(8);
        obj.push(10);

        // Displaying all the elements in the stack
        System.out.println("Original stack :");
        obj.display();

        // Calling the method to check if the elements inside the stack is even
        System.out.println("Checking if all the elements in the stack are even: " + obj.checkEven());
    }
}