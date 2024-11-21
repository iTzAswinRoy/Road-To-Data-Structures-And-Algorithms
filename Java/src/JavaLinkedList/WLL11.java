package JavaLinkedList;

// Write a Java program to display elements and their positions in a linked list.
public class WLL11 {
    // Creating instance variables for the class
    int size;       // Creating a variable to store size
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type

    WLL11() {       // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {       // Creating a class for node
        // Creating instance variables for the class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

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

    public void elementPosition(int index) {        // Method to find the position of the node
        // Checking if the index is out of bound or not
        if (index > size) {
            System.out.println("Index out of bound!");      // Displaying the error message
            return;         // Exits the method
        }

        Node temp = head;       // Creating a 'temp' node pointing at head
        for (int i = 0; i < size; i++) {        // i
            if (i == index) {
                System.out.println("The element " + temp.value + " is at position " + i + " in the linked list.");
                break;
            }
            temp = temp.next;
        }
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
        WLL11 linkedList = new WLL11();

        // Calling the method to insert the node in the linked list
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to find the elements position
        System.out.println("\nFinding elements position:");






        linkedList.elementPosition(2);          // rewrite
    }
}
