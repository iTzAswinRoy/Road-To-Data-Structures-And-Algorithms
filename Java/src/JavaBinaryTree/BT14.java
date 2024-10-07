package JavaBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// invert a binary tree
public class BT14 {
    Node root;

    class Node {
        Node left;
        Node right;
        int data;

        Node(int value) {
            this.data = value;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(value < root.data){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public ArrayList<Integer> invertNode(Node root) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            result.add(currentNode.data);

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }


            if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
            }


        return result;
    }

    private Node invertNodeSwap(Node root) {
        if(root == null){
            return null;
        }

        Node left = invertNodeSwap(root.left);
        Node right = invertNodeSwap(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    public ArrayList<Integer> display(Node root){
        invertNodeSwap(root);

        Queue<Node> queue = new LinkedList<>();

        ArrayList<Integer> result = new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            result.add(currentNode.data);

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }


            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
        }
//        System.out.println(result);
        return result;
    }



    public static void main(String[] args) {
        BT14 obj = new BT14();

        obj.insert(5);
        obj.insert(2);
        obj.insert(8);
        obj.insert(6);
        obj.insert(9);
        obj.insert(1);
        obj.insert(3);

        System.out.println(obj.invertNode(obj.root));

        System.out.println(obj.display(obj.invertNodeSwap(obj.root)));
    }
}
