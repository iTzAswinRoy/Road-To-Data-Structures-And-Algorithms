package JavaBinaryTree;

// Flatten a binary tre into a linked list
public class BT18 {
    private Node root;
    Node head;
    Node tail;
    int size;

    static class Node {
        int data;
        Node left;
        Node right;
        Node next;

        Node(int value) {
            this.data = value;
        }
    }

    public void flattenTree(Node root) {
        Node currentNode = root;

        while (currentNode!= null){
            if(currentNode.left!= null){
                Node temp = currentNode.left;

                while (temp.right != null){
                    temp = temp.right;
                }
                temp.right = currentNode.right;
                currentNode.right = currentNode.left;
                currentNode.left = null;
            }
            currentNode = currentNode.right;
        }
    }

    public void display(Node root){
        Node temp = root;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.right;
        }
    }

    public static void main(String[] args) {
        BT18 obj = new BT18();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);

        obj.flattenTree(root);

        obj.display(root);



    }
}
