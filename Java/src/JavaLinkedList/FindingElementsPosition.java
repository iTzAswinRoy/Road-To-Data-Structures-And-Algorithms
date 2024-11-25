package JavaLinkedList;

// Write a Java program to display elements and their positions in a linked list.
public class FindingElementsPosition {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    FindingElementsPosition() {       // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {       // Creating a class for node
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            // Initializing values to the instance variable
            this.value = value;
        }
    }

    public void insertNode(int value) {         // Method to insert node at first in the linked list
        Node newNode = new Node(value);         // Creating a node by passing the value

        // Checking if the tail is null, then the linked list is empty
        if(tail == null) {
            // Updating the head
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;        // Updating the head as new node
            tail = head;        // Updating the head as tail

        } else {
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Assigning the tail's next pointer to new node
        }
        size++;      // Incrementing size by 1
    }

    public void findingPosition(int element) {        // Method to find the position of the node
        Node temp = head;       // Creating a 'temp' node pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through the linked list
            // Checking if the required index
            if (temp.value == element) {
                System.out.println("The element " + element + " is at position " + i + " in the linked list.");      // Displaying the elements positions
                return;      // Exits the method
            }
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }
        System.err.println("Element not found!");      // Displaying the error message
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
        FindingElementsPosition linkedList = new FindingElementsPosition();

        // Calling the method to insert the node in the linked list
        linkedList.insertNode(11);
        linkedList.insertNode(22);
        linkedList.insertNode(33);
        linkedList.insertNode(44);
        linkedList.insertNode(55);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to find the elements position
        System.out.println("\nFinding elements position:");
        linkedList.findingPosition(33);
    }
}