package W3Resource.JavaBasics;
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
    public void swapNode(int x, int y){     // Method to swap the two adjacent nodes
        Node nodeX = head;
        Node nodeY = head;
        if (x == y){
            System.out.println("The positions of the nodes are same, no swap needed.");
            return;
        }
        if(size < 1 || x >= size || y >= size || x < 0 || y < 0){
            System.out.println("Index out of bound");
            return;
        }
        for (int i = 0; i < x; i++) {
            nodeX = nodeX.next;
        }
        for (int i = 0; i < y; i++) {
            nodeY = nodeY.next;
        }
        int temp = nodeX.value;
        nodeX.value = nodeY.value;
        nodeY.value = temp;

    }
    public void display(){      // Method to display the linked list
        Node temp = head;      // Creating a temp variable which store the head node
        while (temp != null) {      // Creating a loop until it reaches the end of the linked list
            System.out.print(temp.value + "->");     // Receiving the node
            temp = temp.next;   // Setting the temp referencing to next node
            if(temp == tail.next){
                System.out.print("END\n\n");    // Giving a reference to the tail node
            }
        }
    }
    public static void main(String[] args) {    // Main method
        W180 obj = new W180();      // Creating an object ot call the methods
        obj.insertFirst(10);    // Initializing values to a node
        obj.insertFirst(50);
        obj.insertFirst(60);
        obj.insertFirst(70);
        obj.insertFirst(30);
        obj.insertFirst(40);
        obj.insertFirst(99);
        System.out.println("Linked list before swapping:");
        obj.display();  // Calling the display method
        obj.swapNode(0,4);    // Calling the swap method
        System.out.println("Linked list after swapping:");
        obj.display();  // Displaying the linked list after swapped
    }
}