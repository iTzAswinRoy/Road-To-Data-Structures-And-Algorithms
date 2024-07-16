package JavaDoublyLinkedList;
// Split a doubly linked list into two equal halves. If the list has an odd number of nodes, the first half should have one more node than the second.
public class DLL10 {
    Node head;
    Node tail;
    int size;
    DLL10() {
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
    public void splittingList(){
        DLL10 list1 = new DLL10();
        DLL10 list2 = new DLL10();
        Node temp = head;
        if(size % 2 == 0){
            for (int i = 0; i < size / 2; i++) {
                list1.insertNode(temp.value);
                temp = temp.next;
            }
            while (temp != null){
                list2.insertNode(temp.value);
                temp = temp.next;
            }
        } else {
            for (int i = 0; i <= size / 2; i++) {
                list1.insertNode(temp.value);
                temp = temp.next;
            }
            while (temp != null){
                list2.insertNode(temp.value);
                temp = temp.next;
            }
        }
        System.out.println("\nFirst half:");
        list1.display();

        System.out.println("\nSecond half:");
        list2.display();
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
        DLL10 doublyLinkedList = new DLL10();
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        System.out.println("\nSplitting the the doubly linked list.");
        doublyLinkedList.splittingList();
    }
}
