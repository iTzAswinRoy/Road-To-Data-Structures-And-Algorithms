package JavaLinkedList;
import java.util.Scanner;
// Write a Java program to insert some elements at the specified position into a linked list.
public class WLL9 {
    Node head;
    Node tail;
    int size;
    WLL9(){
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
    public boolean addElement(int index){
        if(index > size){
            System.out.println("\nIndex out of bound");
            return false;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the element to insert into the linked list: ");
        Node newNode = new Node(in.nextInt());

        if(index == 0){
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = null;
            Node current = head;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
            newNode.next = current;
        }
        size++;
        return true;
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL9 linkedList = new WLL9();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        System.out.println("Given linked list:");
        linkedList.display();
        if (linkedList.addElement(3)) {
            System.out.println("\nUpdated linked list:");
            linkedList.display();
        }
    }
}
