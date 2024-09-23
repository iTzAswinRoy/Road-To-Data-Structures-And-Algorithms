package JavaDoublyLinkedList;

//Given a doubly linked list, remove all duplicate nodes.
public class DLL3 {     // Main class
    // Creating instance variables for the class
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type
    int size;       // Creating a variable to store size

    DLL3(){         // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }
    public void insertNode(int value){      // Method to insert node to the doubly linked list
        Node newNode = new Node(value);     // Creating a new node

        if(tail == null){       // Checking if the tail is null
            head = newNode;     // Assigning the head to new node
            tail = head;        // Updating the tail to head since theres only one node
        } else {
            tail.next = newNode;        // Updating the tail with the new node
            newNode.prev = tail;        // Assigning the previous pointer of the node to tail
            tail = newNode;         // Now updating the tail as new node
        }
        size++;         // Incrementing size by 1
    }

    public void sortNode(){     // Method to sort the doubly linked list
        Node temp = head;       // Creating a reference variable pointing at head
        // Using bubble sort to doubly linked list
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size -1 -i; j++) {
                if(temp.value > temp.next.value){       // Checking if the node is greater than the next node
                    // Here the swapping process takes place
                    int swap = temp.next.value;
                    temp.next.value = temp.value;
                    temp.value = swap;
                }
                temp = temp.next;       // For each iteration the temp is pointing towards the next node
            }
            temp = head;       // Reassigning the new head
        }
    }

    public DLL3 removeDuplicates() {    // Method to remove duplicate nodes in a doubly linked list
        DLL3 result = new DLL3();       // Creating an object to store the results
        Node temp = head;       // Creating a reference variable pointing at head
        result.insertNode(temp.value);      // Always first value is unique
        for (int i = 0; i < size-1; i++) {      // Iterating through the doubly linked list
            if(temp.value != temp.next.value){      // Checking if both the is not equal
                result.insertNode(temp.next.value);         // Calling the insert method to insert the node
            }
            temp = temp.next;       // Moving the temp 'pointer' to next node
        }
        return result;        // Retuning the doubly linked list with unique node
    }

    public void display() {     // Method to display the doubly linked list
        Node temp = head;       // Creating a 'temp' pointer pointing at head
        for (int i = 0; i < size; i++) {        // Iterating through the doubly linked list
            System.out.print(temp.value+" -> ");        // Displaying node for each iteration
            temp = temp.next;       // Moving the temp point to its next node
        }
        if (temp == null) {     // Checking if 'temp' is null
            System.out.println("END");      // Which means it reaches the end of the list
        }
    }

    class Node {        // Creating a 'Node' class
        // Creating instance variables for the class Node
        int value;
        Node next;
        Node prev;
        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DLL3 DoublyLinkedList = new DLL3();
        DoublyLinkedList.insertNode(10);
        DoublyLinkedList.insertNode(85);
        DoublyLinkedList.insertNode(25);
        DoublyLinkedList.insertNode(10);
        DoublyLinkedList.insertNode(99);
        DoublyLinkedList.insertNode(85);
        DoublyLinkedList.insertNode(25);
        DoublyLinkedList.insertNode(60);




        System.out.println("Original doubly linked list:");
        DoublyLinkedList.display();

        System.out.println("\nSorted doubly linked list:");
        DoublyLinkedList.sortNode();
        DoublyLinkedList.display();

        System.out.println("\nRemoving duplicate nodes:");
        DLL3 removedDuplicateNode = DoublyLinkedList.removeDuplicates();
        removedDuplicateNode.display();
    }
}
