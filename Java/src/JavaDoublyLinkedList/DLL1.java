package JavaDoublyLinkedList;
// Create a class that implements a doubly linked list with operations such as insert, delete, search, and display (both forward and backward).
public class DLL1 {
    Node head;
    int size;
    DLL1(){
        this.size = 0;
    }
    public void insertFirst(int value){     // inset node
        Node newNode = new Node(value);

        if(head == null) {
            newNode.next = head;
            head = newNode;
            newNode.prev = null;
        }

    }
    public class Node{      // Nested class
        int value;      // Getting value
        Node next;      // Node next
        Node prev;      // Sering prev
        Node(int value){    // constructor
            this.value = value;     // initializing
        }
    }
}
