package JavaDoublyLinkedList;
// Rotate a doubly linked list by k nodes (where k can be positive or negative).
public class DLL6 {
    Node head;//
    Node tail;//
    int size;//

    DLL6() {//
        this.size = 0;//
    }
    public void insertNode(int value){//
        Node newNode = new Node(value);//
        if( tail == null){
            head = newNode;//
            tail = head;//
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;//
        }
        size++;//
    }
    public void rotateDoublyLinkedList(int index){//
        System.out.println("\nRotating doubly linked list at index "+index);
        Node temp = head;

        if(index > size){
            System.out.println("Index out of bound!");
            return;
        }

        for (int i = 0; i < index; i++) {
            head = head.next;
        }

        while (head != null){
            System.out.print(head.value+" -> ");
            head = head.next;
        }
        tail = temp;
        for (int i = 0; i < index; i++) {
            System.out.print(tail.value+" -> ");
            tail = tail.next;
        }
        System.out.println("END");
    }
    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("END");
        }
    }
    class Node {
        Node next;
        Node prev;
        int value;

        Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        DLL6 doublyLinkedList = new DLL6();
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        doublyLinkedList.rotateDoublyLinkedList(4);
    }
}