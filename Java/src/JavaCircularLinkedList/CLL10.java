package JavaCircularLinkedList;
// Implement a function to rotate a circular linked list to the right by k positions.
public class CLL10 {        // Class containing circular linked list properties
    int size;       // // Creating the size for circular linked list
    Node head;      // Creating a head node
    Node tail;      // Creating a tail node

    CLL10() {      // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public void insertNode (int value){         // Method to insert node in the circular linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail as head
        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Setting the tail pointer to the new node
            tail = newNode;         // Assigning tail as new node
        }
        tail.next = head;       // Setting the tail pointing towards head
        size++;       // Incrementing size by 1
    }

    public void rotateCircularLinkedList(int k) {
        Node curr = head;
        Node prev = null;
        System.out.println("\nRotating the circular linked list at "+k+"th position.");
        if(k > size || head == null){
            System.out.println("Index out of bound!");
            return;
        }
        for (int i = 1; i < k; i++) {
            prev = curr;
            curr = curr.next;
        }
        tail.next = head;
        head = curr;
        tail = prev;
    }

    public void display() {     // Method to display the circular linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.next;         // Moving the pointer to the next node

        } while (temp != head);     // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");       // Displaying 'head' for reference
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL10 circularLinkedList = new CLL10();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        circularLinkedList.rotateCircularLinkedList(3);
        circularLinkedList.display();
    }
}