package JavaDoublyLinkedList;

// Create a class that implements a doubly linked list with operations such as insert, delete, search, and display (both forward and backward).
public class CreateDoublyLinkedList {     // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store size

    CreateDoublyLinkedList() {       // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {     // Creating a class for node
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node

        Node(int value) {        // Creating a parameter constructor by passing the value
            this.value = value;       // Assigning the parameter value to the instance variable
        }
    }

    public void insertFirst(int value) {     // Method to insert node at first in the doubly linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if(tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // updating tail as head

        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            head.prev = newNode;        // Setting the head previous pointer to the new node
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;     // Updating new node as head
        }
        size++;     // Incrementing size by 1
    }

    public void insertLast(int value) {      // Method to insert node at last
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            insertFirst(value);     // Calling the insertFirst method again

        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Setting the next pointer of the tail pointing towards the new node
            newNode.prev = tail;        // Setting the previous pointer of the new node pointing towards the tail
            tail = newNode;     // Updating tail as new node
        }
        size++;     // Incrementing size by 1
    }

    public void deleteFirst() {      // Method to delete the first node
        if (head == null) {     // Checking if the head is empty
            System.out.println("List is empty.");
            return;     // Exits the method with display message

        } else {
            head = head.next;       // Moving the head to next node
            head.prev = null;       // Assigning the previous pointer of head to null
        }
        size--;
    }

    public void deleteLast() {       // Method to delete a node at last
        if (head == null) {       // Checking if the head is null
            System.out.println("List is empty.");
            return;     // Exits the method with display message

        } else {
            tail = tail.prev;      // Updating the tail by pointing the tail's previous pointer to last's previous node
            tail.next = null;       // Assigning the next of tail to null
        }
        size--;     // Decrementing size by 1
    }

    public void searchNode(int index) {      // Method to search a node at specific index
        if (index > size) {     // Checking if the index is less than its size
            System.out.println("\nIndex out of bound!");
            return;     // Exits the method with display message
        }
        Node temp = head;       // Creating a 'temp' node pointing at head

        for (int i = 0; i < index; i++) {       // Iterating through the linked list
            temp = temp.next;       // Moving the temp pointer to the required index
        }
        System.out.println("Node at index " + index + " is " + temp.value);     // Displaying the node at specific index
    }

    public void reverseDoublyLinkedList() {      // Method to reverse the doubly linked list
        Node temp = tail;       // Creating a 'temp' node pointing at tail

        for (int i = 0; i < size; i++) {        // Iterating through the linked list
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.prev;       // Moving the 'temp' node backwards
        }
        // Checking if the 'temp' reaches the end
        if (temp == null) {
            System.out.println("END");      // Displaying 'END' for reference
        }
    }

    public void display() {     // Method to display the doubly linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through the linked list
            System.out.print(temp.value + " -> ");        // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node
        }
        // Checking if the 'temp' reaches the end
        if (temp == null) {
            System.out.println("END");      // Displaying 'END' for reference
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the doubly linked list
        CreateDoublyLinkedList DoublyLinkedList = new CreateDoublyLinkedList();

        // Calling the method to insert the node at first
        DoublyLinkedList.insertFirst(1);
        DoublyLinkedList.insertFirst(2);
        DoublyLinkedList.insertFirst(3);
        DoublyLinkedList.insertFirst(4);
        DoublyLinkedList.insertFirst(5);

        // Displaying the doubly linked list
        System.out.println("Inserting Node at first");
        DoublyLinkedList.display();

        // Calling the method to insert the node at last
        DoublyLinkedList.insertLast(10);
        DoublyLinkedList.insertLast(20);
        DoublyLinkedList.insertLast(30);
        DoublyLinkedList.insertLast(40);
        DoublyLinkedList.insertLast(50);

        // Displaying the doubly linked list
        System.out.println("\nInserting node at last");
        DoublyLinkedList.display();

        // Calling the method to delete the node at first
        DoublyLinkedList.deleteFirst();
        System.out.println("\nDeleting Node at first");

        // Displaying the doubly linked list
        DoublyLinkedList.display();

        // Calling the method to delete the node at last
        DoublyLinkedList.deleteLast();
        System.out.println("\nDeleting node at last");

        // Displaying the doubly linked list
        DoublyLinkedList.display();

        // Calling the method to reverse the doubly linked list
        System.out.println("\nReversing doubly linked list:");
        DoublyLinkedList.reverseDoublyLinkedList();

        // Calling the method to display the original doubly linked list
        System.out.println("\nOriginal doubly linked list:");
        DoublyLinkedList.display();

        // Calling the method to search the node at specific index
        System.out.println("\nSearching Node:");
        DoublyLinkedList.searchNode(5);
    }
}