package JavaBinaryTree;


// Implement a function to perform in-order traversal of a binary tree (left-root-right) without using recursion.
public class T1 {
    public Node root;

    T1() {
        this.root = null;
    }

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

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
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

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + node.left.data;
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + " <= | " + node.data + " | => ";

        if(node.right != null) {
            str = str + node.right.data;
        } else {
            str = str + "No right child ";
        }

        System.out.println(str);

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    public void inOrder(){
        inOrder(this.root);
    }

    private void inOrder(Node root) {
        if(root!= null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    public static void main(String[] args) {
        T1 obj = new T1();
        obj.insert(150);
        obj.insert(20);
        obj.insert(10);
        obj.insert(30);
        obj.insert(15);
        obj.insert(40);
        obj.insert(50);

        obj.display();

        System.out.println("\nRoot node: "+obj.root.data +"\n");

        System.out.println("In-Order traversal:");
        obj.inOrder();

    }

}
