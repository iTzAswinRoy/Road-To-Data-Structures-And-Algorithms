package JavaBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// Convert a binary tre into a linked list
public class BT17 {
    private Node root;
    Node head;
    Node tail;
    int size;

    static class Node {
        int data;
        Node left;
        Node right;
        Node next;


        Node(int value){
            this.data = value;
        }
    }

    public BT17 convertToLinkedList(Node root) {
        Queue<Node> queue = new LinkedList<>();
        BT17 result = new BT17();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();

                if (head == null) {
                    head = currentNode;
                    tail = currentNode;
                } else {
                    tail.next = currentNode;
                    tail = currentNode;
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        tail.next = null;
        result.head = head;
        result.tail = tail;
        return result;
    }

    public void displayLinkedList(BT17 linkedList){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        BT17 obj = new BT17();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        BT17 linkedList = obj.convertToLinkedList(root);
        obj.displayLinkedList(linkedList);
    }
}
