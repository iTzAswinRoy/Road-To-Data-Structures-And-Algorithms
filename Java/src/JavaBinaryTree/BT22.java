//package JavaBinaryTree;
//
//// Binary tree find the sum of maximum path
//public class BT22 {
//    private Node root;
//    int max = 0;
//
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int value) {
//            this.data = value;
//            left = right = null;
//        }
//    }
//
//    public void maximumPathSum(Node root){
//        System.out.println(helper(root));
//    }
//
//    private int helper(Node root) {
//        if(root == null){
//            return 0;
//        }
//
//        int leftNode = helper(root.left);
//        int rightNode = helper(root.right);
//
//        int currentMax = leftNode + rightNode + root.data;
//
//        max = Math.max(max, currentMax);
//
//        return root.data + Math.max(leftNode,rightNode);
//    }
//
//    public static void main(String[] args) {
//
//        BT22 obj = new BT22();
//
//        Node root = new Node(10);
//        root.left = new Node(9);
//        root.right = new Node(20);
//        root.right.left = new Node(15);
//        root.right.right = new Node(5);
//
//        obj.maximumPathSum(root);
//    }
//}
