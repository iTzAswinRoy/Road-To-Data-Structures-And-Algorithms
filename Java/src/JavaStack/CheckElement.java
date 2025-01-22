package JavaStack;

// Write a Java program to implement a stack that checks if a given element is present or not in the stack.

public class CheckElement {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    CheckElement(int size) {          // Creating a parameterized constructor by passing a value
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

    public boolean check(int element) {          // Method to check the element present in the stack
        // Checking if the stack is empty
        if (top == -1) {
            System.out.println("Stack is empty");
            return false;
        } else {
            // Iterating through stack
            for (int i = top; i >= 0; i--) {
                // Checking if the element present in the stack
                if(arr[i] == element){
                    return true;
                }
            }
        }
        return false;       // Returns false, if the element not found
    }

    public void searchElement(int element) {        // Method to search the element in the stack in the stack
        System.out.println("\nChecking if the given element " + element + " is present in the stack..." + check(element));
        int count = -1;

        if (check(element)) {
            for (int i = top; i >= 0; i--) {
                count++;

                // Checking if the element is present in the stack
                if (arr[i] == element) {
                    // Getting the specific index from the stack
                    System.out.println("Element found in the stack at index " + count);
                }
            }
        } else {
            System.out.println("Element not found in the stack!");
        }
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        CheckElement obj = new CheckElement(5);           // Creating an object of the class by passing a value
        // Calling the method to insert elements into the stack

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(55);

        // Displaying all the elements in the stack
        System.out.println("Given stack:");
        obj.display();

        // Calling the method to search the element in the stack in the stack
        obj.searchElement(10);
    }
}