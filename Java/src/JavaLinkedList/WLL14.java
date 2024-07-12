package JavaLinkedList;
// Write a Java program to remove all elements from a linked list.
public class WLL14 {
    Node head;
    Node tail;
    int size;
    WLL14(){
        this.size = 0;
    }
    public void insertNode(int value){
        Node newNode = new Node(value);
        if(tail == null){
            newNode.next = head;
            head = newNode;
            tail = head;
        }else {
            tail.next = newNode;
            tail = newNode;
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
    public void removingElements(){
        while (head != null){       // This loop makes sure's that each element which is assigned as head is removed.
            Node temp = head;
            head = head.next;
            temp = null;
            size--;
        }
        tail = null;
        if(size == 0){
            System.out.println("Linked list is empty!");
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
        WLL14 linkedList = new WLL14();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        System.out.println("\nRemoving all elements in the linked list. ");
        linkedList.removingElements();
        System.out.println("\nUpdated linked list:");
        linkedList.display();
    }
}
