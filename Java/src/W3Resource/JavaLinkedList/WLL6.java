package W3Resource.JavaLinkedList;
//Write a Java program to insert elements into the linked list at the first and last positions
public class WLL6 {
    Node head;
    Node tail;
    int size;
    WLL6(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        if(tail== null){
            insertFirst(value);
        } else{
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("END");
        }
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL6 linkedList = new WLL6();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        System.out.println("Adding elements in the front of the linked list:");
        linkedList.display();
        linkedList.insertLast(10);
        linkedList.insertLast(20);
        linkedList.insertLast(30);
        linkedList.insertLast(40);
        linkedList.insertLast(50);
        System.out.println("\nAdding elements at the end of the linked list:");
        linkedList.display();
    }
}
