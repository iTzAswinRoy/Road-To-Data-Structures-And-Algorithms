package JavaDoublyLinkedList;

// Write a function to reverse the nodes of a doubly linked list in place.
public class Reverse {     // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store size

    Reverse() {        // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {       // Creating a class for node
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;       // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {      // Method to insert node at first in the doubly linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // updating tail as head

        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Assigning the next of tail as new node
            newNode.prev = tail;        // Assigning the previous of new node as tail
            tail = newNode;     // Updating tail as new node
        }
        size++;     // Incrementing size by 1
    }

    public void reverseList() {      // Method to reverse the list
        Node temp = tail;       // Creating a 'temp' node pointing at tail

        for (int i = 0; i < size; i++) {        // Iterating through the linked list
            System.out.print(temp.value + " -> ");        // Displaying the value of each node
            temp = temp.prev;       // Moving the 'temp' node backwards
        }
        // Checking if the 'temp' reaches the end
        if (temp == null) {
            System.out.println("END");      // Displaying 'END' for reference
        }
    }

    public void display(){      //
        Node temp = head;       // Creating a 'temp' node pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through the linked list
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node
        }
        // Checking if the 'temp' reaches the end
        if (temp == null) {
            System.out.println("END");      // Displaying 'END' for reference
        }
    }

    public static void main(String[] args) {        // Main method
        Reverse DoublyLinkedList = new Reverse();     // Creating an object of class type

        // Calling the method to insert the node in doubly linked list
        DoublyLinkedList.insertNode(1);
        DoublyLinkedList.insertNode(2);
        DoublyLinkedList.insertNode(3);
        DoublyLinkedList.insertNode(4);
        DoublyLinkedList.insertNode(5);

        // Displaying the original doubly linked list
        System.out.println("Original doubly linked list:");
        DoublyLinkedList.display();

        // Calling the method to reverse the doubly linked list
        System.out.println("\nReversed doubly linked list:");
        DoublyLinkedList.reverseList();
    }
}

