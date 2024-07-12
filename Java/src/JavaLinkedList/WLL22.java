package JavaLinkedList;
// Write a Java program to check if a particular element exists in a linked list.
public class WLL22 {
    Node head;
    Node tail;
    int size;
    WLL22(){
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
    public void checkElement(int element){
        Node temp = head;
        boolean isFound = false;
        System.out.println("\nChecking if the element "+element+" is in the linked list...");
        for (int i = 0; i < size; i++) {
            if(element == temp.value){
                isFound = true;
                System.out.println("Element found at index "+i);
                return;
            }
            temp = temp.next;
        }
        if(!isFound){
            System.out.println("Element not found!");
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
        WLL22 linkedList = new WLL22();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        linkedList.checkElement(3);
    }
}
