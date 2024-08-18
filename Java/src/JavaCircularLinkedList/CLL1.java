package JavaCircularLinkedList;
// Given a circular linked list, determine if it contains a cycle and return the starting node of the cycle.
public class CLL1 {     // Circular linked list class
    Node head;
    Node tail;
    int size;

    CLL1(){
        this.size = 0;
    }

    public void insertNode(int value){      //
        Node newNode = new Node(value);     //

        if(tail == null){       //
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

    public int firstNode(){
        return head.value;
    }

    public void display(){
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

        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL1 circularLinkedList = new CLL1();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nStarting node of the cycle is "+circularLinkedList.firstNode());
    }
}
