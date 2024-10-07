package JavaDoublyLinkedList;
// Find the kth node from the end of the doubly linked list.
public class DLL9 {
    Node head;//
    Node tail;//
    int size;//
    DLL9() {
        this.size = 0;
    }
    public void insertNode(int value){
        Node newNode = new Node(value);
        if(tail == null){
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public int kthNode(int k){
        Node first = head;
        Node second = head;
        System.out.println("\nFinding the "+k+"th node from the end:");
        if(k > size){
            System.out.println("Index out of bound!");
        }
        for (int i = 0; i < k; i++) {
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        return second.value;
    }
    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("END");
        }
    }
    class Node {
        Node next;
        Node prev;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DLL9 doublyLinkedList = new DLL9();
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        System.out.println(doublyLinkedList.kthNode(2));
    }
}
