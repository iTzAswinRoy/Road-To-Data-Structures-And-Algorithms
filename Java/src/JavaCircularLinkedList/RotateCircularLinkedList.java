package JavaCircularLinkedList;

// Implement a function to rotate a circular linked list to the right by k positions.
public class RotateCircularLinkedList {        // Class containing circular linked list properties
    // Creating instance variables for the class
    int size;       // Creating instance variable for size
    Node head;      // Creating head pointer
    Node tail;      // Creating tail pointer

    RotateCircularLinkedList() {      // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {        // Creating a node class
        // Creating instance variables for the class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode (int value){         // Method to insert node in the circular linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail as head
        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Setting the tail pointer to the new node
            tail = newNode;         // Assigning tail as new node
        }
        tail.next = head;       // Setting the tail pointing towards head
        size++;       // Incrementing size by 1
    }

    public void rotateList(int k) {       // Method to rotate the circular linked list
        Node current = head;        // Assigning 'current' pointer, pointing at head
        Node previous = null;       // Assigning 'previous' pointer to null

        System.out.println("\nRotating the circular linked list at " + k + "th position.");
        if (k > size || head == null) {         // Checking if the given k element is withing the range of the list
            System.out.println("Index out of bound!");      // Error message
            return;     // Exits the method if it's true
        }
        for (int i = 1; i < k; i++) {       // Iterating over the list till it reaches the k value
            // Moving the current and previous pointer one after the other for each iteration
            previous = current;
            current = current.next;
        }

        tail.next = head;       // Updating the reference pointer of the tail pointing at head
        head = current;         // Updating the new head to the current node
        tail = previous;        // Updating the tail to previous pointer
    }

    public void display() {     // Method to display the circular linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.next;         // Moving the pointer to the next node

        } while (temp != head);     // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");       // Displaying 'head' for reference
    }

    public static void main(String[] args) {        // Main method
        RotateCircularLinkedList circularLinkedList = new RotateCircularLinkedList();      // Creating an object of class type

        // Inserting node to the circular linked list
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        // Displaying the circular linked list
        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        circularLinkedList.rotateList(3);        // Calling the method to rotate the circular linked list
        circularLinkedList.display();       // Displaying the updated circular linked list
    }
}