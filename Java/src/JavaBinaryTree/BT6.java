package JavaBinaryTree;

// Implement a function to determine if one binary tree is a subtree of another binary tree.
public class BT6 {
    Node root = null;
    class Node {
        int data;
        Node left;
        Node right;

        Node (int value) {
            this.data = value;
            left = right = null;
        }
    }

    public void insert(int value){
        root = insert(this.root, value);
    }

    private Node insert(Node root, int value){
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

    public boolean isSub(Node mainTree, Node subTree){
        if(mainTree == null || subTree == null){
            return false;
        }

        if(isEqual(mainTree, subTree)){
            return true;
        }

        return isSub(mainTree.left, subTree) || isSub(mainTree.right, subTree);
    }

    private boolean isEqual(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        return (root1.data == root2.data) && isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
    }


    public static void main(String[] args) {
        BT6 mainTree = new BT6();

        mainTree.insert(10);
        mainTree.insert(1);
        mainTree.insert(15);
        mainTree.insert(8);
        mainTree.insert(20);
        mainTree.insert(3);

        BT6 subtree = new BT6();
        subtree.insert(10);
        subtree.insert(1);
        subtree.insert(15);
        subtree.insert(81);
        subtree.insert(20);
        subtree.insert(3);

        System.out.println(mainTree.isSub(mainTree.root, subtree.root));
    }

}
