package JavaLinkedList;
// Write a Java program that swaps two elements in a linked list.
public class WLL15 {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    WLL15(){        // Creating a default constructor
        this.size = 0;         // Initializing the size to 0
    }
    public class Node {         // Creating a 'Node' class
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
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
    public void swapNodes(int index1, int index2){
        Node prev1 = null;
        Node curr1 = head;
        for (int i = 0; i < index1; i++) {
            prev1 = curr1;
            curr1 = curr1.next;
        }

        Node prev2 = null;
        Node curr2 = head;
        for (int i = 0; i < index2; i++) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        if(prev1!=null){
            prev1.next = curr2;
        } else{
            head = curr2;
        }

        if(prev2 != null){
            prev2.next = curr1;
        } else {
            head = curr1;
        }

        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
    }
    public static void main(String[] args) {
        WLL15 linkedList = new WLL15();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        System.out.println("\nLinked list after swapping:");
        linkedList.swapNodes(0,4);
        linkedList.display();
    }
}
