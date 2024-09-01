package PersonalCode.Aswin;

// Node class for the doubly linked list
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

// Doubly Linked List class
class DoublyLinkedList {
    Node head;
    Node tail;
    // Add a node at the front of the list
    public void addFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    // Add a node at the end of the list
    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove a node from the front of the list
    public void removeFront() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Remove a node from the end of the list
    public void removeEnd() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Print the list from the front to the end
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Print the list from the end to the front
    public void printListReverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFront(10);
        dll.addFront(20);
        dll.addEnd(30);
        dll.addEnd(40);

        System.out.println("List from front to end:");
        dll.printList();

        System.out.println("List from end to front:");
        dll.printListReverse();

        dll.removeFront();
        dll.removeEnd();

        System.out.println("List after removing front and end:");
        dll.printList();
        }
    }
