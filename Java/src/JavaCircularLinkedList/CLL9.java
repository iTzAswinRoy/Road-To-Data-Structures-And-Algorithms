package JavaCircularLinkedList;
// Find the k-th node from the end of a circular linked list.
public class CLL9 {       // Circular linked list class
    int size;       // Creating instance variable for size
    Node head;      // Creating head pointer
    Node tail;      // Creating tail pointer

    CLL9() {     // Creating a default constructor
        this.size = 0;      // Initializing the size to 0
    }

    public void insertNode(int value) {      // Method to insert node in the circular linked list
        Node newNode = new Node(value);     // Creating a node by passing the value

        // Checking if the tail is null. If it's null, then the list contains only one node
        if (tail == null) {
            head = newNode;     // Assigning value to head
            tail = head;        // Assigning tail as head
        } else {
            // If the tail is not null, then there's more than one node present in the linked list
            tail.next = newNode;        // Setting the tail pointer to the new node
            tail = newNode;      // Assigning tail as new node
        }
        tail.next = head;       // Setting the tail pointing towards head
        size++;         // Incrementing size by 1
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
        CLL9 circularLinkedList = new CLL9();       //

        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);

        System.out.println("Original circular linked list:");
        circularLinkedList.display();       //

        circularLinkedList.findKthFromEnd(2);
    }
}
