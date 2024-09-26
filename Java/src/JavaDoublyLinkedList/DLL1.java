package JavaDoublyLinkedList;
// Create a class that implements a doubly linked list with operations such as insert, delete, search, and display (both forward and backward).
public class DLL1 {     //
    Node head;
    Node tail;
    int size;

    DLL1() {       //
        this.size = 0;
    }

    public void insertFirst(int value) {     // inset node
        Node newNode = new Node(value);     //
        if(tail == null){       //
            head = newNode;
            tail = head;
        } else {
            //
            head.prev = newNode;//
            newNode.next = head;//
            head = newNode;//
        }
        size++;//
    }

    public void insertLast(int value){      //
        Node newNode = new Node(value);     //
        //
        if(tail == null){       //
            insertFirst(value);//
        } else {
            //
            tail.next = newNode;//
            newNode.prev = tail;//
            tail = newNode;//
        }
        size++;
    }

    public void deleteFirst(){      //
        if(head == null){
            System.out.println("List is empty.");
            return;
        } else {
            //
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteLast(){       //
        if(head == null){       //
            System.out.println("List is empty.");
            return;
        } else {
            tail = tail .prev;
            tail.next = null;
        }
        size--;
    }

    public void searchNode(int index){      //
        if(index > size){
            System.out.println("\nIndex out of bound!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println("Node at index "+index+" is "+temp.value);
    }

    public void display() {     //
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("END");
        }
    }

    public void reverseDoublyLinkedList(){      //
        Node temp = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+"->");
            temp = temp.prev;
        }
        if(temp == null){
            System.out.println("END");
        }
    }
    class Node{     //
        int value;
        Node next;
        Node prev;
        Node(int value){    //
            this.value = value;
        }
    }
    public static void main(String[] args) {
        DLL1 DoublyLinkedList = new DLL1();

        DoublyLinkedList.insertFirst(1);
        DoublyLinkedList.insertFirst(2);
        DoublyLinkedList.insertFirst(3);
        DoublyLinkedList.insertFirst(4);
        DoublyLinkedList.insertFirst(5);

        System.out.println("Inserting Node at first");
        DoublyLinkedList.display();

        DoublyLinkedList.insertLast(10);
        DoublyLinkedList.insertLast(20);
        DoublyLinkedList.insertLast(30);
        DoublyLinkedList.insertLast(40);
        DoublyLinkedList.insertLast(50);

        System.out.println("\nInserting node at last");
        DoublyLinkedList.display();

        DoublyLinkedList.deleteFirst();
        System.out.println("\nDeleting Node at first");
        DoublyLinkedList.display();

        DoublyLinkedList.deleteLast();
        System.out.println("\nDeleting node at last");
        DoublyLinkedList.display();


        System.out.println("\nReversing doubly linked list:");
        DoublyLinkedList.reverseDoublyLinkedList();

        System.out.println("\nOriginal doubly linked list:");
        DoublyLinkedList.display();

        System.out.println("\nSearching Node:");
        DoublyLinkedList.searchNode(5);
    }
}


