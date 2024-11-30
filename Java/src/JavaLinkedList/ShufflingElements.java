package JavaLinkedList;

import java.util.ArrayList;         // Importing array list class
import java.util.Random;        // Importing random class

// Write a Java program to shuffle elements in a linked list.
public class ShufflingElements {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    ShufflingElements() {        // Creating a default constructor
        this.size = 0;         // Initializing the size to 0
    }

    public class Node {         // Creating a 'Node' class
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {        // Creating a parameter constructor by passing the value
            // Initializing values to the instance variable
            this.value = value;
        }
    }

    public void insertNode(int value) {         // Method to insert node in the linked list
        Node newNode = new Node(value);         // Creating a node by passing the value

        // Checking if the tail is null, then the linked list is empty
        if (tail == null) {
            // Updating the head
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;         // Updating the head as new node
            tail = head;        // Updating the head as tail
        } else {
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Assigning the tail's next pointer to new node
        }
        size++;         // Incrementing size by 1
    }

    public ArrayList<Integer> convertToArrayList() {        // Method to convert the linked list into array list
        ArrayList<Integer> arrayList = new ArrayList<>();        // Creating an array list
        Node temp = head;       // Creating a 'temp' node pointing at head

        // Iterating through the linked list
        for (int i = 0; i < size; i++) {
            arrayList.add(temp.value);      // Adding node to the array list for each iteration
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }
        return arrayList;       // Returning the array list
    }

    public void shuffleElements(ArrayList<Integer> arrayList) {         // Method to shuffle elements in the linked list
        Random random = new Random();       // Creating an object from random class

        // Iterating through the array list
        for (int i = 0; i < arrayList.size() ; i++) {
            int randomInt = random.nextInt(i + 1);      // This provides random number between 0 and 'i'.

            // Here we're swapping the random numbers using the array list
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(randomInt));
            arrayList.set(randomInt, temp);
        }

        Node temp = head;       // Creating a 'temp' node pointing at head

        // Iterating through the array list
        for (int i = 0; i < arrayList.size(); i++) {
            // Now we're updating the linked list
            temp.value = arrayList.get(i);
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }
    }

    public void display() {         // Method to display the linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the 'temp' pointer to the next node

            // Checking if the 'temp' reaches the end
            if (temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {
        // Creating an object to store the linked list
        ShufflingElements linkedList = new ShufflingElements();

        // Calling the method to insert the node in the linked list
        linkedList.insertNode(10);
        linkedList.insertNode(20);
        linkedList.insertNode(30);
        linkedList.insertNode(40);
        linkedList.insertNode(50);

        // Calling the method to display the linked list
        System.out.println("Original linked list:");
        linkedList.display();

        // Calling the method to convert the linked list into array list
        ArrayList<Integer> arrayList = linkedList.convertToArrayList();
        System.out.println("\nConverting linked list to array list:\n" + arrayList);

        // Calling the method to shuffle elements in the linked list
        linkedList.shuffleElements(arrayList);

        // Displaying the linked list after shuffling
        System.out.println("\nShuffling the linked list:");
        linkedList.display();
    }
}