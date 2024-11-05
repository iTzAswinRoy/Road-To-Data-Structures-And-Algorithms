package JavaLinkedList;

// Reverse a singly linked list using stack.
public class LinkedListUsingStack {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int[] arr;      // Creating an array representing the stack
    private int top;        // Creating a 'top' index for stack operating

    LinkedListUsingStack() {         // Creating a default constructor
        this.size = 0;          // Initializing the size to 0
    }

    LinkedListUsingStack(int size) {        // Creating a parameter constructor by passing the value
        arr = new int[size];        // Initializing the size of the array
        top = -1;       // Initializing 'top' index for stack operating
    }

    public class Node {         // Creating a class for node
        // Creating instance variables for the class
        private int value;       // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {        // Creating a parameter constructor by passing the value
            // Initializing values to the instance variable
            this.value = value;
        }
    }

    public void insertFirst(int value) {        // Method to insert node at first in the linked list
        Node newNode = new Node(value);        // Creating a node by passing the value
        newNode.next = head;        // Assigning the new node's next pointer to 'head'
        head = newNode;         // Updating the head as new node

        // Checking if the tail is null. If it's null, then the list contains only one node
        if(tail == null) {
            tail = head;        // Updating the tail as head
        }
        size++;      // Incrementing size by 1
    }

    public void push(int num) {         // Method to insert element in the stack
        // Checking if the stack is full by comparing the size of the array
        if(top == arr.length) {
            System.out.println("Stack is full");
        } else {
            top++;      // Incrementing 'top' by 1
            arr[top] = num;     // Assigning the value in the stack
        }
    }

    public int pop() {      // Method to remove element at the top of the stack
        // Checking if the stack is empty
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;

        } else {
            // Removing the top element in the stack
            return arr[top--];      // Reducing the size by 1
        }
    }

    public void reverseLinkedListUsingStack() {        // Method to reverse the linked list using stack
        LinkedListUsingStack Stack = new LinkedListUsingStack(size);        // Creating a stack by passing the size
        Node temp = head;       // Creating a 'temp' node pointing at head

        for (int i = 0; i < size; i++) {
            Stack.push(temp.value);
            temp = temp.next;
        }
        temp = head;    // Reassigning the temp pointing to head. Otherwise, temp will be at tail and will show null
        for (int i = 0; i < size; i++) {
            temp.value = Stack.pop();   // Here it's replacing the values with the linked list and stack
            temp = temp.next;
        }
    }

    public void display() {      // Method to display the linked list
        Node temp = head;        // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");        // Displaying the current node
            temp = temp.next;           // Moving the pointer to the next node

            // Checking if the 'temp' reaches the end
            if (temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {
        LinkedListUsingStack linkedList = new LinkedListUsingStack();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        System.out.println("Original linked list:");
        linkedList.display();

        System.out.println("\nLinked list after reversing using stack:");
        linkedList.reverseLinkedListUsingStack();
        linkedList.display();
    }
}
