package JavaLinkedList;
// Write a Java program to remove the first and last elements from a linked list.
public class WLL13 {
    Node head;
    Node tail;
    int size;
    WLL13(){
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
    public void removeFirst(){
        Node curr = head;
        head = curr.next;
        size--;
    }
    public void removeLast(){
        Node prev = null;
        Node curr = head;
        for (int i = 0; i < size-1; i++) {      // Stopping just before the last node.
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL13 linkedList = new WLL13();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        System.out.println("\nLinked list after removing the first and last node: ");
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.display();

    }
}
