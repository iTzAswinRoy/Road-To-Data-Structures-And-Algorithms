package JavaLinkedList;

// Write a Java program to append the specified element to the end of a linked list.
public class AppendNode {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    public AppendNode() {      // Creating a default constructor
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

    public void insertFirst(int value) {        // Method to insert node at first in the linked list
        Node newNode = new Node(value);         // Creating a node by passing the value
        newNode.next = head;        // Assigning the new node's next pointer to 'head'
        head = newNode;         // Updating the head as new node

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            tail = head;        // Updating the tail as head
        }
        size++;       // Incrementing size by 1
    }

    public void insertLast(int value) {        // Method to insert node at last
        // Checking if the tail is not assigned which means linked list is empty
        if (tail == null) {
            insertFirst(value);     // Calling the insert first method to assign the tail

        } else {
            // If the linked list is not empty
            Node newNode = new Node(value);        // Creating a node by passing the value
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Updating the tail as new node
            size++;         // Incrementing size by 1
        }
    }

    public void display() {      // Method to display the linked list
        Node temp = head;        // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the pointer to the next node

            // Checking if the 'temp' reaches the end
            if (temp == null) {
                System.out.println("END");       // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the linked list
        AppendNode list = new AppendNode();

        // Calling the method to insert the node in the linked list
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);

        // Displaying the linked list
        System.out.println("Original linked list:");
        list.display();

        // Calling the method to display the linked list
        System.out.println("\nLinked list after appending the elements:");
        list.insertLast(0);      // Calling the method to insert node at last
        list.display();
    }
}