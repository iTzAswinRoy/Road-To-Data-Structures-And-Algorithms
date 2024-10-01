package JavaBinaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// Level order traversal from the bottom to top
public class BT9 {
    private Node root;

    class Node{
        int data ;
        Node left;
        Node right;

        Node(int value){
            this.data = value;
        }
    }

    public void insert(int value){
        root = insert(this.root, value);
    }

    private Node insert(Node root, int value) {
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public ArrayList<Integer> bottomLevelTraversalUsingDeque(){
        ArrayList<Integer> result = new ArrayList<>();

        Deque<Node> deque = new LinkedList<>();
        deque.offer(this.root);

        while (!deque.isEmpty()) {
            int size = deque.size();

            for (int i = 0; i < size; i++) {
                Node currentNode = deque.poll();
                result.addFirst(currentNode.data);

                if(currentNode.right != null){
                    deque.offerLast(currentNode.right);
                }
                if(currentNode.left != null){
                    deque.offerLast(currentNode.left);
                }

            }
        }
        return result;
    }

    public ArrayList<Integer> bottomLevelTraversalUsingQueue(){
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Node> Queue = new LinkedList<>();
        Queue.offer(this.root);

        while (!Queue.isEmpty()) {
            int size = Queue.size();

            for (int i = 0; i < size; i++) {
                Node currentNode = Queue.poll();

                result.add(0, currentNode.data);

                if(currentNode.right != null){
                    Queue.offer(currentNode.right);
                }
                if(currentNode.left != null){
                    Queue.offer(currentNode.left);
                }

            }
        }
        return result;
    }


    public static void main(String[] args) {
        BT9 obj = new BT9();

        obj.insert(10);
        obj.insert(15);
        obj.insert(7);
        obj.insert(20);
        obj.insert(5);

        System.out.println(obj.bottomLevelTraversalUsingDeque());
        System.out.println(obj.bottomLevelTraversalUsingQueue());
    }
}
