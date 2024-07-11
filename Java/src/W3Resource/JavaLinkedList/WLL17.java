package W3Resource.JavaLinkedList;
// Write a Java program to join two linked lists.
public class WLL17 {
    Node head;
    Node tail;
    int size;
    WLL17(){
        this.size = 0;
    }
    public void insertNode(int value){
        Node newNode = new Node(value);
        if(tail == null){
            newNode.next = head;
            head = newNode;
            tail = head;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("END");
        }
    }
    public static WLL17 joinLinkedList(WLL17 LL1, WLL17 LL2){
        WLL17 combinedLinkedList = new WLL17();
        Node temp1 = LL1.head;
        for (int i = 0; i < LL1.size; i++) {
            combinedLinkedList.insertNode(temp1.value);
            temp1 = temp1.next;
        }

        Node temp2 = LL2.head;
        for (int i = 0; i < LL2.size; i++) {
            combinedLinkedList.insertNode(temp2.value);
            temp2 = temp2.next;
        }
        return combinedLinkedList;
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        WLL17 LL1 = new WLL17();
        LL1.insertNode(1);
        LL1.insertNode(2);
        LL1.insertNode(3);
        LL1.insertNode(4);
        LL1.insertNode(5);
        System.out.println("Linked list-1:");
        LL1.display();

        WLL17 LL2 = new WLL17();
        LL2.insertNode(6);
        LL2.insertNode(7);
        LL2.insertNode(8);
        LL2.insertNode(9);
        LL2.insertNode(10);
        System.out.println("\nLinked list-2:");
        LL2.display();

        System.out.println("\nCombined linked list:");
        WLL17 combinedList = joinLinkedList(LL1, LL2);
        combinedList.display();
    }
}
