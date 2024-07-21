package JavaCircularLinkedList;
// Given n people standing in a circle and a number k, every kth person is eliminated until only one remains.
public class CLL3 {     //
    Node head;
    Node tail;
    int size;

    CLL3(){     //
        this.size = 0;
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

    public void survivor(int k){       //
        Node curr = head;
        Node prev = tail;
        System.out.println("\nEliminating every "+k+"th person in the circle.");
        if(k > size){
            System.out.println("\nIndex out of bound!");
            return;
        }
        while (curr.next != curr) {     //
            for (int i = 1; i < k; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            curr = curr.next;
        }
        head = curr;
        System.out.println("\nThe last survivor is "+curr.value);
    }

    public void display(){
        Node temp = head;
        do {
            System.out.print(temp.value+" -> ");
            temp = temp.next;

        } while (temp != head);

        System.out.println("HEAD");
    }

    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL3 circularLinkedList = new CLL3();

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("People standing in a circle:");
        circularLinkedList.display();

         circularLinkedList.survivor(3);
    }
}
