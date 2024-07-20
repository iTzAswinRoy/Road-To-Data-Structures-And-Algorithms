package JavaCircularLinkedList;
// Given a circular linked list, split it into two halves.
// If the list has an odd number of nodes, one half should have one more node than the other.
public class CLL7 {
    Node head;
    Node tail;
    int size;

    CLL7(){     //
        this.size = size;
    }

    public void insertNode(int value){      //
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

    public void splittingCircularLinkedList(CLL7 list){     //
        CLL7 list1 = new CLL7();
        CLL7 list2 = new CLL7();
        Node temp = head;

        if(size % 2 == 0){
            for (int i = 0; i < size / 2; i++) {
                list1.insertNode(temp.value);
                temp = temp.next;

            }
            while (temp != head){
                list2.insertNode(temp.value);
                temp = temp.next;
            }
        } else {
            for (int i = 0; i <= size / 2; i++) {
                list1.insertNode(temp.value);
                temp = temp.next;
            }
            while (temp != head){
                list2.insertNode(temp.value);
                temp = temp.next;
            }
        }
        System.out.println("List-1:");
        list1.display();

        System.out.println("\nList-2:");
        list2.display();
    }

    public void display(){      //
        Node temp = head;
        do {
            System.out.print(temp.value+" -> ");
            temp = temp.next;

        } while (temp != head);
        System.out.println("HEAD");
    }

    class Node{     //
        Node next;
        int value;

        Node(int value){      //
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL7 circularLinkedList = new CLL7();
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        System.out.println("\nSplitting circular linked list!");
        circularLinkedList.splittingCircularLinkedList(circularLinkedList);
    }
}
