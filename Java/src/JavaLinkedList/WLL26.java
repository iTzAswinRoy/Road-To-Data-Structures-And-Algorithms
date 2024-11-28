package JavaLinkedList;
// Write a Java program to replace an element in a linked list.
public class WLL26 {
    Node head;//
    Node tail;//
    int size;//
    WLL26(){
        this.size = 0;
    }
    public void insertNode(int value){
        Node newNode = new Node(value);
        if(tail == null){
            newNode.next = head;
            head = newNode;
            tail =head;
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
    public void replaceElement(int index, int element){
        if(index >= size){
            System.out.println("\nIndex out of bound!");
        } else {
            System.out.println("\nReplacing the element "+element+" at index "+index);
            Node temp = head;
            System.out.println("\nLinked list after replacing the element:");
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.value = element;
        }
    }
    public class Node{  // Nested class
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL26 linkedList = new WLL26();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        linkedList.replaceElement(1,23);
        linkedList.display();
    }
}
