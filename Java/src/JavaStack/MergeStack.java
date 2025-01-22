package JavaStack;

// Write a Java program to merge two stacks into one.

public class MergeStack {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    MergeStack(int size) {          // Creating a parameterized constructor by passing a value
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

    public static void merge(MergeStack obj1, MergeStack obj2) {           // Method to merge stack
        int newSize = obj1.arr.length + obj2.arr.length;        // Storing the size for the both stacks

        MergeStack result = new MergeStack(newSize);          // Creating a new stack to store the merged stack

        // Iterating through th first stack
        for (int i = obj1.arr.length-1; i >= 0; i--) {
            result.push(obj1.arr[i]);
        }

        // Iterating through th second stack
        for (int j = obj2.arr.length-1; j >= 0; j--) {
            result.push(obj2.arr[j]);
        }
        result.display();         // Calling the method to display the merged stack
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {       // Main method
        MergeStack obj1 = new MergeStack(5);        // Creating a new stack by passing a value

        // Calling the method to insert elements into the stack
        obj1.push(5);
        obj1.push(4);
        obj1.push(3);
        obj1.push(2);
        obj1.push(1);

        // Displaying all the elements in the stack
        System.out.println("Stack - 1");
        obj1.display();

        MergeStack obj2 = new MergeStack(5);        // Creating a new stack by passing a value

        // Calling the method to insert elements into the stack
        obj2.push(10);
        obj2.push(9);
        obj2.push(8);
        obj2.push(7);
        obj2.push(6);

        // Displaying all the elements in the stack
        System.out.println("\nStack - 1");
        obj2.display();

        // Calling the method to merge the two stacks
        System.out.println("\nMerging those two stacks into one");
        merge(obj1, obj2);
    }
}