package JavaStack;

// Write a Java program to remove all elements from a stack.

public class RemoveStack {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    RemoveStack(int size) {          // Creating a parameterized constructor by passing a value
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

    public void emptyStack() {          // Method to empty the stack
        // Iterating through the stack
        for (int i = top; i >= 0; i--) {
            pop();      // Removing all the elements by calling the pop method
        }
        System.out.println("Stack is cleared!\n");
    }

    public boolean isEmpty() {          // Method to check if the stack is empty
        // Checking if the size is still -1, which means the stack is empty
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        RemoveStack obj = new RemoveStack(5);       // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        // Displaying all the elements in the stack
        System.out.println("Given stack:");
        obj.display();

        // Calling the method to empty the stack
        System.out.println("\nClearing the stack...");
        obj.emptyStack();
        obj.display();

        // Calling the method to check if the stack is empty or not
        System.out.println("Does the stack is really empty?\n" + obj.isEmpty());
    }
}