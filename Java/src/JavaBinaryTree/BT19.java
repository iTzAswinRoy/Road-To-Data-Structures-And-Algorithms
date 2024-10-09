//package JavaBinaryTree;
//
//// Validate binary search tree
//public class BT19 {
//    private Node root;
//    Node head;
//    Node tail;
//
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int value) {
//            this.data = value;
//        }
//    }
//
//    public void checkBinaryTree(Node root){
//        System.out.println(validate(root, null));
//    }
//
//    private boolean validate(Node root, Integer num){
//        if (root == null) {
//            return true;
//        }
//
//        if (num != null && root.data < num) {
//            return true;
//        }
//
//        if(num != null && root.data >= num) {
//            return true;
//        }
//
//        boolean leftTree = validate(root.left, root.data);
//        boolean rightTree = validate(root.right, root.data);
//
//        return leftTree && rightTree;
//
//    }
//
//    public static void main(String[] args) {
//        BT19 obj = new BT19();
//
//        Node root = new Node(10);
//        root.left = new Node(6);
//        root.right = new Node(14);
//        root.left.left = new Node(3);
//        root.left.right = new Node(7);
//        root.right.right = new Node(16);
//        root.right.left = new Node(12);
//
//        obj.checkBinaryTree(root);
//    }
//}
