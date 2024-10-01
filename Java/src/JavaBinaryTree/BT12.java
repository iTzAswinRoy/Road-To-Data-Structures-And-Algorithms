package JavaBinaryTree;

//To check if a binary tree is a mirror (symmetric) tree
public class BT12 {
    private Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            this.data = value;
        }

        public boolean mirror(Node root){
            if(root == null){
                return true;
            }
            return mirror(root.left, root.right);

        }

        private boolean mirror(Node nodeLeft, Node nodeRight){
            if(nodeLeft == null && nodeRight == null) {
                return true;
            }
            if(nodeLeft == null || nodeRight == null){
                return false;
            }

            return (nodeLeft.data == nodeRight.data) &&
                    mirror(nodeLeft.left, nodeRight.right) &&
                    mirror(nodeLeft.right, nodeRight.left);
        }
    }

    public static void main(String[] args) {
        BT12 obj = new BT12();


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);


        System.out.println(root.mirror(root));


    }
}
