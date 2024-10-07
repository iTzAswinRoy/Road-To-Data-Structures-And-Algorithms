package JavaBinaryTree;

// Convert sorted array into binary search tree
public class BT16 {
    private Node root;

    class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int value){
            this.data = value;
        }
    }

    public Node insert(int[] arr){
        return insert(arr, 0, arr.length-1);
    }

    private Node insert(int[] arr, int left, int right){
        if(left > right){
            return null;
        }

        int mid = left + (right-left)/2;

        Node node = new Node(arr[mid]);


        node.left = insert(arr, left, mid-1);
        node.right = insert(arr, mid+1, right);

        return node;

    }

    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args){
        int[] array = {-10, -3, 0, 5, 9};
        BT16 obj = new BT16();

        Node root = obj.insert(array);
        obj.inOrder(root);

        System.out.println();
    }
}
