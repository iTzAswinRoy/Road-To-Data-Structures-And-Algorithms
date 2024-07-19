package JavaCircularLinkedList;
// Write a function to reverse a circular linked list.
public class CLL8 {
    Node head;
    Node tail;
    int size;

    CLL8(){
        this.size = 0;
    }

    public void insertNode(int value){      //
        Node newNode = new Node(value);
        if(tail ==  null){
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

    public void reverse(){      //
        if(head == null || head.next == head){
            return;
        }
        Node prev = null;
        Node curr = head;
        Node originalHead = head;
        do{
            Node after = curr.next;     // Creating a node which helps transverse through the list
            curr.next = prev;
            prev = curr;
            curr = after;

        }  while (curr != head);
        head.next = prev;
        head = prev;
        tail = originalHead;
    }

    public void display(){      //
        Node temp = head;
        do{
            System.out.print(temp.value+" -> ");
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
        CLL8 circularLinkedList = new CLL8();
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nReversed circular linked list:");
        circularLinkedList.reverse();
        circularLinkedList.display();
    }
}
