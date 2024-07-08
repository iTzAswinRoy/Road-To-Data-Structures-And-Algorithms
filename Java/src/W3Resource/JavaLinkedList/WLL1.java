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
        if(tail == null){
            tail = head;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
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
        WLL1 temp = new WLL1();
        temp.insertFirst(1);
        temp.insertFirst(2);
        temp.insertFirst(3);
        temp.insertFirst(4);
        temp.insertFirst(5);
        temp.insertFirst(6);
        temp.insertLast(71);
        temp.insertLast(11);
        temp.insertLast(12);
        temp.display();
        temp.deleteLast();
        temp.display();
        temp.deleteNode(1);
        temp.display();


    }
}
