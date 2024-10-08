package JavaDoublyLinkedList;

// Rotate a doubly linked list by k nodes (where k can be positive or negative).
public class RotateDoublyLinkedList {     // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store the size

    RotateDoublyLinkedList() {        // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }

    class Node {        // Creating a 'Node' class
        // Creating instance variables for the class
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node
        private int value;      // Creating an instance variable to store a value of the node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {     // Method to insert node to the doubly linked list
        Node newNode = new Node(value);     // Creating a new node by passing a value

        if (tail == null) {      // Checking if the tail is null
            head = newNode;     // Assigning the head to new node
            tail = head;        // Updating the tail to head since there's only one node

        } else {
            tail.next = newNode;        // Updating the tail with the new node
            newNode.prev = tail;        // Assigning the previous pointer of the node to tail
            tail = newNode;       // Now updating the tail as new node
        }
        size++;       // Incrementing size by 1
    }

    public void rotate(int index) {     // Method to rotate the doubly linked list
        System.out.println("\nRotating doubly linked list at index " + index);
        Node firstNode = head;       // Creating a reference variable 'firstNode' pointing at head

        if (index > size) {     // Checking if the index is greater than the size of the list
            System.out.println("Index out of bound!");      // Displaying the error message
            return;     // Exits the method
        }

        for (int i = 0; i < index; i++) {       // Iterating through the doubly linked list till we reach the required index
            head = head.next;       // Moving the head pointer to the next node
        }

        while (head != null) {      // Iterating through the linked list until the head is null
            System.out.print(head.value + " -> ");      // Displaying the current head
            head = head.next;       // Moving the head to the next node
        }

        tail = firstNode;        // Assigning the tail as 'firstNode'

        for (int i = 0; i < index; i++) {       // Iterating through the linked list till we reach the required index
            System.out.print(tail.value + " -> ");      // Displaying the current each node
            tail = tail.next;       // Moving the tail to the next node
        }
        System.out.println("END");      // Displaying 'END' for reference
    }

    public void display() {         // Method to display the linked list
        Node temp = head;       // Creating a reference variable 'temp' pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through linked list
            System.out.print(temp.value + " -> ");      // Displaying the node
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }

        if (temp == null) {        // Checking if 'temp' is null
            System.out.println("END");       // Displaying 'END' for reference
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the doubly linked list
        RotateDoublyLinkedList doublyLinkedList = new RotateDoublyLinkedList();

        // Calling the method to insert the node in doubly linked list
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        // Displaying the doubly linked list
        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        // Calling the method to rotate the doubly linked list
        doublyLinkedList.rotate(2);
    }
}