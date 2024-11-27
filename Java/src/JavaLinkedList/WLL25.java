package JavaLinkedList;
// Write a Java program to check if a linked list is empty or not.
public class WLL25 {
    Node head;//
    Node tail;//
    int size;//
    WLL25(){
        this.size = 0;//
    }
    public void insertNode(int value){
        Node newNode = new Node(value);//
        if(tail == null){//
            newNode.next = head;//
            head = newNode;
            tail = head;//
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
    public void isEmpty(){
        System.out.println("\nChecking if the linked list is empty or not.");
        if(head == null){
            System.out.println("\nLinked list is empty!");
        } else {
            System.out.println("\nLinked list is not empty.");
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
        WLL25 linkedList = new WLL25();
//        linkedList.insertNode(1);
//        linkedList.insertNode(2);
//        linkedList.insertNode(3);
//        linkedList.insertNode(4);
//        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        linkedList.isEmpty();

    }

}
