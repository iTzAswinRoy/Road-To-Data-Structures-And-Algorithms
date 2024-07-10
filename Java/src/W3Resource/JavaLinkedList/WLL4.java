package W3Resource.JavaLinkedList;
// Write a Java program to iterate through all elements in a linked list starting at the specified position.
public class WLL4 {
    Node head;
    Node tail;
    int size;
    WLL4(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
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
    public void specificPosition(int index){
        if(index > size){
            System.out.println("Given index is out of bound!");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            for (int i = index; i < size; i++) {
                System.out.print(temp.value+"->");
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("END");
            }
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
        WLL4 linkedList = new WLL4();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        System.out.println("Given linked list:");
        linkedList.display();;
        System.out.println("\nLinked list from a specific point:");
        linkedList.specificPosition(2);
    }
}
