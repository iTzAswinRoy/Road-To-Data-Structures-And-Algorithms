package W3Resource.JavaLinkedList;
//Write a Java program to retrieve, but not remove, the last element of a linked list.
public class WLL21 {
    Node head;
    Node tail;
    int size;
    WLL21() {
        this.size = 0;
    }
    public void insertNode(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            newNode.next = head;
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("END");
        }
    }
    public int retrieveLast(){
        Node temp = tail;
        return temp.value;
    }
    public class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL21 linkedList = new WLL21();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        System.out.println("\nGetting the last element in the linked list:\n"+linkedList.retrieveLast());
    }
}
