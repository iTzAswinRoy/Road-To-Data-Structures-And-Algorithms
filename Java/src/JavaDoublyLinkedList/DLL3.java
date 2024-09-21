package JavaDoublyLinkedList;

//Given a doubly linked list, remove all duplicate nodes.
public class DLL3 {     // Main class
    // Creating instance variables for the class
    Node head;      // Crating a reference variable 'head' of class Node type
    Node tail;
    int size;
    DLL3(){     //
        this.size = 0;
    }
    public void insertNode(int value){      // Method to insert node to the doubly linked list
        Node newNode = new Node(value); //
        if(tail == null){
            head = newNode; //
            tail = head;
        } else {
            tail.next = newNode; //
            newNode.prev = tail; //
            tail = newNode; //
        }
        size++; //
    }
    public void sortNode(){     // Method to sort the doubly linked list
        Node temp = head;       //
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size -1 -i; j++) {
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
    public DLL3 removeDuplicates() {    // Method to remove duplicate nodes in a doubly linked list
        DLL3 result = new DLL3();
        Node temp = head;
        result.insertNode(temp.value);      // Always first value is unique
        for (int i = 0; i < size-1; i++) {
            if(temp.value != temp.next.value){
                result.insertNode(temp.next.value);
            }
            temp = temp.next;
        }
        return result;
    }

    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("END");
        }
    }
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DLL3 DoublyLinkedList = new DLL3();
        DoublyLinkedList.insertNode(10);
        DoublyLinkedList.insertNode(85);
        DoublyLinkedList.insertNode(25);
        DoublyLinkedList.insertNode(10);
        DoublyLinkedList.insertNode(99);
        DoublyLinkedList.insertNode(85);
        DoublyLinkedList.insertNode(25);
        DoublyLinkedList.insertNode(60);




        System.out.println("Original doubly linked list:");
        DoublyLinkedList.display();

        System.out.println("\nSorted doubly linked list:");
        DoublyLinkedList.sortNode();
        DoublyLinkedList.display();

        System.out.println("\nRemoving duplicate nodes:");
        DLL3 removedDuplicateNode = DoublyLinkedList.removeDuplicates();
        removedDuplicateNode.display();
    }
}
