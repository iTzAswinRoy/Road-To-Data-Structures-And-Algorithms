package JavaCircularLinkedList;

// Find the k-th node from the end of a circular linked list.
public class FindKthNodeFromLast {       // Circular linked list class
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    FindKthNodeFromLast() {     // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {        // Creating a node class
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store the value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {      // Creating a parameter constructor by passing the value
            this.value = value;         // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {      // Method to insert node in the circular linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail as head
        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Setting the tail pointer to the new node
            tail = newNode;      // Assigning tail as new node
        }
        tail.next = head;       // Setting the tail pointing towards head
        size++;         // Incrementing size by 1
    }

    public void nodeFromLast(int k) {      // Method to find the Kth node from the end of the list
        Node temp = head;       // Creating a temp 'pointer', pointing at head
        Node kth = head;        // Also, creating a 'k' pointer which is pointing at head

        if(k > size) {      // Checking if the node to be found in within the rage
            System.out.println("\nIndex out of bound!");        // Error message
            return;
        }
        for (int i = 0; i < k; i++) {       // Iterating through the list
            temp = temp.next;       // Moving the pointer till it reaches th kth node
        }
        while (temp != head) {      // Iterating through the list

            temp = temp.next;       // Now, we're iterating 'temp' and 'kth' node consecutively
            kth = kth.next;
            // Where the 'kth' node is behind of the 'temp' pointer which eventuality makes the 'kth' pointer pointing from the end of the list
        }
        System.out.println("\nThe " + k + "th from the last of the circular linked list is " + kth.value + ".");        // Displaying the result
    }

    public void display() {      // Method to display the circular linked list
        Node temp = head;       // Creating a temp node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");         // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);      // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");     // Displaying 'head' for reference
    }

    public static void main(String[] args) {        // Main method
        FindKthNodeFromLast circularLinkedList = new FindKthNodeFromLast();       // Creating an object of class type

        // Inserting node to the circular linked list
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        // Displaying the circular linked list
        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        // Calling the method to find the kth element from the end of circular linked list
        circularLinkedList.nodeFromLast(2);
    }
}
