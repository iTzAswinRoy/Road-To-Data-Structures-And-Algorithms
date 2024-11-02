package JavaLinkedList;
// Write a Java program to display elements and their positions in a linked list.
public class WLL11 {//
    Node head;//
    Node tail;//
    int size;//
    WLL11(){//
        this.size = 0;//
    }
    public void insertNode(int value){//
        Node newNode = new Node(value);
        if(tail == null){
            newNode.next = head;
            head = newNode;
            tail = head;
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
    public void elementPosition(int index){
        if(index > size){
            System.out.println("Index out of bound!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if(i == index){
                System.out.println("The element "+temp.value+" is at position "+i+" in the linked list.");
                break;
            }
            temp = temp.next;
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
        WLL11 linkedList = new WLL11();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();

        System.out.println("\nFinding elements position:");
        linkedList.elementPosition(2);

    }
}
