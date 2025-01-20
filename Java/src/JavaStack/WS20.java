package JavaStack;

// Write a Java program that implements a stack and checks if two stacks are equal.

public class WS20 {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    WS20 (int size) {          // Creating a parameterized constructor by passing a value
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

    static boolean checkStack(WS20 obj1, WS20 obj2) {           // Method to check if both the stacks are equal
        if (obj1.top != obj2.top) {
            return false;

        } else {
            for (int i = obj1.top; i >= 0; i--) {

                if (obj1.arr[i] != obj2.arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        WS20 obj1 = new WS20(5);        // Creating a new stack by passing a value

        // Calling the method to insert elements into the stack
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        obj1.push(4);
        obj1.push(5);

        // Displaying all the elements in the stack
        System.out.println("Stack - 1:");
        obj1.display();

        WS20 obj2 = new WS20(5);        // Creating a new stack by passing a value

        // Calling the method to insert elements into the stack
        obj2.push(1);
        obj2.push(2);
        obj2.push(3);
        obj2.push(4);
        obj2.push(5);

        // Displaying all the elements in the stack
        System.out.println("\nStack - 2:");
        obj2.display();

        // Calling the method to check if both the stacks are equal
        System.out.println("\nChecking if the both stack 1 & 2 are same:\n" + checkStack(obj1, obj2));
    }
}