package JavaLinkedList;
// Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class WLL10 {
    Node head;//
    Node tail;//
    int size;//
    WLL10(){
        this.size = 0;//
    }
    public void insert(int value){
        Node newNode = new Node(value);//
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
    public int getFirst(){
        return head.value;
    }
    public int getLast(){
        return tail.value;
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("END");
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
        WLL10 linkedList = new WLL10();
        System.out.println("Given linked List:");
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.display();
        System.out.println("\nThe first element in the linked list is "+linkedList.getFirst());
        System.out.println("\nThe last element in the linked list is "+linkedList.getLast());
    }
}
