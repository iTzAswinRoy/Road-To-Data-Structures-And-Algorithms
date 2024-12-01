package JavaLinkedList;

// Write a Java program to compare two linked lists.
public class ComparingLinkedList {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    ComparingLinkedList() {        // Creating a default constructor
        this.size = 0;         // Initializing the size to 0
    }

    public class Node {         // Creating a 'Node' class
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {        // Creating a parameter constructor by passing the value
            // Initializing values to the instance variable
            this.value = value;
        }
    }

    public void insertNode(int value) {         // Method to insert node in the linked list
        Node newNode = new Node(value);         // Creating a node by passing the value

        // Checking if the tail is null, then the linked list is empty
        if (tail == null) {
            // Updating the head
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;         // Updating the head as new node
            tail = head;        // Updating the head as tail
        } else {
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Assigning the tail's next pointer to new node
        }
        size++;         // Incrementing size by 1
    }

    static boolean compareLinkedList(Node head1, Node head2) {
        if (head1 == null & head2 == null) {      // Base case: both lists are null, they are equal
            return true;
        }

        if (head1.value == head2.value) {       // Compare current nodes' values and recurse for next nodes
            return compareLinkedList(head1.next, head2.next);
        } else {
            return false;
        }
    }

    public void display() {         // Method to display the linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the 'temp' pointer to the next node

            // Checking if the 'temp' reaches the end
            if (temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {            // Main method
        // Creating an object of linked list 1
        ComparingLinkedList LL1 = new ComparingLinkedList();

        // Calling the method to insert the node in the linked list 1
        LL1.insertNode(1);
        LL1.insertNode(2);
        LL1.insertNode(3);
        LL1.insertNode(4);
        LL1.insertNode(5);

        // Calling the method to display the linked list 1
        System.out.println("Linked list-1:");
        LL1.display();

        // Creating an object of linked list 1
        ComparingLinkedList LL2 = new ComparingLinkedList();

        // Calling the method to insert the node in the linked list 2
        LL2.insertNode(1);
        LL2.insertNode(2);
        LL2.insertNode(3);
        LL2.insertNode(4);
        LL2.insertNode(55);

        // Calling the method to display the linked list 2
        System.out.println("\nLinked list-2:");
        LL2.display();

        // Calling the method to compare both the linked list
        if (compareLinkedList(LL1.head, LL2.head)) {
            System.out.println("\nBoth the linked list are same.");
        } else {
            System.out.println("\nBoth the linked list are different:");
        }
    }
}