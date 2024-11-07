package JavaLinkedList;

import java.util.Scanner;       // Importing scanner class

// Write a Java program to insert some elements at the specified position into a linked list.
public class InsertingElementAtASpecificIndex {
    int size;       // Creating a variable to store size
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type

    InsertingElementAtASpecificIndex() {        // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {     // Creating a class for node
        // Creating instance variables for the class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;         // Initializing values to the instance variable
        }
    }

    public void insertFirst(int value) {        // Method to insert node at first in the linked list
        Node newNode = new Node(value);         // Creating a node by passing the value
        newNode.next = head;        // Assigning the new node's next pointer to 'head'
        head = newNode;         // Updating the head as new node

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            tail = head;        // Updating the head as tail
        }
        size++;     // Incrementing size by 1
    }

    public void insertElement() {
        Scanner in = new Scanner(System.in);        // Creating a scanner object to get inputs from the user

        System.out.println("\nEnter the index:");
        int index = in.nextInt();       // Storing the inputs from the user

        // Checking if the index is out of bound
        if (index > size) {
            System.out.println("\nIndex out of bound");     // Displays the error message
            return;       // Exits the method
        }

        System.out.println("\nEnter the element to insert: ");
        Node newNode = new Node(in.nextInt());      // Creating a node by passing the value from the user

        // Checking fi the index is zero
        if (index == 0) {
            // Updating the head
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;         // Updating the head as new node

        } else {
            Node previous = null;       // Creating a 'previous' node pointing at null
            Node current = head;        // Creating a 'current' node pointing at head

            // Iterating through the linked list till we reach the specific index
            for (int i = 0; i < index; i++) {
                previous = current;         // Assigning the 'previous' pointer to 'current'
                current = current.next;     // Moving the 'current' pointer node
            }

            // Once we reach the specific index, we're inserting the new node
            previous.next = newNode;        // Assigning the 'previous' pointer to new node
            newNode.next = current;         // Assigning the new node's pointer to 'current'
        }
        size++;     // Incrementing size by 1
    }

    public void display() {         // Method to display the linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the pointer to the next node

            // Checking if the 'temp' reaches the end
            if(temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the linked list
        InsertingElementAtASpecificIndex linkedList = new InsertingElementAtASpecificIndex();

        // Calling the method to insert the node in the linked list
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to insert element at specific index in the linked list
        linkedList.insertElement();

        // Calling the method to display the linked list
        System.out.println("\nLinked list after inserting element in the linked list:");
        linkedList.display();
    }
}
