package JavaLinkedList;

//Write a Java program to insert elements into the linked list at the first and last positions
public class InsertNodes {
    int size;       // Creating a variable to store size
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type

    InsertNodes() {        // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {         // Creating a class for node
        // Creating instance variables for the class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Initializing values to the instance variable
        }
    }

    public void insertFirst(int value) {        // Method to insert node at first in the linked list
        Node newNode = new Node(value);         // Creating a node by passing the value
        newNode.next = head;        // Assigning the new node's next pointer to 'head'
        head = newNode;         // Updating the head as new node

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            tail = head;        // Updating the head as tail
        }
        size++;       // Incrementing size by 1
    }

    public void insertLast(int value) {         // Method to insert node at last in the linked list
        // Checking if the list is empty
        if (tail == null) {
            insertFirst(value);     // Calling the insert first method

        } else {
            Node newNode = new Node(value);         // Creating a node by passing the value

            tail.next = newNode;        // Assigning the tail next pointer to new node
            tail = newNode;         // Updating the new node as tail
            size++;       // Incrementing size by 1
        }
    }

    public void display() {         // Method to display the linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the pointer to the next node

            // Checking if the 'temp' reaches the end
            if(temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {
        // Creating an object to store the linked list
        InsertNodes linkedList = new InsertNodes();

        // Calling the method to insert node at first in the linked list
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        // Calling the method to display the linked list
        System.out.println("Adding elements in the front of the linked list:");
        linkedList.display();

        // Calling the method to insert node at last in the linked list
        linkedList.insertLast(10);
        linkedList.insertLast(20);
        linkedList.insertLast(30);
        linkedList.insertLast(40);
        linkedList.insertLast(50);

        // Calling the method to display the linked list
        System.out.println("\nAdding elements at the end of the linked list:");
        linkedList.display();
    }
}