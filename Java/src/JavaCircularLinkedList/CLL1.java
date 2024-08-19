package JavaCircularLinkedList;
// Given a circular linked list, determine if it contains a cycle and return the starting node of the cycle.
public class CLL1 {     // Creating a circular linked list class
    int size;       // Creating instance variable for size
    Node head;      // Creating head pointer
    Node tail;      // Creating tail pointer

    CLL1() {     // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public void insertNode(int value) {      // Method to insert node
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail is head
            tail.next = head;       // Referencing tail node pointing towards head in order to perform circular linked list

        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;       // Referencing the tail node pointing towards the new node
            tail = newNode;        // Assigning new node as tail
            tail.next = head;       // now the tail is pointing towards head
        }
        size++;     // Incrementing size by 1
    }

    public int firstNode() {        // Method to get the first node in the circular linked list
        return head.value;      // Returning the head node
    }

    public void display() {     // Method to display the circular linked list
        Node temp = head;       // Creating a temp node pointing at head

        do {       // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");      // Displaying the node's value
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);     // Condition keeps going until the pointer reaches th head node

        System.out.println("HEAD");     // Displaying 'head' for reference
    }

    class Node {        // Creating a node class
        int value;      // Creating an instance variable to contain a value for the node
        Node next;      // Creating a reference pointer for the node

        Node(int value) {       // Creating a parameterized constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public static void main(String[] args) {    // Main method
        CLL1 circularLinkedList = new CLL1();       // Creating an object of class type

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nStarting node of the cycle is "+circularLinkedList.firstNode());
    }
}
