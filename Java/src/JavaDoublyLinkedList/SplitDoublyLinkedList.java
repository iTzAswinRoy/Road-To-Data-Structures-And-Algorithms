package JavaDoublyLinkedList;

// Split a doubly linked list into two equal halves. If the list has an odd number of nodes, the first half should have one more node than the second.
public class SplitDoublyLinkedList {        // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store the size

    SplitDoublyLinkedList() {       // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }

    class Node {        // Creating a class for doubly linked list
        // Creating instance variables for the class
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node
        private int value;      // Creating an instance variable to store a value of the node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {     // Method to insert node to the doubly linked list
        Node newNode = new Node(value);     // Creating a new node by passing a value

        if (tail == null) {     // Checking if the tail is null
            head = newNode;     // Assigning the head to new node
            tail = head;        // Updating the tail to head since there's only one node

        } else {
            tail.next = newNode;        // Updating the tail with the new node
            newNode.prev = tail;        // Assigning the previous pointer of the node to tail
            tail = newNode;         // Now updating the tail as new node
        }
        size++;     // Incrementing size by 1
    }

    public void split() {       // Method to split the doubly linked list
        // Creating a separate doubly linked list
        SplitDoublyLinkedList list1 = new SplitDoublyLinkedList();
        SplitDoublyLinkedList list2 = new SplitDoublyLinkedList();

        Node temp = head;       // Creating a reference variable 'temp' pointing at the head

        if (size % 2 == 0) {        // Checking if the size fo the linked list is even
            for (int i = 0; i < size / 2; i++) {        // Iterating till the middle of the linked list
                list1.insertNode(temp.value);       // Inserting the node to the first linked list
                temp = temp.next;       // Moving the linked list to the next node
            }

        } else {        // Odd linked list
            for (int i = 0; i <= size / 2; i++) {       // Iterating till the middle of the linked list
                list1.insertNode(temp.value);       // Inserting the node to the first linked list
                temp = temp.next;       // Moving the 'temp' pointer to the next node
            }
        }

        // Inserting the remaking nodes to the second linked list
        while (temp != null) {
            list2.insertNode(temp.value);
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }

        // Displaying the first half of the doubly linked list
        System.out.println("First half:");
        list1.display();

        // Displaying the second half of the doubly linked list
        System.out.println("\nSecond half:");
        list2.display();
    }

    public void display() {     // Method to display the linked list
        Node temp = head;       // Creating a reference variable 'temp' pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through linked list
            System.out.print(temp.value + " -> ");       // Displaying the node
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }

        if (temp == null) {      // Checking if 'temp' is null
            System.out.println("END");      // Displaying 'END' for reference
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the doubly linked list
        SplitDoublyLinkedList doublyLinkedList = new SplitDoublyLinkedList();

        // Calling the method to insert the node in doubly linked list
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        // Displaying the doubly linked list
        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        // Calling the method to split the doubly linked list
        System.out.println("\nSplitting the the doubly linked list:");
        doublyLinkedList.split();
    }
}
