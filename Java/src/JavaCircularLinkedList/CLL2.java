package JavaCircularLinkedList;

// Write a function that calculates the length of a circular linked list.
public class CLL2 {     // Circular linked list class
    Node head;
    Node tail;
    int size;

    CLL2() {
        this.size = 0;
    }

    public void insertNode(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            head = newNode;
            tail = head;
            tail.next = head;

        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        } while (temp != head);

        System.out.println("HEAD");
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL2 circularLinkedList = new CLL2();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nLength of the circular linked list is " + circularLinkedList.size);
    }
}
