package JavaLinkedList;

// Write a Java program to iterate through all elements in a linked list starting at the specified position.
public class LinkedListFromASpecificPosition {
    // Creating instance variables for the class
    int size;       // Creating a variable to store size
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type

    LinkedListFromASpecificPosition() {        // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {         // Creating a class for node
        // Creating instance variables for the class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            // Initializing values to the instance variable
            this.value = value;
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
        size++;         // Incrementing size by 1
    }

    public void specificPosition(int index) {       // Method to display the linked list from specific index
        // Checking if the index is not out of bound
        if (index > size) {
            System.out.println("Given index is out of bound!");     // Displays the error message

        } else {
            Node temp = head;       // Creating a 'temp' node pointing at head

            for (int i = 0; i < index; i++) {       // Iterating through the linked list till the specific index
                temp = temp.next;       // Moving the pointer to the next node
            }

            for (int i = index; i < size; i++) {        // Iterating from the start of the index
                System.out.print(temp.value + " -> ");      // Displaying the current node
                temp = temp.next;       // Moving the pointer to the next node
            }

            // Checking if the 'temp' reaches the end of the linked list
            if (temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
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
        LinkedListFromASpecificPosition linkedList = new LinkedListFromASpecificPosition();

        // Calling the method to insert the node in the linked list
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to display the linked list from a specific position
        System.out.println("\nLinked list from a specific point:");
        linkedList.specificPosition(2);
    }
}
