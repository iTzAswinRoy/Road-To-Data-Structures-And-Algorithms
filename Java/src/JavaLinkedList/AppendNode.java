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

    public void insertFirst(int value) {        // Method to insert node at first in the doubly linked list
        Node newNode = new Node(value);         // Creating a node by passing the value
        newNode.next = head;        // Assigning the new node's next pointer to 'head'
        head = newNode;         // Updating the head as new node

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            tail = head;        // Updating tail as head
        }
        size++;       // Incrementing size by 1
    }

    public void insertLast(int value) {        // Method to insert node at last
        // Checking if the tail is not assigned which means linked list is empty
        if(tail== null){
            insertFirst(value);     // Calling the insert first method to assign the tail
        } else{
            // If the linked list is not empty
            Node newNode = new Node(value);     // Creating a node by passing the value
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Updating the tail as new node
            size++;         // Incrementing size by 1
        }
    }

    public void display() {      // Method to display the linked list
        Node temp = head;        // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");
            temp = temp.next;       // Moving the pointer to the next node

            // Checking if the 'temp' reaches the end
            if (temp == null) {
                System.out.println("END");       // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the linked list
        AppendNode obj = new AppendNode();

        System.out.println("Original linked list:");
        // Calling the method to insert the node at first
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        obj.insertFirst(5);
        obj.insertFirst(6);
        obj.display();

        // Calling the method to display the linked list
        System.out.println("\nLinked list after appending the elements:");
        obj.insertLast(0);      // Calling the method to insert node at last
        obj.display();
    }
}