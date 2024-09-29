package JavaDoublyLinkedList;
// Create a class that implements a doubly linked list with operations such as insert, delete, search, and display (both forward and backward).
public class DLL1 {     // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store size

    DLL1() {       // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {     // Creating a class for node
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node

        Node(int value){        // Creating a parameter constructor by passing the value
            this.value = value;       // Assigning the parameter value to the instance variable
        }
    }

    public void insertFirst(int value) {     // Method to insert node at first in the doubly linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if(tail == null){
            head = newNode;     // Assigning value to head
            tail = head;        // updating tail as head
        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            head.prev = newNode;        // Setting the head previous pointer to the new node
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;     // Updating new node as head
        }
        size++;     // Incrementing size by 1
    }

    public void insertLast(int value){      // Method to insert node at last
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if(tail == null){
            insertFirst(value);     // Calling the insertFirst method again
        } else {
            //
            tail.next = newNode;//
            newNode.prev = tail;//
            tail = newNode;//
        }
        size++;//
    }

    public void deleteFirst(){      //
        if(head == null){//
            System.out.println("List is empty.");
            return;
        } else {
            //
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteLast(){       //
        if(head == null){       //
            System.out.println("List is empty.");
            return;
        } else {
            tail = tail .prev;
            tail.next = null;
        }
        size--;
    }

    public void searchNode(int index){      //
        if(index > size){
            System.out.println("\nIndex out of bound!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println("Node at index "+index+" is "+temp.value);
    }

    public void display() {     //
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("END");
        }
    }

    public void reverseDoublyLinkedList(){      //
        Node temp = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+"->");
            temp = temp.prev;
        }
        if(temp == null){
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        DLL1 DoublyLinkedList = new DLL1();

        DoublyLinkedList.insertFirst(1);
        DoublyLinkedList.insertFirst(2);
        DoublyLinkedList.insertFirst(3);
        DoublyLinkedList.insertFirst(4);
        DoublyLinkedList.insertFirst(5);

        System.out.println("Inserting Node at first");
        DoublyLinkedList.display();

        DoublyLinkedList.insertLast(10);
        DoublyLinkedList.insertLast(20);
        DoublyLinkedList.insertLast(30);
        DoublyLinkedList.insertLast(40);
        DoublyLinkedList.insertLast(50);

        System.out.println("\nInserting node at last");
        DoublyLinkedList.display();

        DoublyLinkedList.deleteFirst();
        System.out.println("\nDeleting Node at first");
        DoublyLinkedList.display();

        DoublyLinkedList.deleteLast();
        System.out.println("\nDeleting node at last");
        DoublyLinkedList.display();


        System.out.println("\nReversing doubly linked list:");
        DoublyLinkedList.reverseDoublyLinkedList();

        System.out.println("\nOriginal doubly linked list:");
        DoublyLinkedList.display();

        System.out.println("\nSearching Node:");
        DoublyLinkedList.searchNode(5);
    }
}


