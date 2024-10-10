package JavaDoublyLinkedList;

// Given a doubly linked list, determine if the list is a palindrome.
public class CheckPalindrome {     // Creating a class for doubly linked list
    // Creating instance variables for the class
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store the size

    CheckPalindrome() {        // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }

    class Node {        // Creating a 'Node' class
        // Creating instance variables for the class
        private Node prev;      // Creating a reference variable, pointing towards the previous node
        private Node next;      // Creating a reference variable, pointing towards the next node
        private int value;      // Creating an instance variable to store a value of the node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {         // Method to insert node to the doubly linked list
        Node newNode = new Node(value);     // Creating a new node by passing a value

        if (tail == null) {     // Checking if the tail is null
            head = newNode;     // Assigning the head to new node
            tail = head;        // Updating the tail to head since there's only one node

        } else {
            tail.next = newNode;        // Updating the tail with the new node
            newNode.prev = tail;        // Assigning the previous pointer of the node to tail
            tail = newNode;     // Now updating the tail as new node
        }
        size++;        // Incrementing size by 1
    }

    public void findPalindrome() {      // Method to find a palindrome
        boolean isSame = false;     // Creating a boolean variable to false
        Node left = head;       // Creating a 'left' variable pointing at the head
        Node right = tail;      // Creating a 'right' variable pointing at the tail

        if (size % 2 == 0) {        // Checking if the size of the linked list is even

            while (left != right) {        // Iterating through the linked list util the 'left' meets the 'right'
                if (left.value == right.value) {        // Checking if the 'left' pointer is same as the 'right' pointer

                    left = left.next;       // Moving the 'left' pointer forward next node
                    right = right.prev;     // Moving the 'right' pointer backward next node
                    isSame = true;      // Assigning it variable to 'true' if the pointers are same

                } else {
                    isSame = false;    // Assigning it variable to 'false' if the pointers are not same
                    break;     // Exits the loop
                }
            }

        } else {        // Odd sized linked list
            Node middle = head;     // Creating a 'middle' variable pointing at the middle of the lined list

            // Moving 'middle' pointer to the middle of the linked list
            for (int i = 0; i < size / 2; i++) {
                middle = middle.next;
            }

            while (left != middle && right != middle) {     // Iterating through the linked list util the 'left' meets the 'right'
                if (left.value == right.value) {        // Checking if the 'left' pointer is same as the 'right' pointer

                    left = left.next;       // Moving the 'left' pointer forward next node
                    right = right.prev;     // Moving the 'right' pointer backward next node
                    isSame = true;      // Assigning it variable to 'true' if the pointers are same

                } else {
                    isSame = false;       // Assigning it variable to 'false' if the pointers are not same
                    break;     // Exits the loop
                }
            }
        }
        if (isSame) {       // Checking if the 'isSame' is true
            System.out.println(isSame + "\nIt's a palindrome.");       // Displays the message
        } else {
            System.out.println(isSame + "\nIt's not a palindrome!");     // Displays error the message
        }
    }

    public void display() {     // Method to display the linked list
        Node temp = head;       // Creating a reference variable 'temp' pointing at head

        for (int i = 0; i < size; i++) {        // Iterating through linked list
            System.out.print(temp.value + " -> ");        // Displaying the node
            temp = temp.next;       // Moving the 'temp' pointer to the next node
        }

        if (temp == null) {     // Checking if 'temp' is null
            System.out.println("END");      // Displaying 'END' for reference
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object to store the doubly linked list
        CheckPalindrome doublyLinkedList = new CheckPalindrome();

        // Calling the method to insert the node in doubly linked list
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(1);

        // Displaying the doubly linked list
        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        // Calling the method to find the palindrome
        System.out.println("\nChecking if the linked list is palindrome:");
        doublyLinkedList.findPalindrome();
    }
}