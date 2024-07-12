package JavaLinkedList;
import java.util.ArrayList;
// Write a Java program to convert a linked list to an array list.
public class WLL23 {
    Node head;
    Node tail;
    int size;
    WLL23(){
        this.size = 0;
    }
    public void insertNode(int value){
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
    public ArrayList<Integer> convertToArrayList(WLL23 linkedList){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            arrayList.add(temp.value);
            temp = temp.next;
        }
        return arrayList;
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL23 linkedList = new WLL23();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        ArrayList<Integer> newArrayList = linkedList.convertToArrayList(linkedList);
        System.out.println("\nConverting linked list into array list:\n"+newArrayList);
    }
}
