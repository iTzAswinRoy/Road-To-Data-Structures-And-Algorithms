package JavaDoublyLinkedList;
// Given a doubly linked list, determine if the list is a palindrome.
public class DLL8 {
    private Node head;
    private Node tail;
    private int size;

    DLL8() {
        this.size = 0;
    }

    class Node {
        private Node prev;
        private Node next;
        private int value;

        Node(int value) {
            this.value = value;
        }
    }

    public void insertNode(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = head;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void findPalindrome() {
        Node left = head;
        Node right = tail;
        boolean isSame = false;

        if (size % 2 == 0) {
            while (left != right && right != left) {
                if (left.value == right.value) {

                    left = left.next;
                    right = right.prev;
                    isSame = true;

                } else {
                    System.out.println("\nIt's not a palindrome!");
                    return;
                }
            }

        } else {
            Node middle = head;

            for (int i = 0; i < size / 2; i++) {
                middle = middle.next;
            }

            while (left != middle && right != middle){
                if (left.value == right.value) {

                    left = left.next;
                    right = right.prev;
                    isSame = true;

                } else {
                    System.out.println("\nIt's not a palindrome!");
                    return;
                }
            }
        }
        if (isSame) {
            System.out.println("\nIt's a palindrome.");
        }
    }
    public void display() {
        Node temp = head;

        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        DLL8 doublyLinkedList = new DLL8();
        doublyLinkedList.insertNode(1);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(1);

        System.out.println("Original doubly linked list:");
        doublyLinkedList.display();

        System.out.println("\nChecking if the linked list is palindrome:");
        doublyLinkedList.findPalindrome();
    }
}