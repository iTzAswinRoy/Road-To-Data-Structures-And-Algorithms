package JavaCircularLinkedList;

// Implement a function to delete a node from a circular linked list.
public class DeletingNode {       // Circular linked list class
    int size;       // Creating instance variable for size
    Node head;      // Creating head pointer
    Node tail;      // Creating tail pointer

    DeletingNode() {        // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public void insertNode(int value) {     // Method to insert node in the circular linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail as head
            tail.next = head;       // Setting the tail pointing towards head

        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Setting the tail pointer to the new node
            tail = newNode;         // Assigning tail as new node
            tail.next = head;       // Now the tail is pointing towards head
        }
        size++;     // Incrementing size by 1
    }

    public void deleteFist() {      // Method to delete node at first
        head = head.next;       // Moving the head to its next node
        tail.next = head;       // updating the tail pointer, pointing towards the new head
        size--;     // Decrementing size by 1
    }

    public void deleteLast() {      // Method to delete node at last
        Node curr = head;       // Creating 'current' pointer, pointing at head
        Node prev = tail;       // Creating 'previous' pointer, pointing at tail

        do {        // Using do while loop in order to print node starting from head
            // For each iterating, we're updating the current and previous point to its next node
           prev = curr;
           curr = curr.next;

        } while (curr.next != head);        // Condition keeps going until the pointer reaches the tail node

        // Once the 'current' pointer reaches the tail
        prev.next = head;       // The 'previous' reference is pointing to head
        tail = prev;        // Then the new tail is updated to the previous node
        size--;     // Decrementing size by 1
    }

    public void deleteAtSpecificIndex(int index) {      // Method to delete not at specific index
        Node curr = head;       // Creating 'current' pointer, pointing at head
        Node prev = tail;       // Creating 'previous' pointer, pointing at tail

        System.out.println("\nRemoving node at specific index:");

        if (index > size) {     // Checking if the index is greater than the size
            System.out.println("Index out of bound!");      // Displays error message
            return;     // Exits the method

        } else {
            for (int i = 0; i < index; i++) {       // Iterating till the specific index
                // For each iterating, we're updating the current and previous point to its next node
                prev = curr;
                curr = curr.next;
            }
            // Once the 'current' pointer reached at the specified index, we're now updating the 'previous' and 'current' pointers
            prev.next = curr.next;      // Here the previous node is pointing towards the current's next node
            System.out.println("Node " + curr.value + " is removed at index " + index);
        }
        size--;     // Decrementing size by 1
    }

    public void display() {     // Method to display the circular linked list
        Node temp = head;       // Creating a temp node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);     // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");     // Displaying 'head' for reference
    }

    class Node {        // Creating a node class
        int value;      // Creating an instance variable to store a value for the node
        Node next;      // Creating a reference, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;      // Assigning the parameter value to the instance variable
        }
    }

    public static void main(String[] args) {        // Main method
        DeletingNode circularLinkedList = new DeletingNode();       // Creating an object of class type

        // Inserting node to the circular linked list
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        // Displaying the circular linked list
        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nRemoving node at first:");
        circularLinkedList.deleteFist();        // Calling the method to delete the first node
        circularLinkedList.display();       // Displaying the updated circular linked list

        System.out.println("\nRemoving node at last:");
        circularLinkedList.deleteLast();        // Calling the method to delete the last node
        circularLinkedList.display();       // Displaying the updated circular linked list

        // Calling the method to delete the node at specific index
        circularLinkedList.deleteAtSpecificIndex(1);

        // Displaying the updated circular linked list
        System.out.println("\nCircular linked list after removing the nodes:");
        circularLinkedList.display();
    }
}