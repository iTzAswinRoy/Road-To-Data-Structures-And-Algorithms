package JavaCircularLinkedList;
// Write a function to reverse a circular linked list.
public class CLL8 {         // Circular linked list class
    int size;       // Creating instance variable for size
    Node head;      // Creating head pointer
    Node tail;      // Creating tail pointer

    CLL8() {     // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public void insertNode(int value) {      // Method to insert node in the circular linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail ==  null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail as head

        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Setting the tail pointer to the new node
            tail = newNode;      // Assigning tail as new node
        }
        tail.next = head;       // Setting the tail pointing towards head
        size++;        // Incrementing size by 1
    }

    public void reverse() {      //
        if(head == null || head.next == head) {      //
            return;
        }
        Node prev = null;       //
        Node curr = head;       //
        Node originalHead = head;       //
        do{
            Node after = curr.next;     // Creating a node which helps transverse through the list
            curr.next = prev;       //
            prev = curr;        //
            curr = after;       //

        }  while (curr != head);        //
        head.next = prev;       //
        head = prev;        //
        tail = originalHead;
    }

    public void display() {      // Method to display the circular linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        do {         // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");        // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);     // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");       // Displaying 'head' for reference
    }

    class Node {        // Creating a node class
        int value;      // Creating an instance variable to store a value for the node
        Node next;      // Creating a reference, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;        // Assigning the parameter value to the instance variable
        }
    }

     public static void main(String[] args) {       // Main method
        CLL8 circularLinkedList = new CLL8();      // Creating an object of class type

        // Inserting node to the circular linked list
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        // Displaying the circular linked list
        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nReversed circular linked list:");
        circularLinkedList.reverse();       // Calling the method to reverse the circular linked list
        circularLinkedList.display();       // Displaying the reversed circular linked list
    }
}
