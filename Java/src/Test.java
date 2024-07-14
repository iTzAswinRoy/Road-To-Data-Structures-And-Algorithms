
public class Test {
    Node head;
    Node tail;
    int size;

    public Test() {
        this.size = 0;
    }

    public void insertNode(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static Test joinLinkedList(Test LL1, Test LL2) {
        Test combinedLinkedList = new Test();

        // Traverse LL1 and add nodes to combinedLinkedList
        Node temp1 = LL1.head;
        while (temp1 != null) {
            combinedLinkedList.insertNode(temp1.value);
            temp1 = temp1.next;
        }

        // Traverse LL2 and add nodes to combinedLinkedList
        Node temp2 = LL2.head;
        while (temp2 != null) {
            combinedLinkedList.insertNode(temp2.value);
            temp2 = temp2.next;
        }

        return combinedLinkedList;
    }

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Test LL1 = new Test();
        LL1.insertNode(1);
        LL1.insertNode(2);
        LL1.insertNode(3);
        LL1.insertNode(4);
        LL1.insertNode(5);
        System.out.println("Linked list-1:");
        LL1.display();

        Test LL2 = new Test();
        LL2.insertNode(6);
        LL2.insertNode(7);
        LL2.insertNode(8);
        LL2.insertNode(9);
        LL2.insertNode(10);
        System.out.println("\nLinked list-2:");
        LL2.display();

        System.out.println("\nCombined linked list:");
        Test combinedList = joinLinkedList(LL1, LL2);
        combinedList.display();
    }
}
