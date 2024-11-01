package JavaLinkedList;

// Write a Java program to append the specified element to the end of a linked list.
public class WLL1 {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    public WLL1() {      // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {     // Creating a class for node
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        public Node(int value) {        // Creating a parameter constructor by passing the value
            this.value = value;         // Initializing values to the instance variable
        }
    }

    public void insertFirst(int value) {        // Method to insert node at first in the doubly linked list
        Node newNode = new Node(value);         // Creating a node by passing the value
        newNode.next = head;        // Assigning the new node's next pointer to 'head'
        head = newNode;         // Updating the head as new node

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            tail = head;        // Updating the tail as head
        }
        size++;     // Incrementing size by 1
    }

    public void insertLast(int value) {        // Method to insert node at last
        // Checking if the tail is not assigned which means linked list is empty
        if (tail== null) {
            insertFirst(value);      // Calling the insert first method to assign the tail
        } else{
            // If the linked list is not empty
            Node newNode = new Node(value);         // Creating a node by passing the value
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Updating the tail as new node
            size++;         // Incrementing size by 1
        }
    }

    public void deleteFirst() {         // Method to delete node at first
        // Checking if the head is null which means the linked list is empty
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");        // Displaying the error message
        } else {
            head = head.next;       // Moving the head pointer to its next node
        }
    }


    public void deleteLast() {         // Method to delete the last node
        // Checking if the head is null which means the linked list is empty
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");        // Displaying the error message
            return;         // Exits the method
        }
        // Traverse to the second-last node
        Node current = head;        // Creating 'current' pointing at head

        while (current.next != tail) {          // Iterating the linked list till the 'current' pointer reaches the tail
            current = current.next;
        }
        current.next = null;        // Here, we're assigning the last node as null
        size--;         // Decrementing the size by 1
    }

    public void deleteNode(int index) {         // Method to delete a node at specific index
        if (index < 0 || index >= size) {       // Checking if the index is in bound
            System.out.println("Index out of bounds!");     // Displays the error message
            return;         // Exits the method
        }

        // Checking if the head is null which means the linked list is empty
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");        // Displays the error message
            return;       // Exits the method
        }


        // If deleting the head node
        if (index == 0) {
            head = head.next;
        } else {
            // Traverse to the node just before the one to delete
            Node current = head;        // Creating 'current' pointing at head
            Node previous = null;       // Creating 'previous' pointing at null

            for (int i = 0; i < index; i++) {       // Iterating through the linked list till it reaches the specific index
                previous = current;      // Updating th previous pointer as current
                current = current.next;         // Moving the current pointer to the next node
            }
            // Update the next pointer to skip over the node to delete
            previous.next = current.next;
        }
        size--;         // Decrementing the size by 1
    }

    public void display() {      // Method to display the linked list
        Node temp = head;        // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");        // Displaying the current node
            temp = temp.next;           // Moving the pointer to the next node

            // Checking if the 'temp' reaches the end
            if (temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the linked list
        WLL1 list = new WLL1();

        // Calling the method to insert the node in the linked list
        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        // Calling the method to display the linked list
        System.out.println("\nOriginal linked list:");
        list.display();

        // Calling the method to insert the node in the linked list

        System.out.println("\nInserting a node at first:");
        list.insertFirst(5);
        list.display();

        System.out.println("\nDeleting a node at first:");
        list.deleteFirst();
        list.display();

        System.out.println("\nDeleting the node at last:");
        list.deleteLast();
        list.display();

        System.out.println("\nDeleting a node at specific index at 2:");
        list.deleteNode(2);
        list.display();
    }
}