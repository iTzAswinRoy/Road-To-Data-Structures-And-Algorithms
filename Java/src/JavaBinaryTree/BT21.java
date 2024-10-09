package JavaBinaryTree;

import java.lang.String;

// Sum root to leaf numbers
public class BT21 {
    private Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            this.data = value;
            left = right = null;
        }
    }

    public void sumOfPath(Node root){
        System.out.println(helper(root, "", 0));
    }

    private int helper(Node root, String num, int result) {

        if(root == null){
            return 0;
        }

        num += root.data;

        if(root.left == null && root.right==null){
            int temp = Integer.parseInt(num);
            return temp;
        }

        int leftNode = helper(root.left, num, result);
        int rightNode = helper(root.right, num, result);

        result = leftNode + rightNode;

        return result;
    }

    public static void main(String[] args) {

        BT21 obj = new BT21();

        Node root = new Node(4);
        root.left = new Node(9);
        root.right = new Node(0);
        root.left.left = new Node(5);
        root.left.right = new Node(1);

        obj.sumOfPath(root);
    }
}
