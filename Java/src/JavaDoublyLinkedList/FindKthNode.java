package JavaDoublyLinkedList;

// Find the kth node from the end of the doubly linked list.
public class FindKthNode {     // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store the size

    FindKthNode() {        // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }

    class Node {        // Creating a 'Node' class
        // Creating instance variables for the class
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node
        private int value;      // Creating an instance variable to store a value of the node

        Node(int value) {        // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {      // Method to insert node to the doubly linked list
        Node newNode = new Node(value);     // Creating a new node by passing a value

        if (tail == null) {     // Checking if the tail is null
            head = newNode;     // Assigning the head to new node
            tail = head;        // Updating the tail to head since there's only one node

        } else {
            tail.next = newNode;        // Updating the tail with the new node
            newNode.prev = tail;        // Assigning the previous pointer of the node to tail
            tail = newNode;     // Now updating the tail as new node
        }
        size++;     // Incrementing size by 1
    }

    public int kthNode(int k) {     // Method to find th kth node from the linked list
        System.out.println("\nFinding the " + k + "th node from the end:");

        Node first = head;      // Creating a 'first' variable pointing at the head
        Node second = head;     // Creating a 'second' variable pointing at the head

        if (k > size) {     // Checking if the element is within the size
            System.out.println("Index out of bound!");      // Displaying error message
        }
        // Moving the 'first' reference variable to the kth index
        for (int i = 0; i < k; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;     // Moving the 'first' reference variable to the end of the linked list
            second = second.next;       // Moving the 'second' reference variable from the start of the linked list till the 'first' reaches the end
        }
        return second.value;        // Returning the value of the 'second' reference variable
    }

    public void display() {     // Method to display the linked list
        Node temp = head;       // Creating a reference variable 'temp' pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through linked list
            System.out.print(temp.value + " -> ");      // Displaying the node
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }

        if (temp == null) {     // Checking if 'temp' is null
            System.out.println("END");       // Displaying 'END' for reference
        }
    }

    public static void main(String[] args) {         // Main method
        // Creating an object to store the doubly linked list
        FindKthNode doublyLinkedList = new FindKthNode();

        // Calling the method to insert the node in doubly linked list
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        // Displaying the doubly linked list
        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        // Calling the method to find the kth node
        System.out.println(doublyLinkedList.kthNode(2));
    }
}