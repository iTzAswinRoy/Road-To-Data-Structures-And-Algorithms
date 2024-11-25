package JavaLinkedList;

// Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class RetrievingFirstAndLastElement {
    // Creating instance variables for the class
    int size;       // Creating a variable to store size
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type

    RetrievingFirstAndLastElement() {       // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {      // Creating a class for node
        // Creating instance variables for the class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            // Initializing values to the instance variable
            this.value = value;
        }
    }

    public void insert(int value) {         // Method to insert node at first in the linked list
        Node newNode = new Node(value);      // Creating a node by passing the value

        // Checking if the tail is null, then the linked list is empty
        if(tail == null) {
            // Updating the head
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;         // Updating the head as new node
            tail = head;        // Updating the head as tail

        } else {
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Updating the tail as new node
        }
        size++;     // Incrementing size by 1
    }

    public int getFirst() {         // Creating a getter method to get the value of head
        return head.value;      // Returning the head value
    }

    public int getLast() {      // Creating a getter method to get the value of tail
        return tail.value;      // Returning the tail value
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

    public static void main(String[] args) {        // Main method
        // Creating an object to store the linked list
        RetrievingFirstAndLastElement linkedList = new RetrievingFirstAndLastElement();

        // Calling the method to insert the node in the linked list
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        // Calling the method to display the linked list
        System.out.println("Original linked List:");
        linkedList.display();

        // Calling the getter method to get the value of head and tail
        System.out.println("\nThe first element in the linked list is " + linkedList.getFirst());
        System.out.println("\nThe last element in the linked list is " + linkedList.getLast());
    }
}