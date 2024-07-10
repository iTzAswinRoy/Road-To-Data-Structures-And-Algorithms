package W3Resource.JavaLinkedList;
// Reverse a singly linked list using stack.
public class WLL3 {
    Node head;
    Node tail;
    int size;
    WLL3(){
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
        if(temp == null){
            System.out.println("END");
        }
    }
    public void reversLinkedList(){
        // This process helps to move the reference of the head to its last node(tail)
        Node previous = null;
        Node current = head;
        for (int i = 0; i < size; i++) {    // Iterating through the list in order to change its reference in backwards.
            Node nextNode = current.next;   // Setting the 'nextNode' to once node ahead of current node.
            current.next = previous;    // Changing the reference of the current node pointing towards to previous (behind) node.
            previous = current;     // Now, updating the previous node to current node.
            current = nextNode;     // Again updating the current node to its next node.
        }
        head = previous;    // Assigning the head to 'previous' where the new head starts from the end of the list
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL3 linkedList = new WLL3();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        System.out.println("Given linked list:");
        linkedList.display();
        System.out.println("Reversed linked list");
        linkedList.reversLinkedList();
        linkedList.display();
    }
}

