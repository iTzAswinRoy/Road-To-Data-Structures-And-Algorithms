package JavaDoublyLinkedList;

// Given two sorted doubly linked lists, merge them into a single sorted doubly linked list.
public class MergeSortedDoublyLinkedList {     // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store the size

    MergeSortedDoublyLinkedList() {        // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }

    class Node {        // Creating a 'Node' class
        // Creating instance variables for the class
        private Node next;      // Creating a reference variable, pointing towards the next node
        private Node prev;      // Creating a reference variable, pointing towards the previous node
        private int value;      // Creating an instance variable to store a value of the node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
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
            tail = newNode;      // Now updating the tail as new node
        }
        size++;     // Incrementing size by 1
    }

    public void sortNode() {        // Method to sort the node in the doubly linked list
        Node temp = head;       // Creating a reference variable 'temp' pointing at head

        // Using bubble sort to doubly linked list
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {        // Reducing the size of the list for each iteration

                // Checking if the node is greater than the next node
                if (temp.value > temp.next.value) {

                    // Here the swapping process takes place
                    int swap = temp.next.value;
                    temp.next.value = temp.value;
                    temp.value = swap;
                }
                temp = temp.next;       // Moving the 'tmp' pointer to the next node
            }
            temp = head;        // Reassigning the new head
        }
    }

    static MergeSortedDoublyLinkedList mergingLinkedList(MergeSortedDoublyLinkedList list1, MergeSortedDoublyLinkedList list2) {     // Method to merge a double linked list
        MergeSortedDoublyLinkedList newDoublyLinkedList = new MergeSortedDoublyLinkedList();      // Creating a new list to store the merged linked list

        Node temp1 = list1.head;        // Creating a reference variable 'temp1' pointing at head for list 1
        Node temp2 = list2.head;        // Creating a reference variable 'temp2' pointing at head for list 2

        for (int i = 0; i < list1.size; i++) {      // Iterating through list - 1
            newDoublyLinkedList.insertNode(temp1.value);        // Inserting the node from list-1 to the new list
            temp1 = temp1.next;      // Moving the 'tmp' pointer to the next node
        }

        for (int i = 0; i < list2.size; i++) {      // Iterating through list - 1
            newDoublyLinkedList.insertNode(temp2.value);        // Inserting the node from list-1 to the new list
            temp2 = temp2.next;     // Moving the 'tmp' pointer to the next node
        }
        return newDoublyLinkedList;     // Returning the merged lit
    }

    public void display() {     // Method to display the list
        Node temp = head;       // Creating a reference variable 'temp' pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through linked list
            System.out.print(temp.value + " -> ");      // Displaying the node
            temp = temp.next;        // Moving the 'temp' pointer to the next node
        }

        if (temp == null) {     // Checking if 'temp' is null
            System.out.println("END");      // Displaying 'END' for reference
        }
    }
    public static void main(String[] args) {        // Main method
        // Creating an object to store the doubly linked list
        MergeSortedDoublyLinkedList doublyLinkedList1 = new MergeSortedDoublyLinkedList();
        MergeSortedDoublyLinkedList doublyLinkedList2 = new MergeSortedDoublyLinkedList();

        // Calling the method to insert the node in doubly linked list
        doublyLinkedList1.insertNode(65);
        doublyLinkedList1.insertNode(21);
        doublyLinkedList1.insertNode(36);
        doublyLinkedList1.insertNode(99);
        doublyLinkedList1.insertNode(10);

        // Displaying the doubly linked list 1
        System.out.println("Doubly linked list-1:");
        doublyLinkedList1.display();

        System.out.println("Sorting doubly linked list-1:");
        doublyLinkedList1.sortNode();       // Calling the method to sort the doubly linked list
        doublyLinkedList1.display();        // Displaying the sorted doubly linked list

        // Calling the method to insert the node in doubly linked list
        doublyLinkedList2.insertNode(89);
        doublyLinkedList2.insertNode(70);
        doublyLinkedList2.insertNode(45);
        doublyLinkedList2.insertNode(85);
        doublyLinkedList2.insertNode(50);

        // Displaying the doubly linked list 1
        System.out.println("\nDoubly linked list-2:");
        doublyLinkedList2.display();

        System.out.println("Sorting doubly linked list-1:");
        doublyLinkedList2.sortNode();       // Calling the method to sort the doubly linked list
        doublyLinkedList2.display();        // Displaying the sorted doubly linked list

        // Creating a new doubly linked list to store the merged list
        MergeSortedDoublyLinkedList result = mergingLinkedList(doublyLinkedList1, doublyLinkedList2);

        // Displaying the merged doubly lined list
        System.out.println("\nMerged doubly linked list:");
        result.display();

        System.out.println("\nSorting merged doubly linked list:");
        result.sortNode();      // Calling the method to store the merged doubly linked list
        result.display();       // Displaying the sorted doubly linked list
    }
}
