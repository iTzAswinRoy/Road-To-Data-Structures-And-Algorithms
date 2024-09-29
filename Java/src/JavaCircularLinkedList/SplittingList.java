package JavaCircularLinkedList;

// Given a circular linked list, split it into two halves.
// If the list has an odd number of nodes, one half should have one more node than the other.
public class SplittingList {      // Circular linked list class
    // Creating instance variables for the class
    private int size;       // Creating instance variable for size
    private Node head;      // Creating head pointer
    private Node tail;      // Creating tail pointer

    SplittingList(){      // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {     // Creating a node class
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {      // Creating a parameter constructor by passing the value
            this.value = value;      // Assigning the parameter value to the instance variable
        }
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

    public void splittingCircularLinkedList(SplittingList mainList) {      // Method to split the list into half
        // Creating a separate list to store the nodes separated from the main list
        SplittingList list1 = new SplittingList();
        SplittingList list2 = new SplittingList();

        Node main = mainList.head;       // Creating a 'main' node pointing at head

        if (size % 2 == 0) {        // checking if the size of the list is even
            for (int i = 0; i < size / 2; i++) {      // Iterating till the half the size of the list

                list1.insertNode(main.value);       // Inserting node to the list 1
                main = main.next;       // Moving the pointer to the next node
            }
        } else {        // If size is not even
            for (int i = 0; i <= size / 2; i++) {       // Iterating till the half the size of the list with one node extra

                list1.insertNode(main.value);       // Inserting node to the list 1
                main = main.next;       // Moving the pointer to the next node
            }
        }
        do {        // Using do while loop till 'main' pointer reaches its tail
            list2.insertNode(main.value);       // Inserting the remaining node from the main list to the list 2
            main = main.next;       // Moving the pointer to the next node

        } while (main != head);     // Checking if the pointer doesn't pass through head

        // Displaying the list 1
        System.out.println("List-1:");
        list1.display();

        // Displaying the list 2
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

    public static void main(String[] args) {        // Main method
        SplittingList circularLinkedList = new SplittingList();               // Creating an object of class type

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
