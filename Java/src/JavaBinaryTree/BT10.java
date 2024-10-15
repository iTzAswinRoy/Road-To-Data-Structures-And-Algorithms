package JavaBinaryTree;

import java.util.ArrayList;//
import java.util.Deque;//
import java.util.LinkedList;//
import java.util.Queue;//

// Populating next right pointers in each node
public class BT10 {
    private Node root;//

    static class Node {//
        int data;//
        Node left;//
        Node right;
        Node next;

        Node(int value) {
            this.data = value;
            left = null;
            right = null;
            next = null;
        }
    }

    public void connect(Node root){
        Node leftNode = root;

        while (leftNode.left != null) {
            Node currentNode = leftNode;

            while (currentNode != null) {
                // Connect the left child to the right child
                currentNode.left.next = currentNode.right;

                // Connect the right child to the next node's left child (if any)
                if(currentNode.next != null) {
                    currentNode.right.next = currentNode.next.left;
                }

                // Move to the next node in the current level
                currentNode = currentNode.next;
            }
            // Move to the next level (leftmost node of the next level)
            leftNode = leftNode.left;
        }
    }

    public void display(Node root) {
        Node leftNode = root;

        while (leftNode != null) {
            Node currentNode = leftNode;

            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.print("Null\n");
            leftNode = leftNode.left;
        }

    }

    public static void main(String[] args) {
        BT10 obj = new BT10();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        obj.connect(root);
        obj.display(root);

    }
}
