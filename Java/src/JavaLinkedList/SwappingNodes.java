package JavaLinkedList;

// Write a Java program that swaps two elements in a linked list.
public class SwappingNodes {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    SwappingNodes(){        // Creating a default constructor
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

    public void swapNodes(int index1, int index2) {         // Method to swap nodes in the linked list
        Node previous1 = null;          // Assigning a 'previous1' node pointing as null
        Node current1 = head;       // Creating a 'current1' node pointing at head

        // Iterating through the linked list till we reach the required index
        for (int i = 0; i < index1; i++) {
            // Moving the Previous and current pointer's
            previous1 = current1;
            current1 = current1.next;
        }

        Node prev2 = null;          // Assigning a 'previous2' node pointing as null
        Node current2 = head;       // Creating a 'current2' node pointing at head

        // Iterating through the linked list till we reach the required index
        for (int i = 0; i < index2; i++) {
            // Moving the Previous and current pointer's
            prev2 = current2;
            current2 = current2.next;
        }

        if (previous1 != null) {
            // Changing the previous 1 reference to current node 2
            previous1.next = current2;
        } else {
            // If previous is null, then updating the head
            head = current2;
        }

        if (prev2 != null) {
            // Changing the previous 2 reference to current node 1
            prev2.next = current1;
        } else {
            // If previous is null, then updating the head
            head = current1;
        }

        // Here the swapping process takes place
        Node temp = current1.next;
        current1.next = current2.next;
        current2.next = temp;
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
        // Creating an object to store the linked list
        SwappingNodes linkedList = new SwappingNodes();

        // Calling the method to insert the node in the linked list
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to swap elements in the linked list
        linkedList.swapNodes(0,4);

        // Displaying the linked list after swapping
        System.out.println("\nLinked list after swapping:");
        linkedList.display();
    }
}