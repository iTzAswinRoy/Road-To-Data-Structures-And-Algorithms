package JavaStack;

// Write a Java program that implements a stack and finds common elements between two stacks.

public class WS21 {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    WS21 (int size) {          // Creating a parameterized constructor by passing a value
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

    public static void commonElement(WS21 obj1, WS21 obj2) {          // Method to get the common elements from the both the stack
        WS21 newStack = new WS21(Math.min(obj1.arr.length, obj2.arr.length));           // Creating a stack to get store the common elements

        // Using nested for loop
        for (int i = obj1.top; i >= 0; i--) {
            for (int j = obj2.top; j >= 0; j--) {

                // Checking if the element is common
                if (obj1.arr[i] == obj2.arr[j]) {
                    newStack.push(obj1.arr[i]);         // Pushing the element which are common to the new stack
                }
            }
        }
        newStack.display();         // Calling the method to display the elements in new stack
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        WS21 obj1 = new WS21(5);        // Creating a new stack by passing a value

        // Calling the method to insert elements into the stack
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        obj1.push(4);
        obj1.push(5);

        // Displaying all the elements in the stack
        System.out.println("Stack - 1:");
        obj1.display();

        WS21 obj2 = new WS21(5);            // Creating a new stack by passing a value

        // Calling the method to insert elements into the stack
        obj2.push(3);
        obj2.push(6);
        obj2.push(9);
        obj2.push(1);
        obj2.push(2);

        // Displaying all the elements in the stack
        System.out.println("\nStack - 2:");
        obj2.display();

        // Calling the method to get the common elements from the both the stack
        System.out.println("\nCommon elements from both the stacks are... ");
        commonElement(obj1, obj2);
    }
}