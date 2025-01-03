package JavaBasics;

import java.util.Scanner;       // Importing scanner class

// Write a Java program to delete a specified node in the middle of a singly linked list.
public class DeletingNode {      // Creating a class which handles linked list
    private Node head;      // Creating a reference for head
    private Node tail;      // Creating a reference for tail
    private int size;       // Creating a size

    DeletingNode() {     // Creating a constructor to initialize the size of the linked list
        this.size = 0;     // Initializing the size of the linked list
    }

    public class Node {      // Creating the Node class which handles data and its reference of the node
        private int data;       // Creating a data which holds the value of the node
        private Node next;      // Creating the reference of the next node

        Node(int data) {     // Creating a constructor to initialize the value of the node
            this.data = data;      // With the help of 'this' keyword, assigning the default value for Node from the user
        }
    }

    public void insertFirst(int value) {     // Method to insert the node to the linked list
        Node newNode = new Node(value);     // Creating a node which stores a value
        newNode.next = head;    // Setting the new node referencing to head
        head = newNode;     // Assigning the head to new node

        if (tail == null) {       // Checking if the tail is empty
            tail = head;        // If tail is empty, then head is tail
            return;     // This make sure's in any one node is inserted it'll automatically assign the head and tail for a single node
        }
        size++;     // Then the size will be incremented for each node is inserted
    }

    public void deleteIndex(int index) {     // Method to delete a specified node
        if (index < 0 || index > size) {      // Using a condition if the given index exceeds the size of the linked list
            System.err.println("Index out of bound!");      // Displaying  an error message
            throw new IllegalArgumentException();     // Throwing an exception
        }
        if (index == 0) {     // If we are deleting the head node
            head = head.next;  // Move the head to the next node
        } else {
            Node current = head;    // Create a current node that starts at the head
            Node previous = null;    // Initialize previous as null

            for (int i = 0; i < index; i++) {      // Iterate over the linked list until we reach the specified index
                previous = current;     // Move previous to current
                current = current.next;     // Move current to the next node
            }
            previous.next = current.next;     // Update the previous node's next to skip the current node
        }
        size--;     // Incrementing the size by 1

        System.out.println("\nLinked list after deleting index at " + index + ":");
    }

    public void display() {     // Method to display the linked list
        Node temp = head;       // Creating a temp variable which store the head node

        while (temp != null) {      // Creating a loop until it reaches the end of the linked list
            System.out.print(temp.data + " -> ");     // Receiving the node
            temp = temp.next;       // Setting the temp referencing to next node
        }
        if (tail.next == null) {        // Checking if the next of tail is null
            System.out.print("END\n");    // Giving a reference to the tail node
        }
    }

    public static void main(String[] args) {    // Main method
        Scanner in = new Scanner(System.in);    // Creating a Scanner object
        DeletingNode obj = new DeletingNode();      // Creating an object ot call the methods

        System.out.println("Enter the size of the linkedList:");
        int LL_size = in.nextInt();     // Assigning the size of the linked list

        System.out.println("Enter the values of each Node:");
        for (int i = 0; i < LL_size; i++) {     // Iterating over the linked list
            obj.insertFirst(in.nextInt());      // Inserting value's to the node with the help of the insert method
        }
        System.out.println("\nLinked list after inserting node:");
        obj.display();      // Calling the method to display the linked list

        try {
            System.out.println("\nEnter the index to be deleted:");

            int indexToBeDeleted = in.nextInt();    // Enter ing the index of the node to be deleted
            obj.deleteIndex(indexToBeDeleted);      // Calling the delete method the remove the specific noe

        } catch (IllegalArgumentException e) {      // Catching the exception and also creating an object
            System.out.println("\nCurrent linked list:");       // Displays the error message, if catch block is occurred
        }
        obj.display();      // Calling the method to display the linked list
        in.close();     // Closing scanner
    }
}