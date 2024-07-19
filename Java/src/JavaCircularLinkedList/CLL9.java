package JavaCircularLinkedList;
// Find the k-th node from the end of a circular linked list.
public class CLL9 {     //
    Node head;
    Node tail;
    int size;

    CLL9(){     //
        this.size = 0;
    }

    public void insertNode(int value){      //
        Node newNode = new Node(value);     //
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

    public void findKthFromEnd(int k){      //
        Node temp = head;
        Node kth = head;
        if(k > size){
            System.out.println("\nIndex out of bound!");
            return;
        }
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        while (temp!=head){
            temp = temp.next;
            kth = kth.next;
        }
        System.out.println("\nThe "+k+"th from the last of the circular linked list is "+kth.value+".");
    }

    public void display(){      //
        Node temp = head;
        do{
            System.out.print(temp.value+" -> ");
            temp = temp.next;

        } while (temp != head);
        System.out.println("HEAD");
    }

    class Node {    //
        int value;
        Node next;

        Node(int value) {     //
            this.value = value;
        }
    }

    public static void main(String[] args) {    //
        CLL9 circularLinkedList = new CLL9();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();

        circularLinkedList.findKthFromEnd(2);
    }
}
