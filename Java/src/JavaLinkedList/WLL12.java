package JavaLinkedList;
// Write a Java program to remove a specified element from a linked list.
public class WLL12 {
    // Creating instance variables for the class
    Node head;
    Node tail;
    int size;
    WLL12(){
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
    public void removeElement(int index){
        Node prev = null;
        Node curr = head;
        for (int i = 0; i < size; i++) {
            if(i == index){
                if(prev == null) {
                    prev = curr.next;   // Removing the head node
                    size--;
                    break;
                }else {
                    prev.next = curr.next;
                    size--;
                    break;
                }
            }
            prev = curr;
            curr = curr.next;
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
        WLL12 linkedList = new WLL12();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        System.out.println("\nRemoving element in the linked list.");
        linkedList.removeElement(2);
        System.out.println("Element after being removed:");
        linkedList.display();
    }
}
