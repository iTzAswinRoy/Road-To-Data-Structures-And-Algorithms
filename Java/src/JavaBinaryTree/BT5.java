package JavaBinaryTree;

// Write a function to calculate the height of a binary tree.
public class BT5 {
    Node root = null;

    class Node{
        int data;
        Node left;
        Node right;

        Node (int value){
            this.data = value;
            left = right = null;
        }
    }

    public void insert(int value){
        root = insert(this.root, value);
    }
    private Node insert (Node root, int value){
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

    public int findingHeight(Node root){
        if(root == null){
            return 0;
        } else {

            int leftHeight = findingHeight(root.left);
            int rightHeight = findingHeight(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
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
        BT5 obj = new BT5();

        obj.insert(10);
        obj.insert(12);
        obj.insert(1);
        obj.insert(23);
        obj.insert(34);
        obj.insert(5);

        obj.display();

        System.out.println(obj.findingHeight(obj.root));
    }
}
