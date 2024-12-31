package JavaStack;

// Write a Java program to implement a stack with push and pop operations.
// Find the top element of the stack and check if the stack is empty or not.
 public class w1 {          // Creating a class for stack
    // Creating instance variables for the class
    private int[] arr;      // Creating a reference variable of an array
    private int top;        // Creating a reference variable top

    w1 (int size) {          // Creating a parameterized constructor by passing a value
        // Initializing the reference variable
        arr = new int[size];        // Here, we're creating an array object whenever an object is created
        top = -1;       // Initializing the top to -1, which indicates the stack size is empty
    }

    public void push(int num){      // Method to add element into the stack
        if (top == arr.length - 1) {        // Checking if the stack is full
            System.out.println("Stack is full");//
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

    public void display() {         // Method to display elements int the stack
        // Iterating each element from end to beginning
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);     // Displaying the element
        }
    }

    public static void main(String[] args) {        // Main method
        w1 obj = new w1(5);         // Creating an object of the class by passing a value

        // Calling the method to insert elements into the stack
        System.out.println("Pushing elements to the stack:");
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        // Displaying all the elements in the stack
        obj.display();

        // Calling the method to remove element from the stack
        System.out.println(obj.pop());

        // Displaying all the elements in the stack
        System.out.println("\nCurrent stack:");
        obj.display();

        // Calling the method to get the last element from the stack
        System.out.println(obj.peek());
    }
}