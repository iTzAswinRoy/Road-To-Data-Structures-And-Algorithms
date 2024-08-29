package JavaBasics;

import java.util.Scanner;       // Importing scanner class

// Write a Java program to merge two sorted (ascending) linked lists in ascending order.
public class W207 {     // Creating a class which handles linked list
    Node head;      // Creating a reference for head
    Node tail;      // Creating a reference for tail
    int size;       // Creating a size

    static int count = 1;   // Initializing as static to increment the count correctly whenever the instances of the class is called
    int listCount;

    W207() {        // Creating a default constructor
        this.size = 0;       // Initializing the size to 0
        this.listCount = count++;       // Incrementing count by 1 whenever the object is created
    }

    public void insertLast(int data) {      // Method to insert node at last
        Node newNode = new Node(data);      // Creating a node by passing the value

        // Checking if the head is null. If it's null, then the list is empty
        if (head == null) {
            head = newNode;     // Creating a new head

        } else {        // If there is more than 1 node, then tail is updated
            tail.next = newNode;      // Assigning the tail pointer to new node
        }
        tail = newNode;     // Updating the tail
        size++;     // Incrementing the size by 1
    }

    public void insertNode() {        // Method to insert node in the linked list
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size of the Linked list " + listCount + ":");
        int size = in.nextInt();        // Getting size from the user

        System.out.println("Enter the values of linked list " + listCount + ":");
        for (int i = 0; i < size; i++) {        // Iterating through the linked list
            insertLast(in.nextInt());       // Inserting the node for each iteration in the linked list
        }
    }

    public void sortLinkedList() {      // Method to sort the linked list
        System.out.println("Sorted linked list " + listCount + ":");

        // Using bubble sort method to sort the linked list
        for (Node i = head; i != null ; i = i.next) {       // Iterating through the linked list

            for (Node j = head; j.next != null ; j = j.next) {      // Using nested for loop to iterate over the linked list

                if (j.value > j.next.value) {       // Checking if the current node is greater than the next node

                    // If it's true, then the swapping process takes place
                    int temp = j.value;
                    j.value = j.next.value;
                    j.next.value = temp;
                }
            }
        }
    }

    public static W207 mergeLinkedList(W207 list1, W207 list2) {        // Method to merge multiple linked list
        W207 mergeList = new W207();        // Creating a empty linked list to sore the merged list

        Node current1 = list1.head;        // Creating a current pointer of list 1 pointing at head
        Node current2 = list2.head;        // Creating a current pointer of list 2 pointing at head

        System.out.println("Merged the linked list in ascending order:");
        while (current1 !=  null && current2 != null) {      // Using while loop till both the pointers of the list reaches the end of the list

            if (current1.value <= current2.value) {
                mergeList.insertLast(current1.value);
                current1 = current1.next;

            } else {
                mergeList.insertLast(current2.value);
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            mergeList.insertLast(current1.value);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergeList.insertLast(current2.value);
            current2 = current2.next;
        }
        return mergeList;
    }

    public void display() {        // Method to display the linked list
        Node temp = head;       // Creating a temp node pointing at head

        while (temp != null) {      // Using while loop in order to print node till it reaches null
            System.out.print(temp.value + " -> ");      // Displaying the value of each node
            temp = temp.next;       // Moving the pointer to the next node
        }
        System.out.print("END\n");      // Displaying 'head' for reference
    }

    static class Node {       // Creating a node class
        int value;      // Creating an instance variable to store a value for the node
        Node next;      // Creating a reference, pointing towards the next node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object of class type
        W207 obj1 = new W207();
        W207 obj2 = new W207();

        // Inserting node to the linked list
        obj1.insertNode();
        obj2.insertNode();

        // Displaying the linked list 1
        System.out.println("Linked list 1: ");
        obj1.display();


        obj1.sortLinkedList();      // Sorting the linked list 1
        obj1.display();      // Displaying the sorted lined list 1
        System.out.println();

        // Displaying the linked list 2
        System.out.println("Linked list 2: ");
        obj2.display();

        obj2.sortLinkedList();      // Sorting the linked list 2
        obj2.display();       // Displaying the sorted lined list 2
        System.out.println();

        W207 result = W207.mergeLinkedList(obj1, obj2);         // Creating an object to store the merged lined list
        result.display();       // Calling the method to display the merged linked list
    }
}
