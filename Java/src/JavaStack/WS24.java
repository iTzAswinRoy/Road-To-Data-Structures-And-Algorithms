package JavaStack;

// Write a Java program that implements a stack and creates a new stack from a portion of the original stack.

public class WS24 {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    WS24 (int size) {          // Creating a parameterized constructor by passing a value
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

    public WS24 potionOfTheStack(WS24 stack, int i1, int i2) {          // Method to store a portion of elements from a stack
        WS24 newStack = new WS24(i1 - i2 + 1);          // Creating a new stack with custom size

        // Checking if the stack is empty
        if (top == -1) {
            System.out.println("stack is empty");

            return new WS24(0);      // Returning an empty stack

            // Checking if the index is out of bound
        } else if (i1 < 0 || i2 < 0 || i1 > top ||  i2 > top) {
            System.out.println("Index out of bound!");

            return new WS24(0);         // Returning an empty stack
        }
        // Checking if the index 1 is greater than the index 2
        if (i1 > i2) {
            // Iterating through the stack
            for (int i = i1; i >= i2; i--) {
                newStack.push(stack.pop());     // Pushing elements to the new stack
            }
        } else {
            System.out.println("Index error! index 1 should be greater than index 2");
        }
        return newStack;        // Returning the new stack
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {         // Main method
        WS24 obj = new WS24(5);         // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        // Displaying all the elements in the stack
        System.out.println("Original stack :");
        obj.display();

        // Calling the method to extract a portion from the stack
        WS24 result = obj.potionOfTheStack(obj, 4, 2);

        // Displaying all the elements in the stack
        System.out.println("\nExtracting a portion from the stack:");
        result.display();
    }
}