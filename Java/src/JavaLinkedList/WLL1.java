package JavaLinkedList;

// Write a Java program to append the specified element to the end of a linked list.
public class WLL1 {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    public WLL1() {      // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public class Node {     // Creating a class for node
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        public Node(int value) {        // Creating a parameter constructor by passing the value
            this.value = value;         // Initializing values to the instance variable
        }
    }

    public void insertFirst(int value) {        // Method to insert node at first in the doubly linked list
        Node newNode = new Node(value);         // Creating a node by passing the value
        newNode.next = head;
        head = newNode;

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {        // Method to insert node at last
        // Checking if the tail is not assigned which means linked list is empty
        if(tail== null){
            insertFirst(value);
        } else{
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
        } else {
            head = head.next;
        }
    }

    // Method to delete the last node using the tail pointer
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        // Traverse to the second-last node
        Node current = head;

        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void deleteNode(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds!");
            return;
        }

        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        Node current = head;

        // If deleting the head node
        if (index == 0) {
            head = head.next;
        } else {
            // Traverse to the node just before the one to delete
            Node previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            // Update the next pointer to skip over the node to delete
            previous.next = current.next;
        }
        size--;
    }

    public void display() {      // Method to display the linked list
        Node temp = head;        // Creating a 'temp' node pointing at head

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;

            if (temp == null) {
                System.out.println("END");
            }
        }
    }

    public static void main(String[] args) {        // Main method
        WLL1 list = new WLL1();

        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.insertFirst(5);
        list.display(); // Output: 5 -> 10 -> 20 -> 30 -> null

        list.deleteFirst();
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.deleteLast();
        list.display(); // Output: 10 -> 20 -> null

        list.deleteNode(20);
        list.display(); // Output: 10 -> null

        list.deleteNode(50); // Node with value 50 not found.
    }
}
