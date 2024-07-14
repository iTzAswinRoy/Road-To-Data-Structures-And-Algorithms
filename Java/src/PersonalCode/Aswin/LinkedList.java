package PersonalCode.Aswin;

// My linked list implementation
public class LinkedList {   // This class handles the linked list
    Node head;
    Node tail;
    int size;
    LinkedList(){      // Constructor to initialize size
        this.size = 0;
    }
    public class Node {
        public int value;
        Node next;
        public Node(int value) {    // Constructor for node
            this.value = value;
        }
    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
            return;
        }
        size++;
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void deleteFirst(){
        Node temp = head;
        head = temp.next;
        size--;
    }
    public void deleteLast() {
        Node current = head;
        Node previous = null;
        for (int i = 0; i < size; i++) {
            previous = current;
            current = current.next;
        }
        if(previous != null) {
            previous.next = null;
            tail = previous;
        }
        size--;
    }
    public void deleteNode(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        Node current = head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }
        if(previous != null){
            previous.next = current.next;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insertFirst(111);
        obj.insertLast(1);
        obj.insertLast(5);
        obj.insertLast(99);
        obj.insertLast(100);
        obj.insertLast(200);
        obj.display();
    }
}