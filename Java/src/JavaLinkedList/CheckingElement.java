package JavaLinkedList;

// Write a Java program to check if a particular element exists in a linked list.
public class CheckingElement {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    CheckingElement() {        // Creating a default constructor
        this.size = 0;         // Initializing the size to 0
    }

    public class Node {         // Creating a 'Node' class
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {        // Creating a parameter constructor by passing the value
            // Initializing values to the instance variable
            this.value = value;
        }
    }

    public void insertNode(int value) {         // Method to insert node in the linked list
        Node newNode = new Node(value);         // Creating a node by passing the value

        // Checking if the tail is null, then the linked list is empty
        if (tail == null) {
            // Updating the head
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;         // Updating the head as new node
            tail = head;        // Updating the head as tail
        } else {
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Assigning the tail's next pointer to new node
        }
        size++;         // Incrementing size by 1
    }

    public void checkElement(int element) {         // Method to check if the element is present in the linked list
        System.out.println("\nChecking if the element " + element + " is in the linked list...");

        Node temp = head;           // Creating a 'temp' node pointing at head
        boolean isFound = false;        // Creating a boolean to false

        // Iterating through the linked list
        for (int i = 0; i < size; i++) {
            // Checking if the element is present
            if (element == temp.value) {

                System.out.println("Element found at index " + i);          // Display message
                isFound = true;         // Assigning the boolean to true:
                return;         // Exits the method
            }
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }

        // If the boolean remains false, then the element not found
        if (!isFound) {
            System.err.println("Element not found!");       // Displays the error message
        }
    }

    public void display() {         // Method to display the linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the 'temp' pointer to the next node

            // Checking if the 'temp' reaches the end
            if (temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {            // Main method
        // Creating an object to store the linked list
        CheckingElement linkedList = new CheckingElement();

        // Calling the method to insert the node in the linked list
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to check the element in the linked list
        linkedList.checkElement(3);
    }
}