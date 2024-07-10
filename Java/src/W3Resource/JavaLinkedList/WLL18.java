package W3Resource.JavaLinkedList;
// Write a Java program to copy a linked list to another linked list.
public class WLL18 {
    Node head;
    Node tail;
    int size;
    WLL18(){
        this.size = 0;
    }
    public void insertNode(int value){
        Node newNode = new Node(value);
        if(tail == null){
            newNode.next = head;
            head = newNode;
            tail= head;
        } else {
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
    static WLL18 copyLinkedList(WLL18 linkedList){
        WLL18 newLinkedList = new WLL18();
        Node temp = linkedList.head;
        for (int i = 0; i < linkedList.size; i++) {
            newLinkedList.insertNode(temp.value);
            temp = temp.next;
        }
        return newLinkedList;
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        WLL18 originalLinkedList = new WLL18();
        originalLinkedList.insertNode(1);
        originalLinkedList.insertNode(2);
        originalLinkedList.insertNode(3);
        originalLinkedList.insertNode(4);
        originalLinkedList.insertNode(5);
        System.out.println("Original linked list:");
        originalLinkedList.display();

        System.out.println("\nClone linked list:");
        WLL18 cloneLinkedList = WLL18.copyLinkedList(originalLinkedList);
        cloneLinkedList.display();
    }
}
