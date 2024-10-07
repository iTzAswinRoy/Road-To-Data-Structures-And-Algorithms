package JavaBinaryTree;

// Find the diameter of the tree
public class BT13 {
    Node root;
    int diameter = 0;

    class Node {
        Node left;
        Node right;
        int data;

        Node(int value) {
            this.data = value;
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

        if(value< root.data){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public int diameter(Node root){
        diameterOfNode(root);
        return diameter;
    }

    private int diameterOfNode(Node root){
        if(root == null) {
            return 0;
        }
        int left = diameterOfNode(root.left);
        int right = diameterOfNode(root.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        BT13 obj = new BT13();
        obj.insert(9);
        obj.insert(6);
        obj.insert(10);
        obj.insert(5);
        obj.insert(7);
        obj.insert(4);
        obj.insert(8);
        obj.insert(2);
        obj.insert(3);
        obj.insert(12);

        System.out.println(obj.diameter(obj.root));
        System.out.println(obj.diameterOfNode(obj.root));

    }

}
