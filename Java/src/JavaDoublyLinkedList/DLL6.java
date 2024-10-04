package JavaDoublyLinkedList;

// Rotate a doubly linked list by k nodes (where k can be positive or negative).
public class DLL6 {     // Creating a class for doubly linked list
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store the size

    DLL6() {        // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }

    class Node {        // Creating a 'Node' class
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node
        private int value;      // Creating an instance variable to store a value of the node

        Node(int value) {
            this.value = value;
        }
    }

    public void insertNode(int value) {     // Method to insert node to the doubly linked list
        Node newNode = new Node(value);     // Creating a new node by passing a value

        if(tail == null) {      // Checking if the tail is null
            head = newNode;     // Assigning the head to new node
            tail = head;        // Updating the tail to head since there's only one node

        } else {
            tail.next = newNode;        // Updating the tail with the new node
            newNode.prev = tail;        // Assigning the previous pointer of the node to tail
            tail = newNode;       // Now updating the tail as new node
        }
        size++;       // Incrementing size by 1
    }

    public void rotateDoublyLinkedList(int index) {
        System.out.println("\nRotating doubly linked list at index "+index);
        Node temp = head;

        if (index > size) {
            System.out.println("Index out of bound!");
            return;
        }

        for (int i = 0; i < index; i++) {
            head = head.next;
        }

        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        tail = temp;
        for (int i = 0; i < index; i++) {
            System.out.print(tail.value + " -> ");
            tail = tail.next;
        }
        System.out.println("END");
    }

    public void display() {
        Node temp = head;

        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        DLL6 doublyLinkedList = new DLL6();

        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        doublyLinkedList.rotateDoublyLinkedList(4);
    }
}