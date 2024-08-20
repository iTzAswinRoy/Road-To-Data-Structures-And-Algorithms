package JavaCircularLinkedList;

// Write a function that calculates the length of a circular linked list.
public class CLL2 {     // Circular linked list class
    Node head;      // Creating instance variable for size
    Node tail;      // Creating head pointer
    int size;       // Creating tail pointer

    CLL2() {        // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public void insertNode(int value) {     // Method to insert node
        Node newNode = new Node(value);      // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail as head
            tail.next = head;       // Setting the tail pointing towards head

        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;       // Setting the tail pointer to the new node
            tail = newNode;      // Assigning tail as new node
            tail.next = head;       // Setting the tail pointing towards head
        }
        size++;     // Incrementing size by 1
    }

    public void display() {     // Method to display the circular linked list
        Node temp = head;       // Creating a temp node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);     // Condition keeps going until the pointer reaches th head node

        System.out.println("HEAD");         // Displaying 'head' for reference
    }

    class Node {        // Creating a node class
        int value;      // Creating an instance variable to store a value for the node
        Node next;      // Creating a reference pointer for the node

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL2 circularLinkedList = new CLL2();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nLength of the circular linked list is " + circularLinkedList.size);
    }
}
