package JavaBasics;
import java.util.Scanner;
// Write a Java program to delete a specified node in the middle of a singly linked list.
public class w175{      // Creating a class which handles linked list
    Node head;      // Creating a reference for head
    Node tail;      // Creating a reference for tail
    int size;       // Creating a size
    w175(){     // Creating a constructor to initialize the size of the linked list
        this.size = 0;     // Initializing the size of the linked list
    }
    public class Node{      // Creating the Node class which handles data and its reference of the node
        int data;       // Creating a data which holds the value of the node
        Node next;      // Creating the reference of the next node
        Node(int data){     // Creating a constructor to initialize the value of the node
            this.data = data;      // With the help of 'this' keyword, assigning the default value for Node from the user
        }
    }
    public void insertFirst(int value){     // Method to insert the node to the linked list
        Node newNode = new Node(value);     // Creating a node which stores a value
        newNode.next = head;    // Setting the new node referencing to head
        head = newNode;     // Assigning the head to new node
        if(tail == null){       // Checking if the tail is empty
            tail = head;        // If tail is empty, then head is tail
            return;     // This make sure's in any one node is inserted it'll automatically assign the head and tail for a single node
        }
        size++;     // Then the size will be incremented for each node is inserted
    }
    public void deleteIndex(int index){     // Method to delete a specified node
        if(index < 0 || index > size){      // Using a condition if the given index exceeds the size of the linked list
            System.out.println("Index out of bound");
        }
        Node current = head;    // Creating a current node which is assigned to head
        Node previous = current.next;     // Creating a previous node which contains the reference of the current's next node
        for (int i = 0; i < index; i++) {      // Iteration over the linked list until it reaches the specific index
            previous = current;     // Moving the previous node to current
            current = current.next;     // Moving the current node reference to next node
            }
        previous.next = current.next;   // Once the current and previous reference are set to the required index, now we're assigning the reference of the previous to the reference of the current which automatically  deletes the current node and reference to the next node
        size--;     // Incrementing the size by 1
    }
    public void display(){     // Method to display the linked list
        Node temp = head;       // Creating a temp variable which store the head node
        while(temp != null) {      // Creating a loop until it reaches the end of the linked list
            System.out.print(temp.data + "->");     // Receiving the node
            temp = temp.next;   // Setting the temp referencing to next node
        }
        if(temp == tail.next){
            System.out.print("END\n");    // Giving a reference to the tail node
        }
    }
    public static void main(String[] args) {    // Main method
        Scanner in = new Scanner(System.in);    // Creating a Scanner object
        w175 obj = new w175();      // Creating an object ot call the methods
        System.out.println("Enter the size of the PersonalCode.Aswin.LinkedList:");
        int LL_size = in.nextInt();     // Assigning the size of the linked list
        System.out.println("Enter the values of each Node:");
        for (int i = 0; i < LL_size; i++) {     // Iterating over the linked list
            obj.insertFirst(in.nextInt());      // Inserting value's to the node with the help of the insert method
        }
        System.out.println("Linked list after inserting node:");
        obj.display();      // Calling the method to display the linked list
        System.out.println("Enter the index to be deleted:");
        int indexToBeDeleted = in.nextInt();    // Enter ing the index of the node to be deleted
        System.out.println("After deleting index: "+indexToBeDeleted);
        obj.deleteIndex(indexToBeDeleted);      // Calling the delete method the remove the specific noe
        obj.display();      // Calling the method to display the linked list
        in.close();     // Closing scanner
    }
}