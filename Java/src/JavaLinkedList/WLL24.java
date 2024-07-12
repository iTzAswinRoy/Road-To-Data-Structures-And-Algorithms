package JavaLinkedList;

// Write a Java program to compare two linked lists.
public class WLL24 {
    Node head;
    Node tail;
    int size;
    WLL24(){
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
    static boolean compareLinkedList(Node head1, Node head2){
        if(head1 == null & head2 == null){      // Base case: both lists are null, they are equal
            return true;
        }
        if (head1.value == head2.value) {       // Compare current nodes' values and recurse for next nodes
            return compareLinkedList(head1.next, head2.next);
        } else {
            return false;
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
        WLL24 LL1 = new WLL24();
        LL1.insertNode(1);
        LL1.insertNode(2);
        LL1.insertNode(3);
        LL1.insertNode(4);
        LL1.insertNode(5);
        System.out.println("Linked list-1:");
        LL1.display();

        WLL24 LL2 = new WLL24();
        LL2.insertNode(1);
        LL2.insertNode(2);
        LL2.insertNode(3);
        LL2.insertNode(4);
        LL2.insertNode(55);
        System.out.println("\nLinked list-2:");
        LL2.display();

        if(compareLinkedList(LL1.head, LL2.head)){
            System.out.println("\nBoth the linked list are same.");
        } else {
            System.out.println("\nBoth the linked list are different:");
        }
    }

}
