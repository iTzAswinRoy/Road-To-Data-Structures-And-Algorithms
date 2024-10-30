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

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            newNode.next = head;
            head = newNode;     // Assigning value to head
            tail = head;        // Updating tail as head
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertLast(int value) {     //
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void deleteFirst(){
        Node temp = head;
        head = temp.next;
        size--;
    }

    public void deleteLast() {
        Node current = head;
        Node previous = null;
        for (int i = 0; i < size-1; i++) {
            previous = current;
            current = current.next;
        }
        if(previous != null) {
            previous.next = null;
            tail = previous;
        }
        size--;
    }

    public void deleteNode(int index){
        if(index > size){
            System.out.println("Index out of bound!");
        }
        Node current = head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }
        if(previous!= null){
            previous.next = current.next;
        }
        size--;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
            if (temp == null){
                System.out.println("END");
            }
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the linked list
        WLL1 obj = new WLL1();

        // Calling the method to insert the node at first
        obj.insertLast(1);
        obj.insertLast(2);
        obj.insertLast(3);
        obj.insertLast(4);
        obj.insertLast(5);
        obj.insertLast(6);


        System.out.println("Linked list after appending the elements:");
        obj.display();


    }
}
