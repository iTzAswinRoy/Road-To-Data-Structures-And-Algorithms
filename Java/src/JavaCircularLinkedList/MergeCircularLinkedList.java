package JavaCircularLinkedList;

// Given two circular linked lists, merge them into one circular linked list, maintaining the order of the original lists.
public class MergeCircularLinkedList {        // Circular linked list class
    // Creating instance variables for the class
    int size;       // Creating a variable to store size
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;      // Crating a reference variable 'tail' of class Node type

    MergeCircularLinkedList() {       // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    class Node {        // Creating a node class
        int value;      // Creating an instance variable to store a value of the node
        Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;         // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {     // Method to insert node in the circular linked list
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
        size++;         // Incrementing size by 1
    }

    static MergeCircularLinkedList mergeList(MergeCircularLinkedList list1, MergeCircularLinkedList list2) {     // Method to merge the circular linked list
        MergeCircularLinkedList newList = new MergeCircularLinkedList();      // Creating an object to store the merged list

        // Creating a 'temp' reference, pointing at head for each list
        Node temp1 = list1.head;
        Node temp2 = list2.head;

        do{     // Using a nested do while loop to in order to insert each node from both the linked list to the new list
            newList.insertNode(temp1.value);      // Inserting node from list 1 to the new list for each iteration
            temp1 = temp1.next;       // Moving the pointer to the next node

            if (temp1 == list1.head) {        // Checking if all the nodes are finished inserting in the new list

                do{     // Now continuing the list 2 to insert node to the new list
                    newList.insertNode(temp2.value);       // Inserting node from list 2 to the new list for each iteration
                    temp2 = temp2.next;     // Moving the pointer to the next node

                } while (temp2 != list2.head);      // Condition keeps going until the pointer reaches the tail node for the list 2
            }
        } while (temp1 != list1.head);      // Condition keeps going until the pointer reaches the tail node for the list 1

        return newList;     // Returning the merged list from list 1 & 2
    }

    public void display() {         // Method to display the circular linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        do {        // Using do while loop in order to print node starting from head
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node

        } while (temp != head);     // Condition keeps going until the pointer reaches the tail node

        System.out.println("HEAD");        // Displaying 'head' for reference
    }

    public static void main(String[] args) {        // Main method
        // Creating an object of class type
        MergeCircularLinkedList circularLinkedList1 = new MergeCircularLinkedList();
        MergeCircularLinkedList circularLinkedList2 = new MergeCircularLinkedList();

        // Inserting node to the 1st circular linked list
        circularLinkedList1.insertNode(1);
        circularLinkedList1.insertNode(2);
        circularLinkedList1.insertNode(3);
        circularLinkedList1.insertNode(4);
        circularLinkedList1.insertNode(5);

        // Displaying the 1st circular linked list
        System.out.println("Circular linked list-1:");
        circularLinkedList1.display();

        // Inserting node to the 2nd circular linked list
        circularLinkedList2.insertNode(10);
        circularLinkedList2.insertNode(20);
        circularLinkedList2.insertNode(30);
        circularLinkedList2.insertNode(40);
        circularLinkedList2.insertNode(50);

        // Displaying the 2nd circular linked list
        System.out.println("\nCircular linked list-2:");
        circularLinkedList2.display();

        // Creating a new circular linked list to store the merged circular linked list of 1 and 2
        MergeCircularLinkedList mergedCircularLinkedList1 = mergeList(circularLinkedList1, circularLinkedList2);

        // Displaying the merged circular linked list
        System.out.println("\nMerged circular linked list:");
        mergedCircularLinkedList1.display();
    }
}