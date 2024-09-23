package JavaCircularLinkedList;

// Write a function to insert a node into a circular linked list at a specified position.
public class NodeAtSpecificPosition {       // Circular linked list class
    // Creating instance variables for the class
    int size;       // Creating a variable to store size
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type

    NodeAtSpecificPosition() {      // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {      // Creating a node class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
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

    public void specificPosition(int index, int value) {      // Method to insert a node at a specific position
        Node newNode = new Node(value);         // Creating a node by passing the value

        System.out.println("\nInserting node " + value + " at index " + index);

        if(index > size) {      // Checking if the index is greater than the size
            System.out.println("\nIndex out of bound!");        // Displays error message
            return;     // Exits the method

        } else{
            Node prev = tail;       // Creating 'previous' pointer, pointing at tail
            Node curr = head;       // Creating 'current' pointer, pointing at head

            for (int i = 0; i < index; i++) {       // Iterating till the specific index
                // For each iterating, we're updating the current and previous point to its next node
                prev = curr;
                curr = curr.next;
            }
            // Once the 'current' pointer reached at the specified index, we're now updating the 'previous' and 'current' pointers
            prev.next = newNode;        // The 'previous' pointer is pointing towards the new node
            newNode.next = curr;        // The new node is pointing toward the current node
        }
        size++;       // Incrementing size by 1
    }

    public void display() {       // Method to display the circular linked list
        Node temp = head;       // Creating a temp node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);      // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");       // Displaying 'head' for reference
    }

    public static void main(String[] args) {       // Main method
        NodeAtSpecificPosition circularLinkedList = new NodeAtSpecificPosition();       // Creating an object of class type

        // Inserting node to the circular linked list
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        // Displaying the circular linked list
        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        // Calling the method to insert node at specific index
        circularLinkedList.specificPosition(2,7);

        // Displaying the updated circular linked list
        System.out.println("\nCircular linked list after inserting the node:");
        circularLinkedList.display();
    }
}