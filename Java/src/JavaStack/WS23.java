package JavaStack;

// Write a Java program that implements a stack and creates a new stack that contains all elements from two stacks without duplicates.

public class WS23 {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    WS23 (int size) {          // Creating a parameterized constructor by passing a value
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

    static WS23 mergeStack(WS23 obj1, WS23 obj2) {          // Method to merge the stack
        WS23 mergedStack = new WS23(obj1.arr.length + obj2.arr.length);            // Creating a stack to get store the merged elements

        // Iterating through first stack
        for (int i = obj1.top; i >= 0; i--) {
            mergedStack.push(obj1.arr[i]);
        }

        // Iterating through second stack
        for (int j = obj2.top; j >= 0; j--) {
            mergedStack.push(obj2.arr[j]);
        }
        return mergedStack;        // Retuning the merged stack
    }

    public void removeDuplicateElements(WS23 mergeStack) {          // Method to remove duplicate elements
        WS23 result = new WS23(mergeStack.arr.length);        // Creating a stack to get store the removed duplicate elements

        // Using nested loop to compare elements with all elements
        for (int i = mergeStack.top; i >= 0; i--) {
            int currentElement = mergeStack.arr[i];

            // Checking if the element is already present in the stack
            if (!contains(result, currentElement)) {
                result.push(currentElement);        // Pushing the element into the stack
            }
        }
        result.display();       // Displaying the result
    }

    public boolean contains(WS23 stack, int element) {          // Method to check if the element is present in the stack
        for (int i = stack.top; i >=0; i--) {
            if(stack.arr[i] == element) {
                return true;        // Returning true, if element is found
            }
        }
        return false;      // Returning false, if element is not found
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        WS23 obj1 = new WS23(5);            // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        obj1.push(1);
        obj1.push(1);
        obj1.push(6);
        obj1.push(6);
        obj1.push(3);

        // Displaying all the elements in the stack
        System.out.println("Stack - 1:");
        obj1.display();

        WS23 obj2 = new WS23(4);        // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        obj2.push(5);
        obj2.push(2);
        obj2.push(2);
        obj2.push(5);

        // Displaying all the elements in the stack
        System.out.println("\nStack - 2:");
        obj2.display();

        WS23 combinedStack = mergeStack(obj1, obj2);        // Calling the method to merge both the stack
        System.out.println("\nMerged stack:");

        // Displaying the merged stack
        combinedStack.display();

        // Calling the method to remove the duplicates in the merge stack
        System.out.println("\nAfter removing duplicate elements: ");
        obj1.removeDuplicateElements(combinedStack);
    }
}