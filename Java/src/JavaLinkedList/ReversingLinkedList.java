package JavaLinkedList;

// Reverse a singly linked list.
public class ReversingLinkedList {
    // Creating instance variables for the class
    int size;       // Creating a variable to store size
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type

    ReversingLinkedList() {        // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {       // Creating a class for node
        // Creating instance variables for the class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {      // Creating a parameter constructor by passing the value
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
        size++;     // Incrementing size by 1
    }


    public void reversLinkedList() {
        // This process helps to move the reference of the head to its last node(tail)
        Node previous = null;       // Creating a 'previous' node pointing at null
        Node current = head;        // Creating a 'current' node pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through the list in order to change its reference in backwards.
            Node nextNode = current.next;    // Storing the next node which is ahead of the current node.
            current.next = previous;       // Reversing the current node's pointer to previous (behind) node.

            previous = current;     // Now, moving the previous node to current node.
            current = nextNode;     // Again moving the current node to its next node.
        }
        head = previous;    // Updating the head to 'previous' where the new head starts from the end of the list.
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
        ReversingLinkedList linkedList = new ReversingLinkedList();

        // Calling the method to insert the node in the linked list
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to reverse the linked list
        linkedList.reversLinkedList();

        // Calling the method to display the linked list
        System.out.println("\nReversed linked list:");
        linkedList.display();
    }
}