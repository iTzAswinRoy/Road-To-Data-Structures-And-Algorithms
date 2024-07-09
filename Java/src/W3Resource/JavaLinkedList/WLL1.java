package W3Resource.JavaLinkedList;
// Write a Java program to append the specified element to the end of a linked list.
public class WLL1 {
    Node head;
    Node tail;
    int size;
    public WLL1(){
        this.size = 0;
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
        for (int i = 0; i < size-1; i++) {
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
        if(index > size){
            System.out.println("Index out of bound!");
        }
        Node current = head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }
        if(previous!= null){
            previous.next = current.next;
        }
        size--;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
            if (temp == null){
                System.out.println("END");
            }
        }
    }
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        WLL1 obj = new WLL1();
        obj.insertLast(1);
        obj.insertLast(2);
        obj.insertLast(3);
        obj.insertLast(4);
        obj.insertLast(5);
        obj.insertLast(6);
        System.out.println("Linked list after appending the elements:");
        obj.display();


    }
}
