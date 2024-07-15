package JavaDoublyLinkedList;

import java.util.ArrayList;

//Given a doubly linked list, remove all duplicate nodes.
public class DLL3 {
    Node head;
    Node tail;
    int size;
    DLL3(){
        this.size = 0;
    }
    public void insertNode(int value){
        Node newNode = new Node(value);
        if(tail == null){
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void sortNode(){
        Node temp = head;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size -1 -i; j++) {
                if(temp.value > temp.next.value){
                    int swap = temp.next.value;
                    temp.next.value = temp.value;
                    temp.value = swap;
                }
                temp = temp.next;
            }
            temp = head;
        }
    }
    public DLL3 removeDuplicates() {


    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("END");
        }
    }
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DLL3 DoublyLinkedList = new DLL3();
        DoublyLinkedList.insertNode(1);
        DoublyLinkedList.insertNode(1);
        DoublyLinkedList.insertNode(2);
        DoublyLinkedList.insertNode(2);
        DoublyLinkedList.insertNode(89);

        System.out.println("Original doubly linked list:");
        DoublyLinkedList.display();

        System.out.println("Sorted doubly linked list:");
        DoublyLinkedList.sortNode();
        DoublyLinkedList.display();

        System.out.println("Removing duplicate nodes:");
        DLL3 removedDuplicateNode = DoublyLinkedList.removeDuplicates();
        removedDuplicateNode.display();
    }
}
