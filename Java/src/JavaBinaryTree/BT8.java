package JavaBinaryTree;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

// ZigZag level order traversal i.e. from left to right and right to left
public class BT8 {
    private Node root;

    class Node{
        int data;
        Node left;
        Node right;

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
        if(value<root.data){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public ArrayList<Integer> zigZagOrderTraversal(){
        Deque<Node> deque = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        deque.offer(this.root);

        boolean reverse = false;

        while (!deque.isEmpty()) {
            int size = deque.size();

            for (int i = 0; i < size; i++) {
                if (!reverse) {     // Non - reverse
                    Node currentNode = deque.pollFirst();

                    result.add(currentNode.data);

                    if (currentNode.left != null) {
                        deque.offerLast(currentNode.left);
                    }

                    if (currentNode.right != null) {
                        deque.offerLast(currentNode.right);
                    }

                } else {        // Reverse
                    Node currentNode = deque.pollLast();
                    result.add(currentNode.data);

                    if (currentNode.right != null) {
                        deque.offerFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        deque.offerFirst(currentNode.left);
                    }
                }
            }
            if (reverse) {
                reverse = false;
            } else {
                reverse = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BT8 obj = new BT8();

        obj.insert(5);
        obj.insert(2);
        obj.insert(4);
        obj.insert(7);
        obj.insert(1);
        obj.insert(8);
        obj.insert(6);
        obj.insert(3);
        obj.insert(9);

        System.out.println(obj.zigZagOrderTraversal());
    }
}

