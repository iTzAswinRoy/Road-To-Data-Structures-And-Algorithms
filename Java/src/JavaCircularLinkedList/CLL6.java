package JavaCircularLinkedList;
// Given two circular linked lists, merge them into one circular linked list, maintaining the order of the original lists.
public class CLL6 {        // Circular linked list class
    int size;       // Creating instance variable for size
    Node head;      // Creating head pointer
    Node tail;      // Creating tail pointer

    CLL6() {
        this.size = 0;
    }

    public void insertNode(int value) {
        Node newNode = new Node(value);
        if(tail == null){
            head = newNode;
            tail = head;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    static CLL6 mergeList(CLL6 list1, CLL6 list2){
        CLL6 newList = new CLL6();
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        do{
            newList.insertNode(temp1.value);
            temp1 = temp1.next;

        } while (temp1 != list1.head);

        do{
            newList.insertNode(temp2.value);
            temp2 = temp2.next;

        } while (temp2 != list2.head);

        return newList;
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        } while (temp != head);

        System.out.println("HEAD");
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL6 circularLinkedList1 = new CLL6();
        CLL6 circularLinkedList2 = new CLL6();


        circularLinkedList1.insertNode(1);
        circularLinkedList1.insertNode(2);
        circularLinkedList1.insertNode(3);
        circularLinkedList1.insertNode(4);
        circularLinkedList1.insertNode(5);
        System.out.println("Circular linked list-1:");

        circularLinkedList1.display();

        circularLinkedList2.insertNode(10);
        circularLinkedList2.insertNode(20);
        circularLinkedList2.insertNode(30);
        circularLinkedList2.insertNode(40);
        circularLinkedList2.insertNode(50);
        System.out.println("\nCircular linked list-2:");
        circularLinkedList2.display();

        CLL6 mergedCircularLinkedList1 = mergeList(circularLinkedList1, circularLinkedList2);
        System.out.println("\nMerged circular linked list:");
        mergedCircularLinkedList1.display();
    }
}