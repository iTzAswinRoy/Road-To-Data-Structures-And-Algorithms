package JavaDoublyLinkedList;

// Given a doubly linked list, determine if the list is a palindrome.
public class DLL8 {     // Creating a class for doubly linked list
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type
    private int size;       // Creating a variable to store the size

    DLL8() {        // Creating a default constructor
        this.size = 0;      // Initializing size to the instance variable
    }

    class Node {        // Creating a 'Node' class
        private Node prev;      // Creating a reference variable, pointing towards the previous node
        private Node next;      // Creating a reference variable, pointing towards the next node
        private int value;      // Creating an instance variable to store a value of the node

        Node(int value) {       // Creating a parameter constructor by passing the value
            this.value = value;     // Assigning the parameter value to the instance variable
        }
    }

    public void insertNode(int value) {         // Method to insert node to the doubly linked list
        Node newNode = new Node(value);     // Creating a new node by passing a value

        if (tail == null) {
            head = newNode;
            tail = head;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void findPalindrome() {
        Node left = head;
        Node right = tail;
        boolean isSame = false;

        if (size % 2 == 0) {
            while (left != right && right != left) {
                if (left.value == right.value) {

                    left = left.next;
                    right = right.prev;
                    isSame = true;

                } else {
                    System.out.println("\nIt's not a palindrome!");
                    return;
                }
            }

        } else {
            Node middle = head;

            for (int i = 0; i < size / 2; i++) {
                middle = middle.next;
            }

            while (left != middle && right != middle){
                if (left.value == right.value) {

                    left = left.next;
                    right = right.prev;
                    isSame = true;

                } else {
                    System.out.println("\nIt's not a palindrome!");
                    return;
                }
            }
        }
        if (isSame) {
            System.out.println("\nIt's a palindrome.");
        }
    }
    public void display() {
        Node temp = head;

        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        DLL8 doublyLinkedList = new DLL8();
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(1);

        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        System.out.println("\nChecking if the linked list is palindrome:");
        doublyLinkedList.findPalindrome();
    }
}