package JavaQueue;

import java.util.Scanner;       // Importing scanner class

public class CreatingQueue {
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    class Node {        // Creating a class for node
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node (int value) {
            this.value = value;
        }
    }

    public void enqueue(int value) {        // Method to add elements to the queue
        Node newNode = new Node(value);         // Creating a node

       // Checking if the queue is empty
       if (tail == null) {
           head = newNode;     // Assigning value to head
           tail = head;        // Assigning tail as head

       } else {
           newNode.next = head;         // New node pointing at head
           head = newNode;          // Assigning head as new node
       }
        System.out.println("Element added.");
    }

    public void deQueue() {       // Method to remove elements from the queue
        // Checking if the queue is empty
        if (tail == null) {
            System.out.println("Queue is empty!");
        } else {
            head = head.next;       // Moving the head pointer to the next node
        }
        System.out.println("First element is removed.");
    }

    public void peek() {        // Method to view the first element in the queue
        // Checking if the queue is empty
        if (tail == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Peaking queue: " + head.value);         // Displaying the node
        }
    }

    public void view() {        // Method to view the queue
        Node temp = head;       // Creating a temp node pointing at head
        System.out.println("Viewing Queue:");//

        // Iterating till the temp reaches null
        while (temp != null) {
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the temp pointer to the next node

            // Checking if the temp reaches the null
            if (temp == null) {
                System.out.println("END");
            }
        }
    }

    public static void main(String[] args) {        // Main method
        CreatingQueue queue = new CreatingQueue();      // Creating an object of the class

        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Queue initialized successfully.");

        boolean execution = true;       // Creating a boolean variable

        // Iterating util the loop encounters false
        while (execution) {
            // Display message
            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.println("1. Add a value to the queue (enqueue)");
            System.out.println("2. Remove the front element from the queue (dequeue)");
            System.out.println("3. Peek the first element in the queue:");
            System.out.println("4. View all the elements in the queue:");
            System.out.println("5. Exit");
            System.out.println("-------------------------------------------------------------------------------------");

            System.out.print("\nEnter an option:\n");
            int option = in.nextInt();      // Getting input from the user

            // Creating a switch case for various inputs
            switch (option) {
                case 1 -> {
                    System.out.println("Enter the element to add at first:");

                    int value = in.nextInt();
                    queue.enqueue(value);       // Calling enqueue method to add elements at first
                }
                case 2 -> queue.deQueue();      // Calling enqueue method to remove elements at first

                case 3 -> queue.peek();         // Calling enqueue method

                case 4 -> queue.view();         // Calling enqueue method

                case 5 -> {
                    System.out.println("Exiting.....");
                    execution = false;      // Turning the boolean to false, in order to exits the loop
                }
                default -> System.out.println("Invalid option!");       // Error message
            }
        }
    }
}