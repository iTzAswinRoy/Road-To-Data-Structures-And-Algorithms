package JavaBinaryTree;

// Implement a function to perform pre-order traversal of a binary tree (root-left-right) using recursion.
public class BT2 {
    public Node root = null;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node root) {
        String str = "";

        if (root.left != null) {
            str = str + root.left.data;
        } else {
            str = str + "No left child";
        }

        str = str +" <= | " + root.data + " | => ";

        if(root.right!= null) {
            str = str + root.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str);

        if(root.left != null) {
            display(root.left);
        }

        if(root.right != null) {
            display(root.right);
        }
    }

    public void preOrder() {
        preOrder(this.root);
    }

    private void preOrder(Node root) {
        if(root != null) {

            System.out.print(root.data+" ");

            preOrder(root.left);

            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BT2 obj = new BT2();

        obj.insert(1);
        obj.insert(6);
        obj.insert(3);
        obj.insert(2);
        obj.insert(5);
        obj.insert(4);

        obj.display();

        obj.preOrder();
    }
}
