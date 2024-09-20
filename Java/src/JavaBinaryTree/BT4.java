package JavaBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// Implement a function to traverse a binary tree level by level (breadth-first search).
public class BT4 {
    public Node root = null;

    class Node{
        int data;
        Node left;
        Node right;

        Node(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
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

    public void levelOrderTraversal(){
        levelOrderTraversal(this.root);
    }
    private void levelOrderTraversal (Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node currentNode = q.poll();
            System.out.print(currentNode.data +" ");

            if(currentNode.left != null){
                q.add(currentNode.left);
            }
            if(currentNode.right != null){
                q.add(currentNode.right);
            }
        }
    }

    public void display() {
        display(this.root);
    }

    private void display(Node root){
        String str = "";

        if(root.left != null) {
            str += root.left.data;
        } else {
            str += "No left node";
        }

        str += " <= | " + root.data + " | => ";

        if (root.right != null) {
            str += root.right.data;
        } else {
            str += "No right node";
        }

        System.out.println(str);

        if (root.left!= null) {
            display(root.left);
        }

        if (root.right != null) {
            display(root.right);
        }
    }

    public static void main(String[] args) {
        BT4 obj = new BT4();

        obj.insert(3);
        obj.insert(99);
        obj.insert(2);
        obj.insert(1);
        obj.insert(5);
        obj.insert(4);

        obj.display();
        obj.levelOrderTraversal();

    }
}
