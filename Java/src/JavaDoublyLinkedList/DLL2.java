package JavaDoublyLinkedList;
// Write a function to reverse the nodes of a doubly linked list in place.
public class DLL2 {     //
    Node head;
    Node tail;
    int size;
    DLL2() {        //
        this.size = 0;
    }
    public void insertNode(int value){      //
        Node newNode = new Node(value);     //
        if(tail == null){
            head = newNode;
            tail = head;
        } else {
            //
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void reverseList(){
        Node temp = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+" -> ");
            temp = temp.prev;
        }
        if(temp == null){
            System.out.println("END");
        }
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("END");
        }
    }
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        DLL2 DoublyLinkedList = new DLL2();

        DoublyLinkedList.insertNode(1);
        DoublyLinkedList.insertNode(2);
        DoublyLinkedList.insertNode(3);
        DoublyLinkedList.insertNode(4);
        DoublyLinkedList.insertNode(5);

        System.out.println("Original doubly linked list:");
        DoublyLinkedList.display();

        System.out.println("\nReversed doubly linked list:");
        DoublyLinkedList.reverseList();
    }
}

