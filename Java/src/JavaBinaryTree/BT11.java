package JavaBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Find nodes from the right side of the tree in each level
public class BT11 {
    Node root;

    class Node{
        int data;
        Node left;
        Node right;

        Node(int value){
            this.data =value;
        }
    }

    public void insert(int value){
        root = insert(this.root, value);
    }

    private Node insert(Node root, int value){
        if (root == null){
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

    public ArrayList<Integer> rightNode(Node root){
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();

                if(i== size-1){
                    result.add(currentNode.data);
                }

                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        BT11 obj = new BT11();

        obj.insert(5);
        obj.insert(2);
        obj.insert(9);
        obj.insert(1);
        obj.insert(3);
        obj.insert(6);
        obj.insert(10);
        obj.insert(15);
        obj.insert(12);

        System.out.println(obj.rightNode(obj.root));
    }
}
