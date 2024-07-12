package JavaBasics;

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
        Node prevX = null;      // Creating a reference for index 1 which is pointing to head
        Node prevY = null;      // Creating a reference for index 1 which is pointing to head
        Node currX = head;
        Node currY = head;
        if (indexX == indexY){      // Checking if both indexes are pointing the same node
            System.out.println("The positions of the nodes are same, no swap needed.");
            return;     // Returns the error message
        }
        if(indexX < 0 || indexX > size){     // Checking if given index doesn't exceed the size of the linked list
            System.out.println("Index out of bound");   // Displays an error message
            return;     // Exits the condition
        }
        for (int i = 0; i < indexX; i++) {     // Iterating over the linked list
            prevX = currX;
            currX = currX.next;     // Moving the node X to the required index
        }
        for (int i = 0; i < indexY; i++) {     // Iterating over the linked list
            prevY = currY;
            currY = currY.next;     // Moving the node Y to the required index
        }
        // Here's the swapping the reference of the previous node takes place
        if (prevX != null) {    // Checking is the previous node of X contains a value
            prevX.next = currY;     // Swapping the reference of the previous X to current node of y
        } else {
            head = currY;   // If the previous is still null the nit means the index is at 0
        }
        if (prevY != null) {    // Checking is the previous node of Y contains a value
            prevY.next = currX;     // Swapping the reference of the previous Y to current node of X
        } else {
            head = currX;   // If the previous is still null the nit means the index is at 0
        }
        // Here's the swapping the reference of the current node takes place
        Node temp = currX.next;     // With the help of temporary variable the swapping process takes place
        currX.next = currY.next;      // Swapping the reference of the current node from X to y
        currY.next = temp;      // Node is swapped
        // Here the tail gets updated
        if (currX.next == null) {   // Checking if the current node of X is pointing towards null
            tail = currX;       // Setting the tail os current node of X
        } else if (currY.next == null) {    // Checking if the current node of Y is pointing towards null
            tail = currY;   // Setting the tail os current node of Y
        }
        System.out.println("Linked list after swapping:");     // Displaying the linked list after swapped
        display();
    }
    public void display(){      // Method to display the linked list
        Node temp = head;      // Creating a temp variable which store the head node
        while (temp != null) {      // Creating a loop until it reaches the end of the linked list
            System.out.print(temp.value + "->");     // Receiving the node
            temp = temp.next;   // Setting the temp referencing to next node
            if(temp == tail.next){      // Initializing the temp variable to the reference of the tail
                System.out.print("END\n");    // Giving a reference to the tail node
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
        System.out.println("Enter the index to be swapped:");
        int a = in.nextInt();   // Initializing the index to variable a
        int b = in.nextInt();   // Initializing the index to variable a
        obj.swapNode(a, b);     // Calling the swap method
    }
}