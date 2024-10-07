package JavaBinaryTree;

// Max depth of binary tree
public class BT15 {
    private Node root;

    class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int value){
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

    public int depth(Node root){
        if (root == null){
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        BT15 obj = new BT15();

        obj.insert(5);
        obj.insert(3);
        obj.insert(6);
        obj.insert(2);
        obj.insert(4);
        obj.insert(1);

        System.out.println(obj.depth(obj.root));
    }
}
