package JavaDoublyLinkedList;
// Implement a function to find the middle node of a doubly linked list.
public class DLL4 {     // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store the size

    DLL4() {       // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }

    class Node {        // Creating a 'Node' class
        // Creating instance variables for the class Node
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node

        Node(int value) {        // Creating a parameter constructor by passing the value
            this.value = value;         // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {      // Method to insert node to the doubly linked list
        Node newNode = new Node(value);     // Creating a new node by passing a value

        if (tail == null) {     // Checking if the tail is null
            head = newNode;     // Assigning the head to new node
            tail = head;        // Updating the tail to head since there's only one node

        } else {
            tail.next = newNode;        // Updating the tail with the new node
            newNode.prev = tail;        // Assigning the previous pointer of the node to tail
            tail = newNode;         // Now updating the tail as new node
        }
        size++;         // Incrementing size by 1
    }

    public void middleNode() {       // Method to insert node in the middle of the doubly linked list
        if(size % 2 == 0) {      // Checking if the size is even
            System.out.println("There's no middle node in the doubly linked list!");
            System.out.println("\nTry inserting another node to the doubly linked list to make the size even.");

        } else {
            Node temp = head;       // Creating a reference variable 'temp' pointing at head
            for (int i = 0; i < size; i++) {        // Iterating through the linked list

                if (i == size / 2) {        // Checking if the loop reaches the middle node
                    System.out.println("The middle node is " + temp.value);     // Displaying the middle node
                }
                temp = temp.next;       // Moving the 'tmp' pointer to the next node
            }
        }
    }

    public void display() {      // Method to display the doubly linked list
        Node temp = head;       // Creating a 'temp' pointer pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through the doubly linked list
            System.out.print(temp.value + " -> ");      // Displaying node for each iteration
            temp = temp.next;       // Moving the temp point to its next node
        }
        if (temp == null) {       // Checking if 'temp' is null, which means it reaches the end of the list
            System.out.println("END");      // Displaying 'END' for reference
        }
    }

    public static void main(String[] args) {        // Main method
        DLL4 doublyLinkedList = new DLL4();         // Creating an object of class type

        // Calling the method to insert the node in doubly linked list
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        // Displaying the doubly linked list
        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        System.out.println("\nFinding the middle node:");
        doublyLinkedList.middleNode();      // Calling the method to find the middle node
    }
}
