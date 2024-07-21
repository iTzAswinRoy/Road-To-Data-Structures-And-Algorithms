package JavaCircularLinkedList;
// Implement a function to rotate a circular linked list to the right by k positions.
public class CLL10 {        // Class containing circular linked list properties
    Node head;      // Creating a head node
    Node tail;      // Creating a tail node
    int size;       // // Creating the size for circular linked list

    CLL10() {      //
        this.size = 0;
    }

    public void insertNode (int value){     //
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

    public void rotateCircularLinkedList(int k){
        Node curr = head;
        Node prev = null;
        System.out.println("\nRotating the circular linked list at "+k+"th position.");
        if(k > size || head == null){
            System.out.println("Index out of bound!");
            return;
        }
        for (int i = 1; i < k; i++) {
            prev = curr;
            curr = curr.next;
        }
        tail.next = head;
        head = curr;
        tail = prev;
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
        CLL10 circularLinkedList = new CLL10();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        circularLinkedList.rotateCircularLinkedList(3);
        circularLinkedList.display();
    }
}