package JavaBinaryTree;

// Path sum
public class BT20 {
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

    public void pathSum(Node root, int target) {

        System.out.println("Target number"+target+" is found at leaf node: "+helper(root, target, 0).data);
    }

    private Node helper(Node root, int target, int sum) {
        if (root == null) {
            return null;
        }
        sum += root.data;

        if (sum == target && root.left == null && root.right == null) {
            return root;
        }

        Node leftResult = helper(root.left, target, sum);

        if (leftResult!= null) {
            return leftResult;
        }

        return helper(root.right, target, sum);
    }

        public static void main(String[] args) {
        BT20 obj = new BT20();

        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.right = new Node(4);
        root.right.left = new Node(13);
        root.right.right.right = new Node(1);

        obj.pathSum(root,22);
    }
}
