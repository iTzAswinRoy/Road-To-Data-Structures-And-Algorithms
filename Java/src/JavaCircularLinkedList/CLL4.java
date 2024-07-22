package JavaCircularLinkedList;
// Write a function to insert a node into a circular linked list at a specified position.
public class CLL4 {     //
    Node head;
    Node tail;
    int size;

    CLL4() {      //
        this.size = 0;
    }

    public void insertNode(int value) {     //
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
    public void nodeAtSpecificPosition(int index, int value) {      //
        Node newNode = new Node(value);
        System.out.println("\nInserting node "+value+" at index "+index);
        if(index > size){
            System.out.println("\nIndex out of bound!");
            return;
        } else{
            Node prev = tail;
            Node curr = head;
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = newNode;
            newNode.next = curr;
        }
        size++;
    }
    public void display() {     //
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        } while (temp != head);

        System.out.println("HEAD");
    }

    class Node {      //
        int value;
        Node next;

        Node(int value) {       //
            this.value = value;
        }
    }

    public static void main(String[] args) {       //
        CLL4 circularLinkedList = new CLL4();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        circularLinkedList.nodeAtSpecificPosition(2,7);

        System.out.println("\nCircular linked list after inserting the node:");
        circularLinkedList.display();
    }
}