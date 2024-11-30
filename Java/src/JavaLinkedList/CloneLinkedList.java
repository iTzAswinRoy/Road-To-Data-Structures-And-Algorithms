package JavaLinkedList;
// Write a Java program to copy a linked list to another linked list.
public class CloneLinkedList {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    CloneLinkedList() {        // Creating a default constructor
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

    static CloneLinkedList copyLinkedList(CloneLinkedList linkedList) {         // Method to copy a linked list
        CloneLinkedList newLinkedList = new CloneLinkedList();         // Creating a linked to store a copy of it
        Node temp = linkedList.head;        // Creating a 'temp' node pointing at head of linked list

        // Iterating through the linked list
        for (int i = 0; i < linkedList.size; i++) {
            newLinkedList.insertNode(temp.value);       // Inserting nodes to the new linked list
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }
        return newLinkedList;       // Returning the new linked list
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

    public static void main(String[] args) {
        // Creating an object to store the linked list
        CloneLinkedList originalLinkedList = new CloneLinkedList();

        // Calling the method to insert the node in the linked list
        originalLinkedList.insertNode(1);
        originalLinkedList.insertNode(2);
        originalLinkedList.insertNode(3);
        originalLinkedList.insertNode(4);
        originalLinkedList.insertNode(5);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        originalLinkedList.display();

        // Storing the copy of the linked list by calling the copy method
        CloneLinkedList cloneLinkedList = CloneLinkedList.copyLinkedList(originalLinkedList);

        // Displaying the cloned linked list
        System.out.println("\nClone linked list:");
        cloneLinkedList.display();
    }
}