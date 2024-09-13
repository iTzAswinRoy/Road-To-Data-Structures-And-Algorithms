package JavaDoublyLinkedList;
// Given two sorted doubly linked lists, merge them into a single sorted doubly linked list.
public class DLL5 { //
    Node head;
    Node tail;
    int size;
    DLL5(){     //
        this.size = 0;
    }
    public void insertNode(int value){      //
        Node newNode = new Node(value);
        if(tail == null){
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;        //
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void sortNode(){     //
        Node temp = head;       //
        for (int i = 0; i < size -1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(temp.value > temp.next.value){
                    int swap = temp.next.value;
                    temp.next.value = temp.value;
                    temp.value = swap;
                }
                temp = temp.next;
            }
            temp = head;
        }
    }
    static DLL5 mergeDoublyLinkedList(DLL5 list1, DLL5 list2){
        DLL5 newDoublyLinkedList = new DLL5();

        Node temp1 = list1.head;
        Node temp2 = list2.head;

        for (int i = 0; i < list1.size; i++) {
            newDoublyLinkedList.insertNode(temp1.value);
            temp1 = temp1.next;
        }
        for (int i = 0; i < list2.size; i++) {
            newDoublyLinkedList.insertNode(temp2.value);
            temp2 = temp2.next;
        }
        return newDoublyLinkedList;
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("END");
        }
    }
    class Node{
        Node next;
        Node prev;
        int value;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        DLL5 doublyLinkedList1 = new DLL5();
        DLL5 doublyLinkedList2 = new DLL5();

        doublyLinkedList1.insertNode(65);
        doublyLinkedList1.insertNode(21);
        doublyLinkedList1.insertNode(36);
        doublyLinkedList1.insertNode(99);
        doublyLinkedList1.insertNode(10);

        System.out.println("Doubly linked list-1:");
        doublyLinkedList1.display();

        System.out.println("Sorting doubly linked list-1:");
        doublyLinkedList1.sortNode();
        doublyLinkedList1.display();

        doublyLinkedList2.insertNode(89);
        doublyLinkedList2.insertNode(70);
        doublyLinkedList2.insertNode(45);
        doublyLinkedList2.insertNode(85);
        doublyLinkedList2.insertNode(50);

        System.out.println("\nDoubly linked list-2:");
        doublyLinkedList2.display();

        System.out.println("Sorting doubly linked list-1:");
        doublyLinkedList2.sortNode();
        doublyLinkedList2.display();

        DLL5 result = mergeDoublyLinkedList(doublyLinkedList1, doublyLinkedList2);
        System.out.println("\nMerged doubly linked list:");
        result.display();

        System.out.println("\nSorting merged doubly linked list:");
        result.sortNode();
        result.display();
    }
}
