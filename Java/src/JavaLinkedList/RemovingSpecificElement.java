package JavaLinkedList;

// Write a Java program to remove a specified element from a linked list.
public class RemovingSpecificElement {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    RemovingSpecificElement() {       // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {      // Creating a class for node
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
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

    public void removeElement(int element) {         // Method to remove a specified element from a linked list.
        Node previous = null;       // Creating a 'previous' node pointing at 'null'
        Node current = head;        // Creating a 'current' node pointing at 'head'

        for (int i = 0; i < size; i++) {        // Iterating through linked list
            // Checking if the element is present in the linked list
            if(current.value == element) {

                // Checking if the element to be removed is at head
                if (previous == null) {
                    previous = current.next;        // Removing the head node by changing the reference to the current's next node
                } else {
                    previous.next = current.next;       // This removes the elements in the middle of the linked list
                }
                size--;     // Decreasing the size by 1
                break;      // Exits the loop
            }
            previous = current;         // Updating the 'previous' pointer
            current = current.next;          // Moving the 'current' pointer to the next node
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
        RemovingSpecificElement linkedList = new RemovingSpecificElement();

        // Calling the method to insert the node in the linked list
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to remove a specified element from a linked list
        System.out.println("Linked list after removing a specific element:");
        linkedList.removeElement(2);
        linkedList.display();
    }
}