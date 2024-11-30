package JavaLinkedList;

// Write a Java program to join two linked lists.
public class JoiningLinkedList {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    JoiningLinkedList() {        // Creating a default constructor
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

    public static JoiningLinkedList joinLinkedList(JoiningLinkedList LL1, JoiningLinkedList LL2) {          // Method to join linked list
        JoiningLinkedList combinedLinkedList = new JoiningLinkedList();         // Creating a new linked list
        Node temp1 = LL1.head;      // Creating a 'temp' node pointing at head of linked list 1

        // Iterating through the linked list
        for (int i = 0; i < LL1.size; i++) {
            combinedLinkedList.insertNode(temp1.value);         // Inserting nodes from the linked list 1 to the new linked list
            temp1 = temp1.next;         // Moving the 'temp' pointer to the next node
        }

        Node temp2 = LL2.head;          // Creating a 'temp' node pointing at head of linked list 2
        // Iterating through the linked list
        for (int i = 0; i < LL2.size; i++) {
            combinedLinkedList.insertNode(temp2.value);         // Inserting nodes from the linked list 2 to the new linked list
            temp2 = temp2.next;         // Moving the 'temp' pointer to the next node
        }
        return combinedLinkedList;          // Returning the new linked list
    }

    public void display() {         // Method to display the linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the pointer to the next node

            // Checking if the 'temp' reaches the end
            if (temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object of linked list 1
        JoiningLinkedList LL1 = new JoiningLinkedList();

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
        JoiningLinkedList LL2 = new JoiningLinkedList();

        // Calling the method to insert the node in the linked list 2
        LL2.insertNode(6);
        LL2.insertNode(7);
        LL2.insertNode(8);
        LL2.insertNode(9);
        LL2.insertNode(10);

        // Calling the method to display the linked list 2
        System.out.println("\nLinked list-2:");
        LL2.display();

        // Storing the joined the linked list by calling the join method
        JoiningLinkedList combinedList = joinLinkedList(LL1, LL2);

        // Displaying the joined linked list
        System.out.println("\nCombined linked list:");
        combinedList.display();
    }
}