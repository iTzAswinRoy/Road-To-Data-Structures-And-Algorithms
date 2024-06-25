package W3Resource.JavaBasics;

import java.util.Scanner;

// Write a Java program to swap two adjacent nodes in a linked list.
public class W180 {     // Creating a class which handles linked list
    Node head;      // Creating a reference for head
    Node tail;      // Creating a reference for tail
    int size;      // Creating a size
    W180(){     // Creating a constructor to initialize the size of the linked list
        this.size = 0;   // Initializing the size of the linked list
    }
    public static class Node{   // Creating the Node class which handles data and its reference of the node
        int value;      // Creating a data which holds the value of the node
        Node next;      // Creating the reference of the next node
        Node(int value){       // Creating a constructor to initialize the vale of the node
            this.value = value;     // With the help of 'this' keyword, assigning the default value for Node from the user
        }
    }
    public void insertFirst(int data){      // Method to insert the node to the linked list
        Node newNode = new Node(data);        // Creating a node which stores a value
        newNode.next = head;     // Setting the new node referencing to head
        head = newNode;     // Assigning the head to new node
        if(tail == null){   // Checking if the tail is empty
            tail = head;     // If tail is empty, then head is tail
            return;     // This make sure's in any one node is inserted it'll automatically assign the head and tail for a single node
        }
        size++;     // Then the size will be incremented for each node is inserted
    }
    public void swapNode(int indexX, int indexY){     // Method to swap the two adjacent nodes
        Node nodeX = head;      // Creating a reference for index 1 which is pointing to head
        Node nodeY = head;      // Creating a reference for index 1 which is pointing to head
        if (indexX == indexY){      // Checking if both indexes are pointing the same node
            System.out.println("The positions of the nodes are same, no swap needed.");
            return;     // Returns the error message
        }
        if(size < 1 || indexX >= size || indexY >= size || indexX < 0 || indexY < 0){     // Checking if given index doesn't exceed the size of the linked list
            System.out.println("Index out of bound");   // Displays an error message
            return;     // Exits the condition
        }
        for (int i = 0; i < indexX; i++) {     // Iterating over the linked list
            nodeX = nodeX.next;     // Initializing the node X pointing to the required index
        }
        for (int i = 0; i < indexY; i++) {     // Iterating over the linked list
            nodeY = nodeY.next;     // Initializing the node Y pointing to the required index
        }
        int temp = nodeX.value;     // Creating a temporary variable to swap between the nodes
        nodeX.value = nodeY.value;    // Here the swapping process takes place
        nodeY.value = temp;     // Both the value of nodes are swapped
    }
    public void display(){      // Method to display the linked list
        Node temp = head;      // Creating a temp variable which store the head node
        while (temp != null) {      // Creating a loop until it reaches the end of the linked list
            System.out.print(temp.value + "->");     // Receiving the node
            temp = temp.next;   // Setting the temp referencing to next node
            if(temp == tail.next){      // Initializing the temp variable to the reference of the tail
                System.out.print("END\n\n");    // Giving a reference to the tail node
            }
        }
    }
    public static void main(String[] args) {    // Main method
        W180 obj = new W180();      // Creating an object ot call the methods
        Scanner in = new Scanner(System.in);    // Creating a Scanner object
        System.out.println("Enter the size of the linked list:");
        int LL_size = in.nextInt();     // Initializing the size of the linked list
        System.out.println("Enter the values of each node:");
        for (int i = 0; i < LL_size; i++) {     // Iterating over the linked list
            obj.insertFirst(in.nextInt());      // Initializing the value for each node in the linked list
        }
        System.out.println("Linked list before swapping:");
        obj.display();  // Calling the display method
        obj.swapNode(0,1);    // Calling the swap method
        System.out.println("Linked list after swapping:");
        obj.display();  // Displaying the linked list after swapped
    }
}