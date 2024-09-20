package JavaBinaryTree;

// Implement a function to perform postorder traversal of a binary tree (left-right-root) using recursion.
public class BT3 {
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
        if(root == null) {
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

    public void display() {
        display(this.root);
    }

    private void display(Node root){
        String str = "";
        if(root.left != null){
            str += root.left.data;
        } else {
            str += "No left node";
        }
        str += " <= | " + root.data + " | => ";

        if(root.right != null) {
            str += root.right.data;
        } else {
            str += "No right node";
        }

        System.out.println(str);

        if(root.left!= null){
            display(root.left);
        }

        if (root.right != null){
            display(root.right);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);

            postOrder(root.right);

            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BT3 obj = new BT3();

        obj.insert(5);
        obj.insert(2);
        obj.insert(10);
        obj.insert(4);
        obj.insert(1);
        obj.insert(3);

        obj.display();

        obj.postOrder();

    }
}
