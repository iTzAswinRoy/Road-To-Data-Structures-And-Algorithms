package JavaCircularLinkedList;

// Given a circular linked list, split it into two halves.
// If the list has an odd number of nodes, one half should have one more node than the other.
public class CLL7 {      // Circular linked list class
    private int size;       // Creating instance variable for size
    private Node head;      // Creating head pointer
    private Node tail;      // Creating tail pointer

    CLL7(){      // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public void insertNode(int value) {      // Method to insert node in the circular linked list
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
        size++;     // Incrementing size by 1
    }

    public void splittingCircularLinkedList(CLL7 mainList) {      // Method to split the list into half
        // Creating a separate list to store the nodes separated from the main list
        CLL7 list1 = new CLL7();
        CLL7 list2 = new CLL7();

        Node temp = mainList.head;       // Creating a 'temp' node pointing at head

        if (size % 2 == 0) {
            for (int i = 0; i < size / 2; i++) {

                list1.insertNode(temp.value);
                temp = temp.next;
            }
        } else {
            for (int i = 0; i <= size / 2; i++) {

                list1.insertNode(temp.value);
                temp = temp.next;
            }
        }
        do {
            list2.insertNode(temp.value);
            temp = temp.next;

        } while (temp != head);

        System.out.println("List-1:");
        list1.display();

        System.out.println("\nList-2:");
        list2.display();
    }

    public void display() {      // Method to display the circular linked list
        Node temp = head;       // Creating a temp node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");        // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);     // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");     // Displaying 'head' for reference
    }

    class Node {     // Creating a node class
        private int value;      // Creating an instance variable to store a value for the node
        private Node next;      // Creating a reference, pointing towards the next node

        Node(int value) {      // Creating a parameter constructor by passing the value
            this.value = value;      // Assigning the parameter value to the instance variable
        }
    }

    public static void main(String[] args) {        // Main method
        CLL7 circularLinkedList = new CLL7();               // Creating an object of class type

        // Inserting node to the circular linked list
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        // Displaying the circular linked list
        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        // Calling the method to split the linked list into half
        System.out.println("\nSplitting circular linked list!");
        circularLinkedList.splittingCircularLinkedList(circularLinkedList);
    }
}
