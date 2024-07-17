package JavaCircularLinkedList;
// Implement a function to delete a node from a circular linked list.
public class CLL5 {
    Node head;
    Node tail;
    int size;

    CLL5() {
        this.size = 0;
    }

    public void insertNode(int value){
        Node newNode = new Node(value);
        if(tail == null){
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

    public void deleteFist(){
        Node temp = head;
        head = head.next;
        tail.next = head;
        size--;
    }

    public void deleteLast(){
        Node curr = head;
        Node prev = tail;
        do {
           prev = curr;
           curr = curr.next;
        } while ( curr.next != head);
        prev.next = head;
        tail = prev;
        size--;
    }
    public void deleteAtSpecificIndex(int index){
        Node curr = head;
        Node prev = tail;
        System.out.println("\nRemoving node at specific index:");
        if(index > size){
            System.out.println("Index out of bound!");
            return;
        } else {
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            System.out.println("Node "+curr.value+" is removed at index "+index);
        }
        size--;
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
        CLL5 circularLinkedList = new CLL5();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nRemoving node at first:");
        circularLinkedList.deleteFist();
        circularLinkedList.display();

        System.out.println("\nRemoving node at last:");
        circularLinkedList.deleteLast();
        circularLinkedList.display();


        circularLinkedList.deleteAtSpecificIndex(1);

        System.out.println("\nCircular linked list after removing the nodes:");
        circularLinkedList.display();
    }
}
