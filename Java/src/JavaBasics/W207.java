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

        for (Node i = head; i != null ; i = i.next) {

            for (Node j = head; j.next != null ; j = j.next) {

                if (j.value > j.next.value) {
                    int temp = j.value;
                    j.value = j.next.value;
                    j.next.value = temp;
                }
            }
        }
    }

    public static W207 mergeLinkedList(W207 list1, W207 list2) {
        W207 mergeList = new W207();

        Node curr1 = list1.head;
        Node curr2 = list2.head;

        System.out.println("Merged the linked list in ascending order:");
        while (curr1 !=  null && curr2 != null) {

            if (curr1.value <= curr2.value) {
                mergeList.insertLast(curr1.value);
                curr1 = curr1.next;

            } else {
                mergeList.insertLast(curr2.value);
                curr2 = curr2.next;
            }
        }
        while (curr1 != null) {
            mergeList.insertLast(curr1.value);
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            mergeList.insertLast(curr2.value);
            curr2 = curr2.next;
        }
        return mergeList;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END\n");
    }
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        W207 obj1 = new W207();
        W207 obj2 = new W207();

        obj1.insertNode();
        obj2.insertNode();

        System.out.println("Linked list 1: ");
        obj1.display();

        obj1.sortLinkedList();
        obj1.display();
        System.out.println();

        System.out.println("Linked list 2: ");
        obj2.display();

        obj2.sortLinkedList();
        obj2.display();
        System.out.println();

        W207 result = W207.mergeLinkedList(obj1, obj2);
        result.display();
    }
}
