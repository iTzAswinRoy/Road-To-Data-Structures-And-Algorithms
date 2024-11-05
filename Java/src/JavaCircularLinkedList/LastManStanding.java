package JavaCircularLinkedList;

// Given n people standing in a circle and a number k, every kth person is eliminated until only one remains.
public class LastManStanding {     // Circular linked list class
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    LastManStanding() {     // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {      // Creating a Node class    // Creating instance variables for the class

        private int value;      // Creating an instance variable to store a value for the node
        private Node next;      // Creating a reference, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {      // Method to insert node in the circular linked list
        Node newNode = new Node(value);        // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail as head
            tail.next = head;       // Setting the tail pointing towards head

        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Setting the tail pointer to the new node
            tail = newNode;         // Assigning tail as new node
            tail.next = head;         // Setting the tail pointing towards head
        }
        size++;         // Incrementing size by 1
    }

    public void survivor(int k) {       //  Method to find the last man survivor
        Node curr = head;       // Creating 'current' pointing at head
        Node prev = tail;       // Creating 'previous' pointing at tail

        System.out.println("\nEliminating every " + k + "th person in the circle.");

        while (curr.next != curr) {       // This loop iterates till the list contains the last element

            for (int i = 1; i < k; i++) {        // Iterating till the given kth number
                // For each iterating, we're updating the current and previous point to its next node
                prev = curr;
                curr = curr.next;
            }
            // Once we reached the kth node, we're now the skipping the current bode by changing its reference pointer of 'current' and 'previous' to its next node
            prev.next = curr.next;       // Here, the previous pointer is pointing toward the current's next node
            curr = curr.next;       // Here, the current node is updated with its next node
        }
        // Once all the node are eliminated, the list remains ony one node
        head = curr;       // So, the head is updated to the 'current' pointer
        System.out.println("\nThe last survivor is " + curr.value);     // Displaying the value of last survivor
    }

    public void display() {      // Method to display the circular linked list
        Node temp = head;       // Creating a temp node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");        // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);      // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");      // Displaying 'head' for reference
    }

    public static void main(String[] args) {        // Main method
        LastManStanding circularLinkedList = new LastManStanding();       // Creating an object of class type

        // Inserting node to the circular linked list
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("People standing in a circle:");
        circularLinkedList.display();       // Displaying the circular linked list

         circularLinkedList.survivor(3);        // Calling the method to find the last survivor in the circle
    }
}