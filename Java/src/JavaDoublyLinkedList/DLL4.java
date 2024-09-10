package JavaDoublyLinkedList;
// Implement a function to find the middle node of a doubly linked list.
public class DLL4 {     //
    Node head;
    Node tail;
    int size;
    DLL4(){     //
        this.size = 0;
    }
    public void insertNode(int value){      //
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
    public void middleNode(){       //
        if(size % 2 == 0){
            System.out.println("There's no middle node in the doubly linked list!");
            System.out.println("\nTry inserting another node to the doubly linked list to make the size even.");
        } else {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                if(i == size/2){
                    System.out.println("The middle node is "+temp.value);
                }
                temp = temp.next;
            }
        }
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("END");
        }
    }
    class Node{
        Node prev;
        Node next;
        int value;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        DLL4 doublyLinkedList = new DLL4();
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(5);

        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        System.out.println("\nFinding the middle node:");
        doublyLinkedList.middleNode();
    }
}
