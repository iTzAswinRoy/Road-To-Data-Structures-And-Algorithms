package JavaStack;

// Write a Java program to swap the top two elements of a given stack.

public class SwapElements {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    SwapElements(int size) {          // Creating a parameterized constructor by passing a value
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

    public void swap(int e1, int e2) {          // Method to swap elements in the stack
        System.out.println("\nThe elements to be swapped are " + e1 + " & " + e2 + "\n");

        // Setting the index for both the elements as -1
        int index1 = -1;
        int index2 = -1;

        // Iterating through the stack
        for (int i = top; i >= 0; i--) {
            // Checking if the element 1 is present in the stack
            if (arr[i] == e1) {
                index1 = i ;        // Updating the index
            }

            // Checking if the element 2 is present in the stack
            if (arr[i] == e2) {
                index2 = i;         // Updating the index
            }
        }

        // Checking if both the index remains unchanged
        if (index1 == -1 || index2 == -1) {
            System.out.println("Can't perform the swap function because the element which is given is not found!");
            return;         // Exits the method

        } else {
            // Here the swapping process takes place
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

        System.out.println("Stack after being swapped:");
        display();      // Calling the method to display the elements
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        SwapElements obj = new SwapElements(5);         // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        obj.push(65);
        obj.push(99);
        obj.push(80);
        obj.push(25);
        obj.push(30);

        // Displaying all the elements in the stack
        System.out.println("Given stack:");
        obj.display();

        // Calling the method to swap elements in the stack
        obj.swap(25,80);
    }
}