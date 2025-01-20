package JavaStack;

//Write a Java program to sort the elements of a given stack in ascending order

public class SortingStack {      // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    SortingStack(int size) {          // Creating a parameterized constructor by passing a value
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
            return 0;

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

    public void sortAscendingOrder() {          // Method to sort the elements in ascending order
        // Using bubble sor
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {
                    // Here the swapping process takes place
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        SortingStack obj = new SortingStack(5);       // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        System.out.println("Pushing elements to the stack:");
        obj.push(88);
        obj.push(55);
        obj.push(66);
        obj.push(99);
        obj.push(22);

        // Displaying all the elements in the stack
        System.out.println("Given stack:");
        obj.display();


        // Calling the method to sort the elements in ascending order
        System.out.println("\nSorted the stack in ascending order:");
        obj.sortAscendingOrder();
        obj.display();
    }
}