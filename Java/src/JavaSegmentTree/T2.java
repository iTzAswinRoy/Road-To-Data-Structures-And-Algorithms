package JavaSegmentTree;

import java.util.Arrays;

// Build a segment tree to efficiently perform:
// Update: Modify an element of the array.
// Query: Find the minimum value in a given range [L, R].
// Example:
// Input: arr[] = {1, 3, 2, 7, 9, 11}
// Queries:
//        - Query minimum from index 1 to 4.
//        - Update index 2 to 6.
//        - Query minimum from index 1 to 4.
public class T2 {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;
        int startIndex;
        int endIndex;

        Node(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }

    public void segmentTree(int[] arr) {
        root = segmentTree(arr, 0, arr.length - 1);
    }

    private Node segmentTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        int mid = (start + end) / 2;
        Node newNode = new Node(start, end);

        newNode.left = segmentTree(arr, start, mid);
        newNode.right = segmentTree(arr, mid + 1, end);

        newNode.data = Math.min(newNode.left.data, newNode.right.data);

        return newNode;
    }

    public void queryMin(int start, int end) {
        System.out.println(queryMin(root, start, end));
    }

    private int queryMin(Node root, int start, int end) {
        if (root.startIndex > end || root.endIndex < start) {
            return Integer.MAX_VALUE;
        }


        if (root.startIndex >= start && root.endIndex <= end) {
            return root.data;
        }

        int left = queryMin(root.left, start, end);
        int right = queryMin(root.right, start, end);

        return Math.min(left,right);
    }

    public void update(int index, int value){
        update(root, index, value);
    }

    private int update(Node root, int index, int value) {
        if (index < root.startIndex || index > root.endIndex) {
            return root.data;
        }

        if (index == root.startIndex && index == root.endIndex) {
            root.data = value;
            return root.data;
        }

        // Populating child nodes in the else block to avoid populating nodes in the left node because it contains only one
        int left = update(root.left, index, value);
        int right = update(root.right, index, value);

        root.data =  left + right;

        return root.data;

    }

    public void display(Node root) {
        if(root == null){
            return;
        }

        display(root.left);
        display(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        T2 obj = new T2();

        int[] arr = {1, 3, 2, 7, 9, 11};
        System.out.println(Arrays.toString(arr));

        obj.segmentTree(arr);
        obj.display(obj.root);

        System.out.println();
        obj.queryMin(0,3);

        obj.update(2,6);
        obj.display(obj.root);

        System.out.println();
        obj.queryMin(1,4);
    }
}